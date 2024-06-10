package com.advjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VoterMain {

	public static void main(String[] args) throws Exception {
		// Voter class object 		
		Voter voter=new Voter();
        
		//try-catch block to handle exceptions
        try
        {
            voter.AgeValidation();
        }
        catch(Exception exception)
        {
            System.out.println(exception.getMessage());
        }


	}

}
