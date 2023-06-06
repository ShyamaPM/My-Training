package inheritance;

public class MultilevelChild extends MultilevelParent 
{
	public void sub()
	{
		int s = b-a; //50 - 40
		System.out.println("Subtraction: "+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelChild obj = new MultilevelChild();
		obj.sub();
		obj.div();
		obj.multi();
	}

}
