package com.psoft.java.HashMap;

public class Students {
	String name;
	int id;
    String city;
    
	public Students(String name, int id , String city) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	

}
