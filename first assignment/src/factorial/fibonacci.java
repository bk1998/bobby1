package factorial;
import java.io.*;
import java.util.Scanner;
public class fibonacci 
{
	
	
		public static void main(String args[])
		{
			int a,b=0,c=0,d=1,i=1;
			System.out.println("enter the value of a");
			Scanner sn=new Scanner(System.in);
			a=sn.nextInt();
		     while(i<=a)
			 {
			  b=c;
			  c=d;
			  d=b+c;
			  
			  System.out.println(b);
			  
			  i++;
			}
			
		
	}
				

}
