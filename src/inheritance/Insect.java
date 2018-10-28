package inheritance;

public class Insect {
	
	int age;
	int noOfLegs;
	
	public Insect(int insage, int nooflegs)
	{
		age=insage;
		noOfLegs=nooflegs;
		System.out.println(this.getClass());
		System.out.print("Insect Age= "+age);
		System.out.println(", Num legs= "+noOfLegs);
		
	}
	
	public void says()
	{
		System.out.println("base class behavior says");
	}
	public void crawl()
	{
		System.out.println("Insect Crawlll ");
	}

}
