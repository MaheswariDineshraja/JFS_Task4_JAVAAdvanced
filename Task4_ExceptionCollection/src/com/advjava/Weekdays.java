package com.advjava;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
	
		//store name of weekdays in an array
		String[] Days = {"Sunday", "Monday","Tuesday","Wednesday", "Thursday", "Friday", "Saturday"};
		
		//Take position from user
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Day Position from 0 to 6: ");
        int day = sc.nextInt();
        
      //try-catch block to handle array index bound of exceptions
        try
        {
        	if(day >=0 && day <= 6)
        	{
        		System.out.println("Day:->" + Days[day]);
        	}
        	else
        	{
        		throw new IndexOutOfBoundsException("Index entered is in out of range !!!");
        	}
            
        }
        catch(IndexOutOfBoundsException exception)
        {
            //System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
        finally
        {
        	sc.close();
        }

	}

}
