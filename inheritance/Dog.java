package inheritance;

public class Dog extends Animal 
{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) 
    {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() //something qunique to a dog 
    {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() 
    {
        System.out.println("Dog.eat() called");
        chew();
        super.eat(); // called the super equivalent of that class
    }
    
    public void walks()
    {
    		System.out.println("dog,walk(): calles");
    		super.move(5); //only execute the move method in the super class
    }
    
    public void run()
    {
    		System.out.println("dog.run(): called");
    		move(10); 
    }
    
    public void moveLegs(int speed)
    {
    	System.out.println("dog.moveLegs() called");
    }

	@Override
	public void move(int speed) 
	{
		System.out.println("Dog.move() called");
		moveLegs(speed);
		// TODO Auto-generated method stub
		super.move(speed);
	}
    
    
    
}








