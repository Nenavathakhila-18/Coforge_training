package com.coforge.assignment;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @Id
    private int sid;

    private String sname;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "Student_Courses",
        joinColumns = @JoinColumn(name = "sid"),
        inverseJoinColumns = @JoinColumn(name = "cid")
    )
    private Set<Course> courses = new HashSet<>();

    // Default Constructor
    public Student() {
    }

    // Parameterized Constructor
    public Student(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + "]";
    }
}