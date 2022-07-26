import java.util.Scanner;
class SumOfDigit
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=s.nextInt();
		int rem,sum=0;
		while(no!=0)
		{
			rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
	
		System.out.println("The sum of Digit:"+sum);
	}
	
}