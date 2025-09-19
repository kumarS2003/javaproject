package com.psoft.java.collections;

public class Students implements Comparable<Students> {
	
	private String name;
	private String collage;
	private int age;
	private int marks;
	
	public Students (String name, String collage, int age, int marks) {
		
		this.name = name;
		this.collage = collage;
		this.age = age;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", collage=" + collage + ", age=" + age + ", marks=" + marks + "]";
	}
	 
	public int compareTo(Students other) {
		return this.name.compareTo(other.name);
	}

}
