package linda;

import java.awt.Color;

public class execsDog {
	
	private String name;
	private Color color;
	private int age;
	
	
	public execsDog(Color dcolor,String dname,int dage)
	{
		this.color=dcolor;
		this.name=dname;
		this.age=dage;
		
		
	}
	
	public void bark()
	{
		System.out.println("Bark!");
	}
	
	public String getName()
	{
		return name;
		
	}
	
	public int getAge()
	{
		return age;
	}

	public String getColor() {
		// TODO Auto-generated method stub
		return color.toString();
	}
	



	

}
