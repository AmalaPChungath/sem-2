class complex
{
	double x=0.0;
	double y=0.0;
	complex(double a,double b)
	{
		x=a;
		y=b;
	}
	public complex add(complex a,complex b)
	{
		double re=a.x+b.x;
		double im=a.y+b.y;
		return new complex(re,im);
	}
	void display()
	{
		System.out.println(x+"+"+y+"i");
	}
}
class main
{
	
	public static void main(String arg[])
	{
		complex temp;
		//main m=new main();
		complex n1=new complex(5.2,4.1);
		complex n2=new complex(3.4,4.3);
		temp=n1.add(n1,n2);
		temp.display();
	}
}
