package linda;

public class LagestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={5,35,21,90,45,76,34};
		LagestNum arrayPrint=new LagestNum();
		//arrayPrint.printArrayTillSize(array);
		
		//arrayPrint.printReducingArray(array);
		arrayPrint.printArray(array);
		arrayPrint.sortAscending(array);
		arrayPrint.printArray(array);
	
	}
	
	public void printArrayTillSize(int array[])
	{		
		for(int j=0; j<array.length; j++)
		{
			for(int i=0; i<array.length; i++)
			{
				System.out.print(" "+array[i]);
			}
		System.out.println();
		}
	}
	
	public void printReducingArray(int array[])
	{
		for(int outerIndex=0; outerIndex<array.length; outerIndex++)
		{
			for(int innerIndex=0; innerIndex<array.length-outerIndex; innerIndex++)
			{
				System.out.print(" "+array[innerIndex]);
			}
			System.out.println();
		}
	}
	
	public void sortAscending(int array[])
	{
		for(int outer=0; outer<array.length; outer++)
		for(int inner=0; inner<array.length-1; inner++)
		{
			if(array[inner]>array[inner+1])
			{
				int temp=array[inner+1];
				array[inner+1]=array[inner];
				array[inner]=temp;
			}
			
		}
	}
	
	public void printArray(int array[])
	
	{
		for(int i=0; i<array.length; i++)
		{
		System.out.print(" "+array[i]);
		}
		System.out.println();

	}

}
