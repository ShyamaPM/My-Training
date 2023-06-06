package accessmodifer;

public class ClassA 
{
    private int a = 10;
    protected char b = 'A';
    int c=90;
	public void display()
	{
		System.out.println("Public");
	}
	
	public static void main(String args[])
	{
		ClassA obj = new ClassA();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}

}


