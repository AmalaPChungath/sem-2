import java.util.Scanner;
class employee
{
	int eno;
	String ename;
	float esalary;
	employee(int eno,String ename,float esalary)
	{
		this.eno=eno;
		this.ename=ename;
		this.esalary=esalary;
	}	
	void display()
	{
		System.out.println("eno="+eno);
		System.out.println("ename="+ename);
		System.out.println("esalary="+esalary);
	}	
}
class aob
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of employees to be entered: ");
		int n=s.nextInt();
		employee arr[]=new employee[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=new employee(i+1,"name"+(i+1),100000*(i+1));
		}
		for(int i=0;i<n;i++)
		{
			arr[i].display();
		}
		System.out.println("Enter eno to be searched");
		int e=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i].eno==e)
			{
				arr[i].display();	
			}
		}
	}
	
}
