package exception_sample;

public class ExceptionArithmetic {
	
	public void display()
	{
		int a = 56;
		int b = a/0;
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionArithmetic obj = new ExceptionArithmetic();
		System.out.println("Before Exception");
		obj.display(); // Exception code lines 8,9,18
		System.out.println("After Exception");

	}

}
