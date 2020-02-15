package sectionSix;

public class MainOOP 
{

	public static void main(String[] args) 
	{
		//create an object based on Car class
		Car porsche = new Car(); //defined object type car. initialized it. created a new data type prosche based on the template car
		Car holden = new Car();
		System.out.println("model is " + porsche.getModel());
		porsche.setModel("Carrera"); //the obj porche model is a carrera. defined the type
		System.out.println("model is " + porsche.getModel());
	}
	
}
