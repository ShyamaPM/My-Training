package exception_sample;

public class ExceptionHandling {
	
	public void display()
	{
		int a = 56;
		try
		{
		int b = a/0;
		System.out.println(b);		
		}
	   catch(Exception e)//mainclass 'Exception' opens a memory in e
		{
			System.out.println("Exception Handled");
			System.out.println(e);
			
		}
		finally
		{
			System.out.println("Finally block");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling obj = new ExceptionHandling();
		obj.display(); // Exception code lines 8,9,18

	}

	
	

}
