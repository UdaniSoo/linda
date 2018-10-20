package linda;

public class LearningArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers=new int[5];
		numbers[0]=31;
		numbers[1]=56;
		numbers[2]=45;
		numbers[3]=67;
		numbers[4]=90;
		
		int[] numbers2={31,56,45,67,90};
		
		System.out.println("last index: "+numbers2[4]);
		
		String[] myFavCandies={"Twix","Mass","Crunch"};
		System.out.println("First index is "+myFavCandies[0]);
		myFavCandies[2]="Cadbery";
		System.out.println("New index 2= "+myFavCandies[2]);
		System.out.println("Array lenth = "+myFavCandies.length);
		
		

	}

}
