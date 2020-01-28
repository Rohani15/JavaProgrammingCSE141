package sectionThree;

public class ifThen 
{

	public static void main(String[] args) 
	{
		//IF ELSE STATEMENT 
		boolean isAlien = false; 
		if (isAlien == false)
			System.out.println("is not an alien"); 
		
		//LOGICAL AND OPERATOR
		int topScore = 100;
		if (topScore > 100) // != operator 
		{
			System.out.println("you got the highest score");
		}
		
		int topScoreTwo = 60;
		int secondTop = 54; 
		if (topScoreTwo > secondTop && topScoreTwo < 100)
		{
			System.out.println("greather than 2nd top score and less thab 100");
			
		}
		
		//Ternary Operator
		boolean isCar = false; 
		boolean wasCar = isCar ? true : false; 
		if (wasCar)
		{
			System.out.println("wascar is T"); 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
