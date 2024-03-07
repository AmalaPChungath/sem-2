import java.util.Scanner;
class Input{
	public static void main(String[] args){
		try{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter name :");
			String n=s.next();
			System.out.println(n);
			
			
			System.out.println("Enter integer: ");
			int i=s.nextInt();
			System.out.println(i);
			//s.nextLine();
			System.out.println("Enter a line :");
			System.out.println("...................");
			String li=s.nextLine();
			System.out.println("...................");
			System.out.println(li);
			System.out.println("Enter float : ");
			float f=s.nextFloat();
			System.out.println(f);
			System.out.println("Enter double : ");
			double d=s.nextDouble();
			System.out.println(d);
			s.close();
			
		}catch(Exception w){
		System.out.println(w);
		}
	}
}
