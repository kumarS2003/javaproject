package com.psoft.java.collections;

import java.util.ArrayList;
import java.util.List;

// Student Class
class Student {
    private int id;
    private String name;
    private String city;

    // Constructor
    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    // Getter for name (used in removeStudent)
    public String getName() {
        return name;
    }

    // To display student details
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
    }
}

// StudentManipulation Class
public class StudentManipulation {

    private List<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Student s) {
        students.add(s);
    }

    // Remove Student by name
    public void removeStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.remove(i);
                System.out.println("Removed: " + name);
                return;
            }
        }
        System.out.println("Student not found: " + name);
    }

    // Show All Students
    public void showStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Main Method
    public static void main(String[] args) {
        StudentManipulation sm = new StudentManipulation();

        sm.addStudent(new Student(1, "Ahamad Bhai", "Nellore"));
        sm.addStudent(new Student(2, "Afroz Ahamad", "Kandukur"));
        sm.addStudent(new Student(3, "Hafeez Bhai", "Nellore"));

        System.out.println("All Students:");
        sm.showStudents();

        sm.removeStudent("Afroz Ahamad");
        System.out.println("\nAfter Deletion:");
        sm.showStudents();
    }
}