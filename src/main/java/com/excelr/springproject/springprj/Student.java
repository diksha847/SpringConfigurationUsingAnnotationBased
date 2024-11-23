package com.excelr.springproject.springprj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("std1")
public class Student {
	
	@Value("101")
	private int id;
	@Value("kamla")
    private String name;
	@Value("95")
	private int marks;
	
	
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	

}
