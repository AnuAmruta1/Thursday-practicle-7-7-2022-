import java.util.StringTokenizer;
class StringTokenizer1
{
	public static void main(String[] args)
	{
		String st="My Name Is Amruta";
		StringTokenizer s=new StringTokenizer(st);
		while(s.hasMoreTokens())
		{
			System.out.println(s.nextToken());
		}
			System.out.println("String length is:" +st.length());
			System.out.println("Upper case is:" +st.toUpperCase());
			System.out.println("Index no at character 'T' is:" +st.indexOf('T'));
			System.out.println("Character at index no 5 is:" +st.charAt(5));
			System.out.println("String contains 'Is' or not :" +st.contains("Is"));
	}
}