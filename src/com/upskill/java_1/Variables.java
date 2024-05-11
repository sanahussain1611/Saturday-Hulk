package com.upskill.java_1;

public class Variables {
	
	public String country  = "USA";
	
	public static String region  = "North America";
	
	// Variables in Java
	// Instance OR global variable - Variable declared in Class level, outside method
	// Local Variable - Variable declared in methods
	// Static Variable - Variable belong to class and don't required creating object
	// Method parameter - Variable used as method parameter 
	

	public static void main(String[] args) {
		ny("Kings");
		nj("Essex");
		ct("Fairfield");
		
		Variables MyObj = new Variables ();		
		
		System.out.println(MyObj.country);
		
		System.out.println(region);
	}
public static void ny(String county){
	String city = "Queens";
	System.out.println(city);
	System.out.println (county);
}
public static void nj(String county){
	String city = "Bloomfield";
	System.out.println(city);
	
	String myCounty = county;
	System.out.println(myCounty);
}

public static void ct(String county){
	String city = "Hartford";
	System.out.println(city);
	System.out.println(county);
}
}
