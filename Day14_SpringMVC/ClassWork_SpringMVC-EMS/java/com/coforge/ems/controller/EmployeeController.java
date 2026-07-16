package com.coforge.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired //field Injection
	private EmployeeService service;

	@RequestMapping("home")
	public ModelAndView loadHomePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHome");
		//internally it is servlet forward request(request dispatcher)
		//it returns web-inf/views/employeehomepage.jsp		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "employee",params ="Insert")
	// this automatically creates the bean object and read the values
	public ModelAndView createEmployee(@ModelAttribute Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHome");
		
		String result = "";
		boolean status = service.createEmployee(employee);
		
		if(status) {
			result = "SUCCESS : Employee Object Saved";
		} else {
			result = "FAILED : Employee Object Not Saved";
		}
		
		mv.addObject("result", result);
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "employee",params ="Update")
	public ModelAndView updateEmployee(@ModelAttribute Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHome");
		
		String result = "";
		boolean status = service.updateEmployee(employee);
		
		if(status) {
			result = "SUCCESS : Employee Object Updated";
		} else {
			result = "FAILED : Employee Object Not Updated";
		}
		
		mv.addObject("result", result);
		return mv;
	}
		
		@RequestMapping(method = RequestMethod.POST, value = "employee",params ="Delete")
		public ModelAndView deleteEmployee(@RequestParam int eid) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("EmployeeHome");
			
			String result = "";
			boolean status = service.deleteEmployee(eid);
			
			if(status) {
				result = "SUCCESS : Employee Object Deleted";
			} else {
				result = "FAILED : Employee Object Not Deleted";
			}
			
			mv.addObject("result", result);
			return mv;
	}
		
		@RequestMapping(method = RequestMethod.POST, value = "employee",params ="Find")
		public ModelAndView findEmployee(@RequestParam int eid) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("EmployeeHome");
			
			String result = "";
			Employee employee = service.findEmployee(eid);
			
			if(employee!=null) {
				result = employee.toString();
			} else {
				result = "FAILED : Employee Object Not Found";
			}
			
			mv.addObject("result", result);
			return mv;
	}
	
		@RequestMapping(method = RequestMethod.POST, value = "employee",params ="FindAll")
		public ModelAndView findAllEmployees() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("EmployeeHome");
			
			List <Employee> employees = service.findAllEmployees();
			
			
			mv.addObject("result",employees);
			return mv;
	}

}
