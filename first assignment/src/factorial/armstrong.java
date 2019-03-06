package factorial;
import java.util.Scanner;

public class armstrong
{
	
	
		public static void main(String args[])
		{
			int a,b,i=1,sum=0,c,e;
			System.out.println("enter the value of a");
			Scanner sn=new Scanner(System.in);
			a=sn.nextInt();
			e=a;
			while(a>0)
			{
				b=a%10;
				c=b*b*b;
				
				sum=sum+c;
				a=a/10;
				
				
				
				
			}
			if(sum==e)
			{
			System.out.println("the number is armstrong");
			}
	       else {
	          System.out.println("the number is not armsstrong");
		   }
		
	}	
}
