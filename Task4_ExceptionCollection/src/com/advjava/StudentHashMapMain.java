package com.advjava;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class StudentHashMapMain {

	public static void main(String[] args) {
		
		//HashMap
		HashMap<String , Integer> hasmap=new HashMap<String, Integer>();
		//User input for name and grade
		Scanner sc = new Scanner(System.in);
	    String studentName;
	    int studentGrade;		

	    System.out.println("Keyin the Number of Students");
	    int stdNum = sc.nextInt();
	    for (int i = 0; i < stdNum; i++) {
	      System.out.print("Student Name: ");
	      studentName = sc.next();
	      System.out.print("Student Grade: ");
	      studentGrade = sc.nextInt();

	      hasmap.put(studentName, studentGrade);
	    }
	    
	    StudentHashMap studenthasmap = new StudentHashMap();
	    // Select to choose a method to perform
	    int selection;
	    do {
	      System.out.println("\n1. Add Student");
	      System.out.println("2. Remove Student");
	      System.out.println("3. Display Student");
	      System.out.println("4. Exit");
	      System.out.print("Enter your choice: ");
	      selection = sc.nextInt();
	      sc.nextLine(); 

	      switch (selection) {
	        case 1:
	        	studenthasmap.addStudent(hasmap);	        	
	          break;
	        case 2:
	        	studenthasmap.removeStudent(hasmap);
	          break;
	        case 3:
	        	studenthasmap.displayStudent(hasmap);
	          break;
	        case 4:
	          break;
	        default:
	          System.out.println("Invalid Choice! Please try again.");
	      }
	   
	      for(Entry<String, Integer> m:hasmap.entrySet()) {
	    	  studentName = m.getKey();
	    	  studentGrade = m.getValue();
	        System.out.println("Name: " + studentName + "," + "Grade: " + studentGrade);
	      }
	    } while (selection != 4);

	    sc.close(); 

	}

}
