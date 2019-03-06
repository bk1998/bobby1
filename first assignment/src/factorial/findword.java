package factorial;
import java.util.Scanner;
public class findword

{
	public static void main(String args[])
	{
		String s="i am a boy and my name is gautam . there is a village named doll. that village is very beautiful.";
         String[] s2=s.split(" ");	
          int count=0;
          for(int i=0;i<s2.length;i++)
		  {
			  if(s2[i].equals("is"))
              {              
		        count=count+1;
		      }
			  
		  }
                System.out.println("the occurence of the word 'Is' is "+count+ " times");			  
		  
		  
    }		  

}
