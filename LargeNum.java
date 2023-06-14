class LargeNum
{
	public static void main(String args[])
	{
		int a=79;
		int b=78;
		int c=100;
		
		if(a<b&&a<c) // 78<77    78<9
		{
			System.out.println(a+ " is less than "+b+ " & " +c);
		} else if(a>b&&a>c)  // 78>77    78>9
		{
			System.out.println(a+ " is greater than "+b+ " & " +c);
		}else if(b<a&&b<c) // 77<78     77<9
		{
			System.out.println(b+ " is less than "+a+ " & " +c);
		}else if(b>a&&b>c)
		{
			System.out.println(b+ " is greater than "+a+ " & " +c);
		}else if(c<a&&c<b)
		{
			System.out.println(c+ " is less than "+a+ " & " +b);
		}else if(c>a&&c>b)
		{
			System.out.println(c+ " is greater than "+a+ " & " +b);
		}else
		{
		  System.out.println("INVALID");
		}
	}
}