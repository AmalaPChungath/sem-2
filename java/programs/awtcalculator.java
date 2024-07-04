import java.awt.*;
import java.awt.event.*;
public class awtcalculator extends Frame implements ActionListener
{
	TextField t1,t2,t3;
	Label l1,l2,l3;
	Button b1,b2,b3,b4;
	
	awtframe()
	{
		setLayout(new FlowLayout());
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		
		l1=new Label("Number 1");
		l2=new Label("Number 2");
		l3=new Label("Result");
		
		b1=new Button("+");
		b2=new Button("-");
		b3=new Button("x");
		b4=new Button("/");
		
		add(l1);
		add(t1);
		
		add(l2);
		add(t2);
		
		add(l3);
		add(t3);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}//constuctor
	public void actionPerformed(ActionEvent ae)
	{
		int a,b,result;
		Double c,d,r;
		
		a=Integer.parseInt(t1.getText());
		b=Integer.parseInt(t2.getText());
		c=Double.parseDouble(t1.getText());
		d=Double.parseDouble(t2.getText());
			
		if(ae.getSource()==b1)
		{
			result=a+b;
			t3.setText(""+result);
		}
		else if(ae.getSource()==b2)
		{
			result=a-b;
			t3.setText(""+result);
		}
		else if(ae.getSource()==b3)
		{
			result=a*b;
			t3.setText(""+result);
		}
		else if(ae.getSource()==b4)
		{
			if(d==0)
				t3.setText("Division by zero!!");
			else
			{
				r=c/d;
				t3.setText(""+r);
			}
		}
		
	}//actionperformed


	public static void main(String args[])
	{
		awtcalculator obj=new awtcalculator();
		obj.setTitle("Calculator");
		obj.setSize(300,300);
		obj.setVisible(true);
		
		obj.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}});
	}//main method

}//awtframe
