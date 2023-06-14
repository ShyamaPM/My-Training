package interface_sample;

public class SampleClass implements Sample1
{
	
	public void display()
	{
		System.out.println("DISPLAY");
	}
	public void add()
	{
		int c = a+b;
		System.out.println(c);
	}
	public void print()
	{
		System.out.println("Method in the CLass");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SampleClass obj = new SampleClass();
		Sample1 obj = new SampleClass();//object of interface
		//obj.print(); // Since this is normal class, we cannot call normal class method
		obj.add();
		obj.display();
		System.out.println(obj.a);
		System.out.println(obj.b);
		

	}

}
