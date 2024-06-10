package com.advjava;

import java.util.Scanner;

public class Voter extends Exception {
	
	//Data members of class Voter
	private int voterID;
	private String voterName;
	private int voterAge;
	
	//default constructor of class Voter
	public Voter() {
		
	}
	
	//parameterized constructor of class Voter
	public Voter(int voterid, String name, int voterage, String message) {
		super(message);
		this.voterID = voterid;
		this.voterName = name;
		this.voterAge = voterage;
		
	}
	
	public void AgeValidation() throws Voter {	
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter your Voter Id: ");
	    voterID =sc.nextInt();
	    System.out.print("Enter your Name: ");
	    voterName = sc.next();
	    System.out.print("Enter your Age: ");
	    voterAge = sc.nextInt();
				
		if(voterAge<18)
        {
            throw new Voter(voterID,voterName,voterAge,"Not eligible for casting vote");
        }
        else
        {
            System.out.println("Eligible for voting");
        }
	}


}
