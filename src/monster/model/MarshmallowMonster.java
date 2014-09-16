package monster.model;

public class MarshmallowMonster 
{

	//Declaration Section
	private String name;
	private double hairCount;
	private boolean hasBellyButton;
	private int numberOfNoses;
	private int eyeCount;
	private double numberOfLegs;
	private int armCount;
	
	
	public MarshmallowMonster()
	{
		
	}
	
	public MarshmallowMonster(String name, double numberOfLegs )
	{
		this.name = name;
		this.numberOfLegs = numberOfLegs;
	}

	public String getName()
	{
		return name;
	}
	
	public double getHairCount()
	{
		return hairCount;
	}
	
	public boolean gethasBellyButton()
	{
		return hasBellyButton;
	}
	
	public int getNumberOfNoses()
	{
		return numberOfNoses;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public double getNumberOfLegs()
	{
		return numberOfLegs;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
}