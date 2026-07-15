package com.coforge.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int studentId;
	private String studentName;
	private Address address;
	List<String> subjects;
	Set<String> skills;
	Map<String,Integer> marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address
				+ ", subjects=" + subjects + ", skills=" + skills + ", marks=" + marks + "]";
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public List<String> getSubjects() {
		return subjects;
	}


	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}


	public Set<String> getSkills() {
		return skills;
	}


	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}


	public Map<String, Integer> getMarks() {
		return marks;
	}


	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}


	public Student(int studentId, String studentName, Address address, List<String> subjects, Set<String> skills,
			Map<String, Integer> marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
		this.subjects = subjects;
		this.skills = skills;
		this.marks = marks;
	}

	public void displayStudentDetails() {
		System.out.println("Student Id" +studentId);
		System.out.println("Student name" +studentName);
		System.out.println("Student Address" +address);
		System.out.println("Student subjects" + subjects);
		System.out.println("Student skills" +skills);
		System.out.println("Student marks" +marks);
	}

}
