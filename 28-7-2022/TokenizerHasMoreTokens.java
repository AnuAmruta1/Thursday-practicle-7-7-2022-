2nd method hasMoreToken Tokenizer

import java.util.StringTokenizer;  
class TokenizerHasMoreTokens
{  
	public static void main(String args[])
	{  
   		StringTokenizer st = new StringTokenizer("I Am Amruta"," ");  
     		while (st.hasMoreTokens()) 
		{  
         			System.out.println(st.nextToken());  
     		}
		
	}  	
}  