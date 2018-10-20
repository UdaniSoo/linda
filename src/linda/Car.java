package linda;

import java.awt.Color;

public class Car {

		// TODO Auto-generated method stub
		Double avgMilesPG;
		private String license;
		Color paintColor;
		Boolean tailingworking;
		
		public Car(double inputavgMilesPG, String inputlicense, Color inputpaintColor, Boolean inputtailingWorking)
		
	{
		this.avgMilesPG = inputavgMilesPG;
		this.license = inputlicense;
		this.paintColor = inputpaintColor;
		this.tailingworking = inputtailingWorking;
	}
		
	public double getMiles(double numberofgallons) {
		return this.avgMilesPG * numberofgallons;
	}

	public void printLicense() {
	System.out.println("License : "+license);
		
	}
	
		

}
