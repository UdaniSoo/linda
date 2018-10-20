package linda;

import java.awt.Color;

public class execsDogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		execsDog dog1= new execsDog(Color.BLACK, "Balu",2);
		
		System.out.println("Dpg name: " +dog1.getName());
		System.out.println("Dog color: " +dog1.getColor());
		System.out.println("Dog age: "+dog1.getAge());

	}

}
