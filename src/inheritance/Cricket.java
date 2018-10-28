package inheritance;

public class Cricket extends Insect{
	
	int length;
	
	public Cricket(int cage,int clength)
	{
		super(cage, 4);
		length=clength;
		System.out.println("length of cricket: "+length );
		
	}
	
	public void says()
	{
		System.out.println("Cricket says...");
	}
	
	public void jump()
	{
		System.out.println("Spider jumps..");
	}

}
