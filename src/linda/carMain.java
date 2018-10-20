package linda;

import java.awt.Color;

public class carMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car udaniCar=new Car(25, "EN240000", Color.black, true);
		Car thisaraCar=new Car(30,"FJSO3034", Color.RED, false);

		System.out.println(udaniCar.getMiles(10));
		System.out.println(thisaraCar.getMiles(10));
		udaniCar.printLicense();
		thisaraCar.printLicense();
		
		double input = 5.0;
		
		udaniCar.increaseInput(input);
		
		System.out.println(input);
		
	}

}
