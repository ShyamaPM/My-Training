class StudentGrade
{
	public static void main(String args[])
	{
		int mark=20;
		if(mark<40)
		{
			System.out.println("Fail");
		} else if(mark>=40 && mark<=60)
		{
			System.out.println(mark+ " is D grade");
		} else if(mark>=61 && mark<=70)
		{
			System.out.println(mark+ " is C grade");
		} else if(mark>=71 && mark<=80)
		{
			System.out.println(mark+ " is B grade");
		} else if(mark>=81 && mark<=100)
		{
			System.out.println(mark+ " is A grade");
		}else
		{
			System.out.println("Invalid");
		}
		
	}
}