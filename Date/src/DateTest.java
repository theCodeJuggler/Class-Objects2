//Driver program to implement Date program
public class DateTest {

	public static void main(String[] args)
	{
		//creating objects and initialising the instance members 
		Date newDate=new Date(24,07,2018);
		Date oldDate=new Date(04,04,1995);
		
		int ar[]=newDate.diff(oldDate);
		
		System.out.println("Date 1:-"+newDate);
		System.out.println("Date 2:-"+oldDate);
		System.out.println("Total Days difference is "+ar[0]+"\nTotal Months difference is "+ar[1]+"\nTotal Years difference is "+ar[2]);
		
	}

}
