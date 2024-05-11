package com.upskill.java_4;

public class Encapsulation {

	public static void main(String[] args) {
		
		// Encapsulation is used to hide the data using setter and getter method

		Encapsulation obj = new Encapsulation();
		obj.setName("upskill");
		System.out.println(obj.getName());
		System.out.println(obj.getUserName());
	}

	private String name = "upskill";					//Write & Read
	private int ssn = 456321789;						//Write Only
	private String username = "SanaHussain";			//Read Only
	
														//We can not Print ssn because it has write Only programming
														//We can only print username because we have given Read Only access
	
	
	// Setter Method - name								//set the data, Write
	public void setName(String value){
		name = value;
	}
	
	//Getter Method - name								//get the data, Read
	public String getName () {
		return name;
	}
	
	//Setter Method -ssn								//set the data, write
	public void setSSN(int value){						// We only put set Method
		ssn=value;
	}
	
	//Getter Method - username							//get the data, read
	public String getUserName (){
		return username;
			
	}
}

