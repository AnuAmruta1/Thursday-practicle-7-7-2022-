import java.util.StringTokenizer;  
class TokenizerHasMoreTokens
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