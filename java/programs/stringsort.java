import java.util.Scanner;
class stringsort
{
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no of strings : ");
		n=s.nextInt();
		s.nextLine();
		String str[]=new String[n];
		System.out.print("Enter the strings : ");
		for(int i=0;i<n;i++)
		{
			str[i]=s.nextLine();	
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println("Sorted array");
		for(int i=0;i<n;i++)
		{
			System.out.println(str[i]);	
		}
	}
}
