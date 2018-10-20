package linda;

import java.awt.Color;

public class carMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car udaniCar=new Car(25.5, "EN240000", Color.black, true);
		
		System.out.println("My Car license:" +udaniCar.license);
		System.out.println("My Car license:" +udaniCar.avgMilesPG);
	}

}
