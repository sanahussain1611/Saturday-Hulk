package com.upskill.java_6;

public class Exception_TryCatchFinale {

	public static void main(String[] args) {
	
		//Specific Built-in Exception - NumberFormatException
//		try{
//			int num = Integer.parseInt(arg0)
//		}
//		
//		
		//User-Defined Exception
		
		try{
			throw new myException("Test");
		} catch (myException e){
			e.printStackTrace();
			System.out.println("This is User-Defined Exception Method ! ");
		}

	}

}
