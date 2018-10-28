package arraySortAgainDushtaMahathaya;

public class ArraySortAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={5,3,6,3,9};
		
		ArraySortAgain sort=new ArraySortAgain();
		sort.nthLargest(array, 2);
		}
	
	
	public void nthLargest(int array[],int n)
	{
		
	for(int outer=0; outer<n; outer++)
	{
	  for(int inner=0; inner<array.length-1-outer; inner++)
		{
			if(array[inner]>array[inner+1])
			{
				int temp=array[inner+1];
				array[inner+1]=array[inner];
				array[inner]=temp;
			}
		}
	}
	 System.out.println("second largest number is= "+array[array.length-2]);
	}

}
