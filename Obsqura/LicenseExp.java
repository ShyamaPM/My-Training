package exception_sample;

public class LicenseExp //LicenseExp is our custom exception class
{
	public void  test(int age) throws LicenseException 
	{
		if(age<18)
		{
			//System.out.println("Not eligible for Vote");
			throw new LicenseException("Not eligible for vote"); // creating constructor using the same name of custom exception in another class
		}else
		{
			System.out.println("Eligible for vote");
		}
	}
	
	public static void main(String[] args) //throws LicenseException 
	{
		// TODO Auto-generated method stub
		LicenseExp obj = new LicenseExp();
		try {
			obj.test(7);
		} catch (LicenseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // method used for printing statement
		}

	}

}
