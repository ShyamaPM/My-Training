class Count
{
	public static void main(String args[])
	{
		int countEven =0, countOdd=0;
		for(int i=10;i<=20;i++)
		{
			if(i%2==0)
			{
				//System.out.println(i);
				countEven++;
			
			}else
			{
				countOdd++;
			}
		}
		System.out.println("Count of even number: "+countEven);
		System.out.println("Count of Odd number: "+countOdd);
	}
}


//i=10 ;10<=20 true; 10/2==0 ; counteven 1
