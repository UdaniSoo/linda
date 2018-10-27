package linda;

import java.util.Random;

public class diceRolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		diceRolling rolling=new diceRolling();
		rolling.rollNTimes(10);	
	}
	
	
	public void rollNTimes(int numOfRolls)
	{
		Random rand=new Random();
		int diceValue=0;
		
		for(int i=1; i<numOfRolls+1; i++)
		{
			
		diceValue=rand.nextInt(6)+1;
		System.out.println("Dice Value is:"+diceValue);
		
		}		
	}

}
