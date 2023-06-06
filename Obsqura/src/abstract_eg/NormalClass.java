package abstract_eg;

public class NormalClass extends AbstractClass
{
	public void print() //definition of abstract method
	{
		System.out.println("Abstract Method");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		NormalClass obj = new NormalClass();
		obj.print();
		obj.display();
		//AbstractClass obj1 = new AbstractClass(); // because it's abstract class
		//obj1.display();
		//obj1.display();

	}

}
