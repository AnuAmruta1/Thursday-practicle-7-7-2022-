import java.io.FileInputStream;
class WriteRead
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream f=new FileInputStream("test-file5.txt");
			int i=0;
			f.skip(1);
			System.out.println("Priting text from index 5:");
			while((i=f.read())!=-1)
			{
				System.out.print((char)i);
			}
			f.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}