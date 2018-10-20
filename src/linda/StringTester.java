package linda;

public class StringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="entertainment";
		String upperText=text.toUpperCase();
		System.out.println("Converted to uppercase: " +upperText);
		
		char firstLetter=text.charAt(0);
		System.out.println(firstLetter);
		System.out.println("contains 'enter'?"+ upperText.toLowerCase().contains("enter"));
		

	}

}
