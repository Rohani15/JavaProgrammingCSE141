package sectionFour;

public class quis2Part2 
{

	public static void main(String[] args) 
	{
		printMegaBytesAndKiloBytes(2500); 

	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes)
	{
		int mb = 1042; 
		if (kiloBytes < 0)
		{
			System.out.println("invalid");
		}
		else
		{
			System.out.println(kiloBytes + " KB = " + 
					(kiloBytes/mb) + " MB " + " and " + (kiloBytes % mb) + " KB ");   
		}
		//return 0; 
	}

}
