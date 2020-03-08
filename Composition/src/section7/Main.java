package section7;

public class Main 
{

	public static void main(String[] args) 
	{
		Dimensions dimensions = new Dimensions(20, 20, 5); 
		Case theCase = new Case("123", "Dell", "248", dimensions); 
		
		Monitor theMonitor = new Monitor("27 inch based", "Acer", 27, new Resolution(2540, 1140)); 
		
		Motherboard themotherboard  = new Motherboard("BJ-200", "Asus", 4, 6, "v2-44"); 
		
		PC thePC = new PC(theCase, theMonitor, themotherboard); 
		//thePC.getMonitor().drawPixelAt(1500, 1200, "red");
		//thePC.getMotherboard().loadProgram("Windows 1.0");
		//thePC.getTheCase().pressPowerButton();
		thePC.powerUp();
		
		Wall wall1 = new Wall("West"); 
		Wall wall2 = new Wall("East"); 
		Wall wall3 = new Wall("South"); 
		Wall wall4 = new Wall("North"); 
		
		Ceiling ceiling = new Ceiling(12, 55); 
		
		Bed bed = new Bed("Modern", 4, 3, 2, 1); 
		
		Lamp lamp = new Lamp("Classic", false, 75);
		
		Room room = new Room("Tims room", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

		bed.make();
		
		room.getLamp().turnOn();
		
	}

}
