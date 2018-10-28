package interfacePractice;

import java.util.Random;

public class PetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d=new Dog();
		Cat c=new Cat();
		
		if(c instanceof Pet)
		{
			c.play();
		}
		if(d instanceof Pet)
		{
			d.play();
		}
		
		Pet p;
		
		Random rand=new Random();
		int n=rand.nextInt(2);
		if(n==0)
		{
			p=new Dog();
			
			
		}else
		{
			p=new Cat();
			
		}
		p.play();

	}

}
