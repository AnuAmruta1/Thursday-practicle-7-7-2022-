1st method hasMoreTokenizer

import java.util.StringTokenizer;  
class TokenizerHasMore
{  
	public static void main(String args[])
	{  
   		StringTokenizer st = new StringTokenizer("my name is Amit"," ");  
     		while (st.hasMoreTokens()) 
		{  
         			System.out.println(st.nextToken());  
     		}
		
	}  	
}  