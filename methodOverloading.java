package sectionFour;

public class methodOverloading 
{

	public static void main(String[] args) 
	{
		int newScore = calcScore("ro ", 500); 
		System.out.println("new score is " + newScore);
		calcScore(75); // calling the second method
		calcScore("Ro", 40); // calling the first method
		calcScore(); // calling the third method
		
		double cmm = calcFeetAndInchesToCentimeters(6, 0);
		if (cmm < 0.0)
		{
			System.out.println("Invalid Parameters");
		}
		
		calcFeetAndInchesToCentimeters(157);

		
	}
	
	//using same method name with diff parameters
	
	public static int calcScore(String playerName, int score)
	{
		System.out.println("player " + playerName + " scored " + score);
		return score * 1000;  
	}
	
	public static int calcScore(int score)
	{
		System.out.println("unnamed player "  + " scored " + score);
		return score * 1000;  
	}	

	public static int calcScore()
	{
		System.out.println("no player name or score");
		return 0;  
	}
	
	//CHALLENGE=====================================================
	public static double calcFeetAndInchesToCentimeters(double feet, double inch)
	{
		if((feet < 0) || (inch < 0) || (inch > 12))
		{
			return -1; 
		}
		double cm = (feet * 12) * 2.45;
		cm += inch * 2.54; //cm == centimeters 
		System.out.println(feet + " feet " + inch + " inch " + cm + " cm");
		return 0; 
		
	}
	
	public static double calcFeetAndInchesToCentimeters(double inch)
	{
		if(inch >= 0)
		{
			return (inch / 12); 
		}
		double feet = (int)(inch / 12); 
		double remaingingInches = (int)(inch % 12); 
		System.out.println(inch + " inches " + feet + " feet " + remaingingInches + " reminaing inches");
		return calcFeetAndInchesToCentimeters(feet, remaingingInches);
		//^^^^^returned and called the function at the same time.
	
		
	}
	
	

}
























