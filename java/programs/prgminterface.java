import java.util.Scanner;
interface shape
{
	public double area();
	public double perimeter();	
}
class circle implements shape
{
	double radius;
	circle(double radius)
	{
		this.radius=radius;
	}	
	public double area()
	{
		return 3.14*radius*radius;
	}
	public double perimeter()
	{
		return 2*3.14*radius;
	}
}
class rectangle implements shape
{
	int length,breadth;
	rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public double area()
	{
		return length*breadth;
	}
	public double perimeter()
	{
		return 2*(length+breadth);
	}
}
class prgminterface
{
	public static void main(String args[])
	{
		int r,l,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter radius");
		r=s.nextInt();
		s.nextLine();
		circle c=new circle(r);
		System.out.println("Circle area="+c.area());
		System.out.println("Circle perimeter="+c.perimeter());
		System.out.println("enter length");
		l=s.nextInt();
		s.nextLine();
		System.out.println("enter breadth");
		b=s.nextInt();
		s.nextLine();
		rectangle rl=new rectangle(l,b);
		System.out.println("Rectangle area="+rl.area());
		System.out.println("Rectangle perimeter="+rl.perimeter());
	}
}
