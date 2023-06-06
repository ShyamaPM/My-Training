package superkeyword;

public class SuperChild extends SuperParent {


	public SuperChild() {
		super("Java");
		// TODO Auto-generated constructor stub
	}

	public void display()
	{
		System.out.println("Super Child");
		System.out.println(super.a); // invoke parent variable
		System.out.println(super.b);
		super.print();// invoke parent method
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		SuperChild obj = new SuperChild();
		obj.display();

	}

}
