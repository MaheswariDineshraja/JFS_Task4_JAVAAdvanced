package com.advjava;

public class Student {
	
	// Data Members of Class Student.
    private int rollno;    
    private String name;
    private int age;
    private String course;
    
    // Default Constructor of Class Student.
    public Student() {
        super();
    }
    
 
	// Parameterized Constructor of Class Student
	public Student(int rollno,String name,int age,String course)
	{
		super();
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		this.course=course;
	}
	
	//user defined Exception - age not within range
	class AgeException extends Exception {
        public AgeException(String message) {
            super(message);
        }
    }
	
	// User Defined Exception - name not valid
    class NameException extends Exception{
    	NameException(String message){
            super(message);
        }
    }
	
	public void exceptionshow() throws AgeException, NameException {
		
		if(age <= 15 || age >= 21)
		{
			throw new AgeException("AgeNotWithinRangeException");
		}
		
		for(char c: name.toCharArray())
		{
			if(!Character.isLetter(c))
			{
				throw new NameException("NameNotValidException");
			}			
		}
	}	
	

}
