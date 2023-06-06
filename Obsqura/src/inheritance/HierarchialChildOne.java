package inheritance;

public class HierarchialChildOne extends HierarchialParent {
	
	public void sub()
	{
		int s = b-a; // 60-30
		System.out.println("Sub: "+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialChildOne obj1 = new HierarchialChildOne();
		obj1.sub();
		obj1.add();
	}

}
