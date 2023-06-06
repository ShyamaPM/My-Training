package inheritance;

public class SingleChild extends SingleParent 
{

	public void sub()
	{
		int d = b-a;
		System.out.println("Subtraction: "+d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleChild obj = new SingleChild();
		obj.sub();
		obj.add();
	}

}
