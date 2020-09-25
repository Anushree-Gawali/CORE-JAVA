import java.util.Scanner;
class Circle
{
	private double radius;
	private double area;
	
	void Init(double radius)
	{
		this.radius=radius;
	}
	 
    double calculateArea(double radius)
    {
		return (3.14 * radius * radius);
	}

    void display()
	{
		double area=calculateArea(this.radius);
		System.out.println("radius of circle: "+radius+" area of circle: "+area);
	}   	
}

class CircleDemo
{
	public static void main(String args[])
	{
		
		
			Scanner sc = new Scanner(System.in);
		    System.out.println("Enter radius");	
		    double r = sc.nextDouble();
			Circle c = new Circle();
			c.Init(r);
			c.display();
	}
}