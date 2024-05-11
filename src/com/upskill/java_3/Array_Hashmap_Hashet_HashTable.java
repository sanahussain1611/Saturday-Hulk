package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashet_HashTable {

	public static void main(String[] args) {
		
		
		int age = 25;											// variable
		int [] ageHulk = new int [] {25, 30 ,35, 38, 43};		// Array
		
		// Array index  		[0] [1] [3] [4] [5]
		
//		System.out.println("Student Age : " + ageHulk [3]);
//		System.out.println("Total Students :" + ageHulk.length);
//		
//		
//		String [] NameHulk = new String [] {"rizwan", "Sana", "Sohaib", "Saima", "Redwan"};
//		
//		System.out.println("Student Age : " + NameHulk [3]);
//		System.out.println("Total Students :" + NameHulk.length);
//		
//		// Multidimential Array
//		
//		int [][] ageHulk2D = {{25, 30 ,35, 38, 43},		//[0][0] [0][1] [0][2]
//							{23, 32, 38, 27}};			//[1][0] [1][1] [1][3]
//		System.out.println ("Student Age 2D :" + ageHulk2D [1][3]);
//		}
	
	// Hashmap store multiple data using key value pair, implementation of map interface
	
	HashMap <String, Integer> Student = new HashMap<String, Integer> ();
	
	Student.put("Redwan", 27);
	Student.put("Sana", 38);
	Student.put ("Saima", 25);
	Student.put ("Muazzam", 29);
	
	System.out.println("HashMap Student Age :" + Student.get ("Sana"));
	
	HashMap <String, String> Residence = new HashMap<String, String> ();
	
	Residence.put("Pakistan", "ISB");
	Residence.put("India", "DLH");
	Residence.put("Bangladesh", "DHK");
	
	System.out.println("HashMap Residence :" + Residence.get ("India"));
	
	
	
	// HashTable store multiple data using Key-value pair, No duplicate, also is synchronized (only one Thread can be modified)
	
	Hashtable <String, String> Region = new Hashtable<String, String> ();
	
	Region.put("Pakistan", "ISB");
	Region.put("India", "DLH");
	Region.put("Bangladesh", "DHK");
	
	System.out.println("HashMap Region :" + Region.get ("India"));
	
	// Hashset store unordered collection containing unique value, implementation of set interface
	
	HashSet<String> car = new HashSet <String> ();
	
	
	car.add("Audi");
	car.add("BMW");
	car.add("Tesla");
	car.add("Range Rover");
	
	System.out.println("Car :" + car);
	
	
}
}