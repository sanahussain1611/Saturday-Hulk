package com.upskill.java_1;

public class MethodType {
	/* Types of Method
	1. Void Method
	2. Static Method
	3. Return Type
 */
	
	public static int hourlyincome = 65;
	
	public static void main(String[] args) {
		MethodType MyObj = new MethodType ();
		MyObj.annualIncomeVoid();
		
		System.out.println("My Monthly Income =" + MyObj.monthlyIncomeReturn());
		weeklyIncomeStatic();
		BooleanStatic();
	}
	private static void BooleanStatic() {
		// TODO Auto-generated method stub
		
	}
	// Void Method
		public void annualIncomeVoid() {
			int calculateAnnualIncome = hourlyincome * 2000;
			System.out.println ("My Annual Income = "+ calculateAnnualIncome);
		}

		// Return Type Method
public int monthlyIncomeReturn (){
	int calculateMonthlyIncome = hourlyincome * 180;
	return calculateMonthlyIncome;
	}

public String state () {
	return "NY";}
	// Static Method
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyincome * 40;
		System.out.println("My Weekly Income =" + calculateWeeklyIncome);
	}
public static boolean rain(){
	return false;
}

}
