package factorial;
import java.util.Scanner;
class angram
{
	public static void main(String args[])
	{    
	    boolean found=true;
		System.out.println("enter the string you want to check");
	    Scanner sn=new Scanner(System.in);
		String s=sn.nextLine();
		System.out.println("enter the String which you want to check for given String");
		String s2=sn.nextLine();
		int a=s.length();
		int b=s2.length();
		 for(int i=0;i<a;i++)
		 {
			 for(int j=0;j<b;j++)
			 {
			 if(s.charAt(i)==s2.charAt(j))
			 {
			        found=true;
		            break;
			 }
			 else
			 {
				 found=false;
			 }
	        }   
	     }
		 if(found==true)
		 {
			 System.out.println("yes");
		 }
		  else
		  {
			  System.out.println("no");
		  }
	}
}