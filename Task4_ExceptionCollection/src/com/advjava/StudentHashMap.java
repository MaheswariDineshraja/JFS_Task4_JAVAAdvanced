package com.advjava;

import java.util.HashMap;
import java.util.Scanner;

public class StudentHashMap {
	
		// Class student with data members
		HashMap<String, Integer> hasmap = new HashMap<>();
	    Scanner sc = new Scanner(System.in);
	    private String studentName;
	    private int studentGrade;

	    // add method taking information of student in console
	    public void addStudent(HashMap<String, Integer> hasmap){
	    System.out.print("Enter new Student Name: ");
	    studentName = sc.next();
        System.out.print("Enter new Student Grade: ");
        studentGrade = sc.nextInt();
        // put method of hashmap to add data into attributes
        hasmap.put(studentName, studentGrade);
        System.out.println("New Student added successfully!!");
	    }
	    
	    // remove method to remove a student
	    public void removeStudent(HashMap<String, Integer> hasmap) {
        System.out.print("Enter the Name of Student You want to Remove: ");
        studentName = sc.next();
        	// condition if HashMap (stdMap) contains key(stdName)
        	if (hasmap.containsKey(studentName)) {
        		hasmap.remove(studentName);
        		System.out.println("Student Removed Successfully");
        	} else {
        		System.out.println("Student Not Found!!!");
        	}
	    }
	    
	    
	    // display method to display grade of stduent through key
	    public void displayStudent(HashMap<String, Integer> hasmap) {
	        System.out.println("Enter the Name of Student You want to View");
	        studentName = sc.next();
	        // condition if key(stdName) exist in HashMap(stdMap)
	        if (hasmap.containsKey(studentName)) {
	        	int stdGrade = hasmap.get(studentName);
	            System.out.println("Here the Grade of the Student");
	            System.out.println("Student Grade : " + stdGrade);
	        } else {
	            System.out.println("Student not Exist!!!");
	        }
	    }
	

}
