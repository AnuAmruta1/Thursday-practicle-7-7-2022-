class DataType
{
	public static void main(String[] args)
	{
		int i=81;
		char c='Q';
		double d=323.142;
		float f=72.38f;
		byte b;
		
		c=(char) i;
		System.out.println("i ="+i+"c="+c);

		i=(int) d;
		System.out.println("d="+d+"i="+i);
		
		i=(int) f;
		System.out.println("f="+f+"i="+i);
		
		b=(byte) d;
		System.out.println("d="+d+"b="+b);
		
	
	 }
}