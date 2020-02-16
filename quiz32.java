package sectionSix;

public class quiz32 
{
	private int x;
	private int y;
	
	public quiz32()
	{
		this(0,0); 
	}
	public quiz32(int x, int y)
	{
		this.x = x;
		this.y = y; 
	}

	public int getX() 
	{
		return x;
	}
	public void setX(int x) 
	{
		this.x = x;
	}
	public int getY() 
	{
		return y;
	}
	public void setY(int y) 
	{
		this.y = y;
	}
	
	public double distanceWithoutAnyParameters()
	{
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
	}

}











