package com.psoft.java.HashMap;

public class Employes {
	String name;
	int id;
    String city;
    
	public Employes(String name, int id, String city) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employes [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
  
}
