package factorial;

import java.util.Scanner;
import java.io.*;
class palindrome1
{
	public static void main(String args[])
	{
	String s,reverse="";
	System.out.println("enter the string to check");
	Scanner sn =new Scanner(System.in);
	s=sn.nextLine();
	int length=s.length();
	for(int i=length-1;i>=0;i--)
	{
		reverse=reverse+s.charAt(i);
		
	}
	
	if(s.equals(reverse))
	{
		System.out.println("String is palindrome");
	}
	else
	{
		System.out.println("string  is not palindrome");
	}
}
	
}
