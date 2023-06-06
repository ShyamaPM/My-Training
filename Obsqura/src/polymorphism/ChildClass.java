package polymorphism;

public class ChildClass extends ParentClass{
	final int a =30; // final instance variable
	
	@Override
	public void display()
	{
	//	a = 20; // final instance variable
		super.display();
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass();
		obj.display();
		//ParentClass obj1 = new ParentClass();
	//	obj1.display();

	}

}
