class Rectangle{
	int length;
	int breadth;
	
	public Rectangle()
	{
		length = 5;
		breadth = 7;
	}
	
	public Rectangle(int num)
	{
		length = num;
		breadth = num;
	}
	
	public Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public void calculateArea()
	{
		int area = length*breadth;
		System.out.println("Area is: "+area);
		System.out.println("************************");
	}
	
	public void displayArea()
	{
		System.out.println("Length="+length+ "Breadth="+breadth);
	}
}
class Area
{
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle();
		r1.displayArea();
		r1.calculateArea();
		
		Rectangle r2 = new Rectangle();
		r2.displayArea();
		r2.calculateArea();
		
		Rectangle r3 = new Rectangle();
		r3.displayArea();
		r3.calculateArea();
	}
}