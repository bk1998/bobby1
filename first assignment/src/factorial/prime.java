package factorial;
import java.util.Scanner;
class prime
{
	 public static void  main(String args[])
	 {
		 int a,b,i,remain;
		 boolean bool=true;
		 
		 System.out.println("enter the number to check prime");
		 Scanner sn=new Scanner(System.in);
		 a=sn.nextInt();
		 if(a<=1)
		 {
			 System.out.println("this is not prime number");
		 }
		 for( i=2;i<a;i++)
		 {
			 remain=a%i;
			 if(remain==0)
			 {
				 // System.out.println("the number is not prime");
				 bool=false;
				  break;
			 }
			 else
			 {
				 bool=true;
			 }
			 
		 }
		 if(bool==false)
		 {
			 System.out.println("the number is not prime");
		 }
		 else
		 {
			 System.out.println("the number is prime");
		 }
		 
	 }
}
				 
