package com.upskill.java_1;

public class AccessModifier {
	
	public String name = "Sana";
	private int age = 25;
	protected int ssn = 123456;
	String address = "East Elmhurst";
	

	// public - Any class can access
	// private - Only same class can access
	// protected - classes in the same package and subclass
	// default - classes in same package can access 


//git change
public void git(){
	System.out.println("Git Branching");
}
}