package com.example.demospringrestapi.entity;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//@Table(name= "student")
public class Student {

	//@Id
	//@Column
	private long id;
	//@Column
	private String name;
	//@Column
	private long marks;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMarks() {
		return marks;
	}
	public void setMarks(long marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
