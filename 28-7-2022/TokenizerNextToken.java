import java.util.StringTokenizer;  
class TokenizerNextToken
{  
	public static void main(String[] args) 
	{  
		StringTokenizer st = new StringTokenizer("my,name,is,Amruta");    
		System.out.println("Next token is : " + st.nextToken(","));  
  	}      
}  