package com.tony.model;


public class Employee {
	//pojo	Plain Ordinary Java Object
	private int id;
	private String name;
	private String code;
	
	public Employee() {
		super();
	}
	public Employee(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}
	public Employee(int id, String name, String code) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
