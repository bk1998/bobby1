package factorial;
import java.util.Scanner;
class  insarr
{
	public static void main(String args[])
	{   int loc;
	      int max=4;
		  int val;
		int[] a=new int[5];
		System.out.println("enter the element of the array");
		Scanner sn =new Scanner(System.in);
		for(int b=0;b<max;b++)
		{
			a[b]=sn.nextInt();
		}
		System.out.println("the elements of the array are");
		for(int b=0;b<max;b++)
		{
			System.out.println(+a[b]);
		}
		System.out.println("enter the location you want to insert the elemrnt");
		loc=sn.nextInt();
		System.out.println("enter the element you want to insert");
		val=sn.nextInt();
		try
		{
		for(int i=max;i>loc;i--)
		{
			a[i]=a[i-1];
		}
		a[loc]=val ;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("the array after the insertion is" );
		for(int b=0;b<=max;b++)
		{
			System.out.println(+a[b]);
		}
		
			
	}
}

		

		
 