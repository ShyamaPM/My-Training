package practice_access_modifier;

public class ClassBB {

	public static void main(String[] args) {
		ClassAA.add();
		ClassAA obj = new ClassAA();
		
		//System.out.println(obj.s); // private
		System.out.println(obj.f); // protected
		 System.out.println("Default: "+obj.d);

	}

}
