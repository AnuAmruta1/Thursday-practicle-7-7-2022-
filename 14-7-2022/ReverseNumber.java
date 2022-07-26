import java.util.Scanner;
class ReverseNumber
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=s.nextInt();
		int rev=0,rem;
		while(no!=0)
		{
			rem=no%10;
			no=no/10;
			rev=rev*10+rem;
		}
	
		System.out.println("The number after Reverse:"+rev);
	}
	
}