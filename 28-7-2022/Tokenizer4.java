import java.util.StringTokenizer;    
public class Tokenizer4  
{    
	public static void main(String args[])  
 	{    
   		StringTokenizer st = new StringTokenizer("Hello everyone I am a Java developer"," ");    
     		while (st.hasMoreElements())   
    		 {    
        			 System.out.println(st.nextToken());    
    		 }    
	 }    
}  