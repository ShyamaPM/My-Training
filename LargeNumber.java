class LargeNumber
{
	public static void main(String args[])
	{
		int a=489;
		int b=89;
		int c=3;
		
		if(a<b) // 47<89
		{
			System.out.println(a+ " is less than "+b);
		} else if(a>c) // 47>3
		{
			System.out.println(a+ " is greater than "+c);
		}else if(b>c) // 89>3
		{
			System.out.println(b+ " is greater than "+c);
		}else
		{
			System.out.println("INVALID");
		}
	}
}