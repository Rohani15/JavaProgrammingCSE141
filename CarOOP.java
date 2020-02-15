package sectionSix;

public class CarOOP //public is a access modifier ==> public is unrestricted access to the class
{
	//characteristics of a car
	//defined 5 fields
	private int doors; 
	private int wheels;
	private String model; 
	private String engine;
	private String color; 
	
	//create an object from this class. 
	
	//Create a method. allow it to update the model
	public void setModel(String model) //SETTER
	{
		String validModel = model.toLowerCase(); // only accept lower case input
		//test to accept for this method are gonna be a type porsche and holden
		if((validModel.equals("Carrera")) || (validModel.equals("commodore")) )
		{
			this.model = model; 
		}
		else 
		{
			this.model = "unknown"; 
		}
		
	}
	
	public String getModel() //GETTER
	{
		return this.model;  
	}
	
}
