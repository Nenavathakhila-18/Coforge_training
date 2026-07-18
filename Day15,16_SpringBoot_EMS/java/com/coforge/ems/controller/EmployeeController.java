package com.coforge.ems.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;

//@RestController is used to create RESTful web services that return data directly 
//in the HTTP response body. @RestController 
//is a combination of @Controller and @ResponseBody.

@RestController
@RequestMapping("/api/v1/ems") // version of ems
public class EmployeeController {
	// postman->front controller(dispatcher servlet)->actual controller

	// @Autowired // field injection
	private EmployeeService service;
	private Environment environment;

	@Autowired // construction injection
	public EmployeeController(EmployeeService service, Environment environment) {
		super();
		this.service = service;
		this.environment = environment;
	}

	@PostMapping("/employees")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {
		ResponseEntity<String> responseEntity = null;

		try {
			boolean status = service.saveEmployee(employee);
			if (status == true)
				responseEntity = new ResponseEntity<>(environment.getProperty("ems.save.success"), HttpStatus.CREATED);
		} catch (InvalidEmployeeObjectException e) {
			responseEntity = new ResponseEntity<>(e.toString(), HttpStatus.CREATED);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(environment.getRequiredProperty("ems.db.failed"),
					HttpStatus.BAD_REQUEST);
		}
		return responseEntity;
	}

	@PutMapping("/employees/{eid}")
	public ResponseEntity<String> updateEmployee(@PathVariable("eid") int eid, @RequestBody Employee employee) {
		ResponseEntity<String> responseEntity = null;

		try {
			boolean status = service.updateEmployee(eid, employee);

			if (status) {
				responseEntity = new ResponseEntity<>(environment.getProperty("ems.update.success"), HttpStatus.OK);
			}

		} catch (EmployeeNotFoundException e) {
			responseEntity = new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);
		} catch (InvalidEmployeeObjectException e) {
			responseEntity = new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);

		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(environment.getProperty("ems.db.failed"), HttpStatus.BAD_REQUEST);
		}

		return responseEntity;
	}

	@DeleteMapping("/employees/{eid}")
	public ResponseEntity<String> deleteByEid(@PathVariable("eid") int eid) {
		ResponseEntity<String> responseEntity = null;

		try {
			boolean status = service.deleteByEid(eid);

			if (status) {
				responseEntity = new ResponseEntity<>(environment.getProperty("ems.delete.success"), HttpStatus.OK);
			}

		} catch (InvalidEmployeeObjectException e) {
			responseEntity = new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);

		} catch (EmployeeNotFoundException e) {
			responseEntity = new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);

		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(environment.getProperty("ems.db.failed"), HttpStatus.BAD_REQUEST);
		}

		return responseEntity;
	}

	@GetMapping("/employees/{eid}")
	public ResponseEntity<?> findByEid(@PathVariable("eid") int eid) {
		ResponseEntity<?> responseEntity = null;

		try {
			Optional<Employee> status = service.findByEid(eid);

			if (!status.isEmpty()) {
				responseEntity = new ResponseEntity<>(status.get(), HttpStatus.OK);
			}

		} catch (InvalidEmployeeObjectException e) {
			responseEntity = new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);

		} catch (EmployeeNotFoundException e) {
			responseEntity = new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);

		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(environment.getProperty("ems.db.failed"), HttpStatus.BAD_REQUEST);
		}

		return responseEntity;
	}

	@GetMapping("/employees")
	public ResponseEntity<?> findAllEmployees() throws InvalidEmployeeObjectException, EmployeeNotFoundException {
		ResponseEntity<?> responseEntity = null;

		List<Employee> employees = service.findAllEmployees();

		responseEntity = new ResponseEntity<>(employees, HttpStatus.OK);

		return responseEntity;
	}

	@GetMapping("/employees/ename/{ename}")
	public ResponseEntity<?> findByEname(@PathVariable("ename") String ename) {
		ResponseEntity<?> responseEntity = null;

		try {
			List<Employee> employees = service.findByEname(ename);

			responseEntity = new ResponseEntity<>(employees, HttpStatus.OK);

		} catch (InvalidEmployeeObjectException e) {
			responseEntity = new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);

		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(environment.getProperty("ems.db.failed"), HttpStatus.BAD_REQUEST);
		}

		return responseEntity;
	}

	@DeleteMapping("/employees/ename/{ename}")
	public ResponseEntity<?> deleteByEname(@PathVariable("ename") String ename) throws InvalidEmployeeObjectException {

		ResponseEntity<?> responseEntity = null;

		try {
			boolean status = service.deleteByEname(ename);

			if (status) {
				responseEntity = new ResponseEntity<>(environment.getProperty("ems.delete.success"), HttpStatus.OK);
			}

		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(environment.getProperty("ems.db.failed"), HttpStatus.BAD_REQUEST);
		}

		return responseEntity;
	}

	@GetMapping("/employees/eids")
	public ResponseEntity<?> getEidsList() {

		ResponseEntity<?> responseEntity = null;

		try {
			List<Integer> eids = service.getEidsList();

			responseEntity = new ResponseEntity<>(eids, HttpStatus.OK);

		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(environment.getProperty("ems.db.failed"), HttpStatus.BAD_REQUEST);
		}

		return responseEntity;
	}
	
	@GetMapping("/employees/info")
	public ResponseEntity<?> getInfo() {

		ResponseEntity<?> responseEntity = null;

		try {
			String info = service.getInfo();

			responseEntity = new ResponseEntity<>(info, HttpStatus.OK);

		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(environment.getProperty("ems.db.failed"), HttpStatus.BAD_REQUEST);
		}

		return responseEntity;
	}

}
