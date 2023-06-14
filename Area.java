class Area
{
	public static void area(float r)
	{
		float circle = 3.14f*r*r;
		System.out.println("Circle area: "+circle);
	}
	
	public static void area(int l,int b)
	{
		int rectangle = l*b;
		System.out.println("Rectangle area: "+rectangle);
	}
	
	public static void area(int a)
	{
		int square = a*a;
		System.out.println("Square area: "+square);	
	}
	
	public static void main(String args[])
	{
		Area.area(2.5f);
		Area.area(5,4);
		Area.area(8);
	}
}