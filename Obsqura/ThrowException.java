package exception_sample;

public class ThrowException {
	
	public static void throwSample(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("not eligible");
		} else {
			System.out.println("Eligible for vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowException.throwSample(5);

	}

}
