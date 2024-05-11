package com.upskill.java_2;

public class Loops {
	/*
	 * Types of Loops
	 * 1. For Loops
	 * 2. While Loop
	 * 3. Do While Loop
	 * 4. Infinite Loop
	 */

	public static void main(String[] args) {
		//practiceForLoop ();
		//practiceWhileLoop ();
		//practiceDoWhileLoop ();
		//practiceInfiniteLoop ();
		practiceNestedForLoop();
	}
	
	public static void practiceForLoop (){					// for Loop - do again and again up to upper limit
		
		int i;												// Initialize the Variable
		for (i=1; i<=10; i++){								// Setting Lower Limit, Upper Limit, Increment OR Decrement
			System.out.println ("For Loops Number = " + i);		// Statement
			
		}
	}
	public static void practiceWhileLoop (){				// While Loop - Do again and again until condition match
		int i = 1;											// initial the variable
		while (i<=10){										//Setting Conditions
			System.out.println("While Loop Number =" +i);	//Statement
			i++;											//Increment OR Decrement
		}
	}
	public static void practiceDoWhileLoop (){
													// Do While Loop - Do action then match condition
		int i = 1;										// Initialize the variables
		do {
			System.out.println ("Do While Loop Number =" + i);	// Statement
			i++;												// Increment OR Decrement
			
		} while (i<=10);										// Checking Conditions
		
	}		

	public static void practiceInfiniteLoop (){					// Infinite Loop - Never Ending Loop
		int i;													// Initialize the Variable
		for (i=1; ; i++){										// Setting No upper Limit
			System.out.println ("Infinite Loop Number =" +i);	// Statement
		}
	}
	
	public static void practiceNestedForLoop(){					// Nested Loop - Loop inside another loop
	
	int i;														// Initialize i for loop 1
	int j;														// Initialize j for loop 2
	for (i=1; i<=10; i++){										// first loop for i
		for (j=1; j<=10; j++){									// Second loop for j
			int multiplicationTable = i*j;						// Statement for 
			System.out.print (multiplicationTable + " ");
		}
			System.out.println(" ");
		}
	}
	}
