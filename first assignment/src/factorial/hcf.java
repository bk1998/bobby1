package factorial;
import java.util.Scanner;
import java.io.*;
class hcf
{
	public static void main(String args[])
	{
	 int a,b,hcff=0,lcm=0;
	 System.out.println("enter the numnber to check");
	 Scanner sn =new Scanner(System.in);
	 a=sn.nextInt();
     System.out.println("enter second number");
     b=sn.nextInt();
     for(int i=1;i<=a || i<=b;i++)
	 {
		 if(a%i==0 && b%i==0)
		 {
			 hcff=i;
		 }
	 }
	 System.out.println("hcf of the numbers is="+hcff);
	 lcm=(a*b)/hcff;
	 System.out.println("the lcm of the number is="+lcm);
	 
	 }
	  
	}
	 

