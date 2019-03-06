package factorial;

import java.util.Scanner;
import java.io.*;
class palindrome
{
	public static void main(String args[])
	{
	int a,b,remain,sum=0;
	System.out.println("enter the numnber to check");
	Scanner sn =new Scanner(System.in);
	a=sn.nextInt();
	b=a;
	while(a>0)
	{
		remain=a%10;
		sum=(sum*10)+remain;
		a=a/10;
	}
	if(sum==b)
	{
		System.out.println("number is palindrome");
	}
	else
	{
		System.out.println("number is not palindrome");
	}
}
	
}
