package sectionSix;

public class quiz33 //class floor
{
	private double length;
	private double width;
	
	public quiz33()
	{
		//return(0,0); 
	}
	
	public quiz33(double width, double length)
	{
		if(width < 0) this.width = 0; 
		if(length < 0) this.length = 0; 
		this.width = width;
		this.length = length; 
	}
	
	public double getLength() 
	{
		return length;
	}
	public void setLength(double length) 
	{
		this.length = length;
	}
	public double getWidth() 
	{
		return width;
	}
	public void setWidth(double width) 
	{
		this.width = width;
	} 
	
	public double getArea()
	{
		return this.width * this.length; 
	}
	


}










