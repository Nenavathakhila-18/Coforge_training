package com.coforge.config;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.model.Address;
import com.coforge.model.Student;

@Configuration
public class BeanConfiguration {
	@Bean(name = "address1")
	public Address getAddress() {
		Address address = new Address();
		address.setCity("city-1");
		address.setState("state-1");
		return address;		
	}
	
	@Bean(name = "student1")
	public Student getStudent() {
		Student student = new Student();
		student.setStudentId(101);
		student.setStudentName("Rahul Sharma");
		student.setAddress(getAddress());
		
		//list
		student.setSubjects(Arrays.asList("java","springcore","Hibernate","Mysql","React"));
		
		//set
		Set<String>skills = new HashSet<>();
		skills.add("communication skills");
		skills.add("Problem solving");
		skills.add("Team work");
		skills.add("Java");
		student.setSkills(skills);
		
		//map
		Map<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("java", 95);
		marks.put("springcore", 90);
		marks.put("hibernate", 88);
		marks.put("Mysql", 92);
		marks.put("react", 85);
		student.setMarks(marks);
		
		return student;
		
	}
}
