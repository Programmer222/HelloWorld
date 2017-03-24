package com.ucai.bdck.sms;

public class Emp {
	private String name;
	private int id;
	private int sal;
	
	
	public Emp() {
		super();
	}

	public Emp(String name, int id, int sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}
	
	
}
