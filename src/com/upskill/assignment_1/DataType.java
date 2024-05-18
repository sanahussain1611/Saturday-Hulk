package com.upskill.assignment_1;

public class DataType {

	
	public static void main(String[] args) {
		
		int Number1 = 5;
		int Number2 = Number1 * 10;
				System.out.println(Number2);
		
System.out.println("This is Sana");

String Origion = "Pakistani";

System.out.println(Origion);

short a = 12345;
short b = 4321;
int c = a + b;

System.out.println(c);

byte x = 100;
System.out.println(x);

long y = 9876543210923L;
System.out.println(y);

float PracticeFloatNumber = 3.87f;
System.out.println(PracticeFloatNumber);

double PracticeDoubleNumber = 5.78653429;
System.out.println(PracticeDoubleNumber);

int side1 = 5;
int side2 = 7;
int side3 = 11;

System.out.println("perimeter of triangle: " + calculatePerimeter(side1, side2, side3));
	}

	private static int calculatePerimeter(int side1, int side2, int side3) {
		// TODO Auto-generated method stub
		return side1 + side2 + side3;
	}

	int width = 9;
    int length = 13;

//    System.out.println("Perimeter of the rectangle: " + void calculatePerimeter(width, length) + " inches");
//}

public static int calculatePerimeter(int width, int length) {
    return 2 * (width + length);
}

}
