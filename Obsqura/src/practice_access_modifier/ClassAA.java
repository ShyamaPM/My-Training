package practice_access_modifier;

public class ClassAA {
	
	private String s = "Private"; // private : only inside the class
	
	protected float f = 456.57f; // protected : inside the package and inside the class
	
	double d = 45678.342d; //default
	
	public static void add() //public : inside the class, package, another package
	{
		int a = 10;
		int b = 80;
		System.out.println("Public Sum: "+(a+b));
	}

public static void main(String args[])
{
   ClassAA.add();	// public
   
   ClassAA obj = new ClassAA();
   System.out.println(obj.s);
   System.out.println("Protected: "+obj.f);
   System.out.println("Default: "+obj.d);
   
   
   
   
}
}
