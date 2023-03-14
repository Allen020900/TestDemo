import java.awt.*;
import java.awt.event.*;
public class Tarea1 extends Frame implements ActionListener
{
	TextField tf1,tf2;
	Button b1;
	Tarea1()
	{
		tf1=new TextField();
		tf2=new TextField();
		b1=new Button("Square");
		b1.addActionListener(this);
		setSize(500,500);
		
		tf1.setBounds(160,80,50,30);
		tf2.setBounds(160,150,50,30);
		b1.setBounds(160,190,50,30);
		add(tf1);add(tf2);add(b1);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=tf1.getText();
		int value=Integer.parseInt(s);
		int square_res=value*value;
		tf2.setText(""+square_res);
		
	}
	public static void main(String args[])
	{
		Tarea1 obj=new Tarea1();
	}
}
	