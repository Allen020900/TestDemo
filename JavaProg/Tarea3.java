import java.awt.*;
import java.awt.event.*;
public class Tarea3 extends Frame implements ActionListener
{
	TextField tf1,tf2;
	Button b1;
	Tarea3()
	{
		tf1=new TextField();
		tf2=new TextField();
		b1=new Button("EVEN ODD");
		b1.addActionListener(this);
		setSize(500,500);
		
		tf1.setBounds(160,80,50,80);
		tf2.setBounds(200,200,120,60);
		b1.setBounds(250,400,100,30);
		add(tf1);add(tf2);add(b1);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=tf1.getText();
		int value=Integer.parseInt(s);
		if(value%2==0) 
                 { 
                    tf2.setText("Number is even");
		 } 
                else{ 
                    tf2.setText("Number is odd");  
                    }         
	}
	public static void main(String args[])
	{
		Tarea3 obj=new Tarea3();
	}
}
	