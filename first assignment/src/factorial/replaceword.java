package factorial;

class replaceword
{
	public static void main(String args[])
	{
		String s="he is not foolish . He is also a very good person . Dont talk about idiot people. Always look forward. if any body call you foolish show them that you are not a foolish person....";
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
		  if(s1[i].equals("idiot") || s1[i].equals("foolish"))
		  {
			  System.out.print("****" +" ");
			  
		  }
		  else
		  {
			  System.out.print(s1[i] +" ");
		  }
	}}
}
