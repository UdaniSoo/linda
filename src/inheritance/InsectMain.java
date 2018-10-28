package inheritance;

public class InsectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Insect insect=new Insect(1, 2);
		Spider newspider=new Spider(2, true);
		Cricket newecricket=new Cricket(3, 5);
		System.out.println("Insect behavior");
		insect.says();
		insect.crawl();
		
		System.out.println("Spider..");
		newspider.says();
		newspider.climb();
		
		System.out.println("Cricket");
		newecricket.says();
		newecricket.jump();
		newecricket.crawl();

	}

}
