package sectionFour;

public class codeblocksAndIfThenElseStatements 
{

	public static void main(String[] args) 
	{
		boolean gameOver = true;
		int score = 5000;
		int levelComp = 5;
		int bonus = 100;
		
		if (score < 5000) 
		{
			System.out.println("score was 5000");
		}
		else if (score < 1000)
		{
			System.out.println("score < 5000 but > 1000");
		}
		else
		{
			System.out.println("got here");
		}
		
		
		
		if (gameOver) // same as gameOver == true; 
		{
			int finalScore = score + (levelComp * bonus);
			System.out.println("final score == " + finalScore);
		}
		

	}

}












