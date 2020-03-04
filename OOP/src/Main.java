
public class Main 
{

	public static void main(String[] args) 
	{
		Car porsche = new Car();
		Car holden = new Car();  
		//created an objects of type car ^^^^
		//new Car() ==> initialized it
		porsche.setModel("carrera"); //have to initialize porshe using new keyword
		//passed a parameter. one way of 
		//calling the set model method and updating it with the value carrera.
		System.out.println("model is " + porsche.getModel()); //will print "model is carrera"
		
	}

}
