package com.advjava;

import java.util.Scanner;
import java.util.Stack;

public class Collectionstack {
	
	// Pushing element onto the stack
    public int pushStack(Stack collstack,  int element) {
    	collstack.push(element);
		System.out.println("Element Added");
		return element;
        
    }
    
    //Popping elements from the stack
    public void popStack(Stack collstack) {
    	collstack.pop();
    	System.out.println("Element Removed");
    	}
    	public void displayinfo(Stack collstack) {
    	int size=collstack.size();
    	System.out.print("\nThe elements in Stack are :\n");
    	for(int i=0;i<size;i++) {
    		System.out.print(collstack.get(i)+" ");
    		}
    	}    
    
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
	    Stack<Integer> stc = new Stack<>();
	    
		// Object of main class
        Collectionstack collstack = new Collectionstack();            
        collstack.pushStack(stc,1);
        collstack.pushStack(stc,2);
        collstack.pushStack(stc,3);
        collstack.pushStack(stc,4);
        collstack.pushStack(stc,5);    	
        collstack.displayinfo(stc);        
        collstack.popStack(stc);
        collstack.popStack(stc);

        collstack.displayinfo(stc);      

	}
}
