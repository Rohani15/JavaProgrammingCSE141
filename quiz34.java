package sectionSix;

public class quiz34 //complex number
{
	private double real;
    private double imaginary; 
    
    public double getReal() 
    {
		return real;
	}
	public void setReal(double real) 
	{
		this.real = real;
	}
	public double getImaginary() 
	{
		return imaginary;
	}
	public void setImaginary(double imaginary) 
	{
		this.imaginary = imaginary;
	}
	
	public void add(double real, double imagianry)
	{
	   this.real += real;
	   this.imaginary += imaginary;	
	}
	//It needs to add the ComplexNumber 
	//parameter to the corresponding instance variables.
	public void add(quiz34 number)
	{
        this.real += number.real;
        this.imaginary += number.imaginary;

	}

    public void subtract (double real, double imaginary)
    {
        this.real -= real;
        this.imaginary -= imaginary;
    }
 
    public void subtract (quiz34 number)
    {
        this.real -= number.real;
        this.imaginary -= number.imaginary;
    } 
    

}
