package practice_access_modifier_1;

import practice_access_modifier.ClassAA;

public class ClassCC extends ClassAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClassAA obj = new ClassAA();
		ClassAA.add(); // Public: able to call
		//System.out.println(obj.s); // private: not able to call
		//System.out.println(obj.f); // protected: not able to call
		//System.out.println("Default: "+obj.d); //default: not able to call

	}

}
