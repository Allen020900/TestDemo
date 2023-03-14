//Write a AWT program to add a button to frame and display
//Frame in 2 ways
//1. extending frame class
//2. creating object for frame class
//import required package
import java.awt.*;
import java.awt.event.*;
class Awt_button extends Frame implements ActionListener 
{
	Label l1;
	TextField tf1;
	Awt_button()
	{
		Button b1=new Button("click");
		b1.addActionListener(this);
		l1=new Label();
		l1.setBounds(50,120,370,120);
		tf1=new TextField();
		b1.setBounds(30,80,100,50);
		tf1.setBounds(160,80,100,80);
		add(b1);add(l1);add(tf1);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=tf1.getText();
		if(s.equals("admin"))
			l1.setText("Your username is valid, proceed to LOGIN");
		else
			l1.setText("Your username is invalid, can not login");

			
	}
	public static void main(String args[])
	{
		Awt_button obj=new Awt_button();
	}
}


