4th method CountToken Tokenizer

import java.util.StringTokenizer;    
class TokenizerCountToken  
{    
	public static void main(String args[])  
 	{    
   		StringTokenizer st = new StringTokenizer("I Am Amruta"," ");    
         		System.out.println("Total number of Tokens: "+st.countTokens());    
 	}    
}  