class LargestNumber
{
	public static void main(String args[])
	{
		int a=100;
		int b=189;
		int c=1;
		
		if(a>b&&a>c) // 78<77    78<9
		{
			System.out.println(a+ " is greater than "+b+ " & " +c);
		} else if(b>a&&b>c)  // 78>77    78>9
		{
			System.out.println(b+ " is greater than "+a+ " & " +c);
		}else
		{
			System.out.println(c+ " is greater than "+a+ " & " +b);
		}
	}
}