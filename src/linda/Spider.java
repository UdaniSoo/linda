package linda;

public class Spider extends Insect {
	
	boolean isPoison;
	
	public Spider(int sage,boolean ispoison)
	{
		super(sage, 8);
		isPoison=ispoison;
		System.out.println("poison: "+ispoison);
	
	}
	
	public void says()
	{
		super.says();
		System.out.println("Spider says...");
	}
	public void climb()
	{
		System.out.println("Spider climbing");
	}

}
