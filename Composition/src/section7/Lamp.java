package section7;

public class Lamp 
{
	private String style;
	private boolean battery;
	private int gloRating;
	public Lamp(String style, boolean battery, int gloRating) 
	{
	
		super();
		this.style = style;
		this.battery = battery;
		this.gloRating = gloRating;
	}
	
	public void turnOn()
	{
		System.out.println("Lamp ==> turned on");
	}
	
	public String getStyle() 
	{
		return style;
	}
	public boolean isBattery() 
	{
		return battery;
	}
	public int getGloRating() 
	{
		return gloRating;
	}
	
	
	
	
}
