package inheritance;

public class HierarchialChildTwo extends HierarchialParent {
	
		public void mul()
		{
			int m = b*a; //30*60
			System.out.println("Multiplication: "+m);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HierarchialChildTwo obj2 = new HierarchialChildTwo();
		obj2.mul();
		obj2.add();
	}

}
