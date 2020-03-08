package section7;

public class Case 
{
	private String model; 
	private String manufac; 
	private String powerSupply;
	private Dimensions dimensions; //composiiton
	
	public Case(String model, String manufac, String powerSupply, Dimensions dimensions) 
	{
		super();
		this.model = model;
		this.manufac = manufac;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}
	
	public void pressPowerButton()
	{
		System.out.println("Power button pressed");
	}
	public String getModel() 
	{
		return model;
	}
	public void setModel(String model) 
	{
		this.model = model;
	}
	public String getManufac() 
	{
		return manufac;
	}
	public void setManufac(String manufac) 
	{
		this.manufac = manufac;
	}
	public String getPowerSupply()
	{
		return powerSupply;
	}
	public void setPowerSupply(String powerSupply) 
	{
		this.powerSupply = powerSupply;
	}
	public Dimensions getDimensions() 
	{
		return dimensions;
	}
	public void setDimensions(Dimensions dimensions) 
	{
		this.dimensions = dimensions;
	}
	
	
}
