
public class Car 
{
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	
	public int getDoors() 
	{
		return doors;
	}
	public void setDoors(int doors) 
	{
		this.doors = doors;
	}
	public int getWheels() 
	{
		return wheels;
	}
	public void setWheels(int wheels) 
	{
		this.wheels = wheels;
	}
	public String getModel() 
	{
		return model;
	}
	public void setModel(String model) 
	{
		//only gonna accept a type carrera and holden
		String validModel = model.toLowerCase(); 
		if(validModel.equals("carrera") || validModel.equals("holden"))
		{
			this.model = model;
		}
		else
		{
			this.model = "unknown";

		}
		//if the model equals carrera or holden, then we can assign the value^^
	}
	public String getEngine() 
	{
		return engine;
	}
	public void setEngine(String engine) 
	{
		this.engine = engine;
	}
	public String getColor() 
	{
		return color;
	}
	public void setColor(String color) 
	{
		this.color = color;
	}
	

}
