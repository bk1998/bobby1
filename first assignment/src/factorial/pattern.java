package factorial;

public class pattern 
{
   public static void main(String args[])
   {
	   int i,a,c,j;
	   a=1;
	   for(i=0;i<5;i++)
	   {
		   
		   for(j=0;j<a;j++)
		   {
			   System.out.print("*");
		   }
		   System.out.println("");
		   
		   if(i<2)
		   {
			  a=a+2;
		   }
		   else
		   {
			   a=a-2;
		   }
		   System.out.println("");
	   }
   }
}
