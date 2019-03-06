package factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leapyear
{
	
	
		 public static void main(String args[]) throws IOException
		 {
			int year;
			System.out.println("enter the year you want to check");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			year=Integer.parseInt(br.readLine());
			
			if((year%4)==0)
			{
				System.out.println("this is a leap year");
			}
			else if(year==2000)
			{
				if((year%8)==0)
				{
					System.out.println("this is a leap year");
				}
				else
				{
					System.out.println("this is not a leap year");
				}
			}
			else
			{
				System.out.println("this is not a leap year");
			}
			
			
		 
	}
}
