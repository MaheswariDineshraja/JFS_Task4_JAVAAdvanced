package com.advjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentMain {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader bufferedReader=new  BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter roll,age,name,course");
		int rollno=Integer.parseInt(bufferedReader.readLine());
		int age=Integer.parseInt(bufferedReader.readLine());        
        String name=bufferedReader.readLine();
        String course=bufferedReader.readLine();
        //Student class
        Student student=new Student(rollno,name,age,course);
        
        // try-catch block to handle exception
        try
        {
        	student.exceptionshow();
        }
        catch (Exception exception)
        {
        	System.out.println(exception.getMessage());
        }

	}

}
