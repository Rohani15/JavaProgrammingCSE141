package sectionThree;

public class Introduction
{
	public static void main(String[] args)
	{
		System.out.println("Wassup");
		
		int myFirstNumber = 5; // int
		int mySecondNumba = 12;
		int myThirdNumba = 6; 
		int myTotal = myFirstNumber + mySecondNumba + myThirdNumba;
		System.out.println(myTotal);
		
		//--------------------------------------------------
		//primitive types in JAVA
		//boolean, byte, char, short, int, long, float, double
		
		int myValue = 10000;
		
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxValue = Integer.MAX_VALUE; 
		
		System.out.println("Int MIN value = "
				+ myMinIntValue);
		System.out.println("Int MAX value = "
				+ myMaxValue); 
		
		int myMaxIntTest = 2_147_483_647; 
		
		//casting in java
		
		int myMinByteValue = 0;
		byte myNewByteValue = (byte)(myMinByteValue / 2); 
		
		byte newByte = 10; 
		short newShort = 20; 
		int newInt = 50; 
		long newLong = 50000 + 10 * (newByte + newShort + newInt); 
		System.out.println(newLong); 
		
		//floating point Numbers 
		
	}
}








