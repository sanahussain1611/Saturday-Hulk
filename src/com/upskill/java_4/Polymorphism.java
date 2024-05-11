package com.upskill.java_4;

import com.upskill.java_1.*;

public class Polymorphism extends MethodType{
	
	/* Polymorphism is the ability of an object to take on many forms
	 * -Method Overloading (compile time polymorphism/static binding) same method name with different signature to overload
	 * -Method Overriding (Runtime polymorphism/dynamic binding) same method name from parent class to override
	 */

	public static void main(String[] args) {

		Polymorphism obj = new Polymorphism ();
		obj.annualIncomeVoid();
		
		
		car();
		car("Red");
		car("Red" , 4);
		car("Red" , 4 , 5);
		
	}
		
		//Method Overloading (compile time polymorphism/static binding)
		//Same method with different signature
	
		// Method Overriding (Runtime polymorphism/dynamic binding
		// Same method from parent class to override
		
	public void annualIncomeVoid(){
		int rentalIncome = 25000;
		int crypto = 20000;
		int business = 25000;
		int calculateAnnualIncome = hourlyincome * 2000 + rentalIncome + crypto + business;
		System.out.println ("My Annual Income = " + calculateAnnualIncome);
		
	}
		
		public static void car(){
			System.out.println ("My car is Tesla");
			
		}
		
		public static void car(String color){
		System.out.println("My car is Tesla, color is " + color);
			
		}
		
		public static void car(String color, int door){
			System.out.println("My car is Tesla, color is " + color + " it has door "+ door);
		}
	
	public static void car(String color, int door, int Seats){
		System.out.println("My car is Tesla, color is " + color + " it has door "+ door + " it has Seats " + Seats);
	}

}
