class constructor
{
	int a=0;
	String b=" ";
	constructor(int x,String y)
	{
		a=x;
		b=y;
	}
	constructor(int x)
	{
		a=x;
	}
	void display()
	{
		System.out.println(a+","+b);
		System.out.println(a);
	}
}
class main
{
	public static void main(String arg[])
	{
		constructor n=new constructor(12,"Amala");
		n.display();
		constructor e=new constructor(14);
		e.display();
	}
}
