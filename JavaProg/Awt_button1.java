import java.awt.*;
import java.awt.event.*;
class Awt_button1 extends Frame implements ActionListener
{
	Label l1;
	Label l2;
	Label l3;
	TextField tf1,tf2;
	Awt_button1()
	{
		Button b1=new Button("Login");
		b1.addActionListener(this);
		b1.setBounds(50,200,100,50);

		l1=new Label("username");
		l1.setBounds(50,100,75,30);

		l2=new Label("password");
		l2.setBounds(50,150,75,30);
		l3=new Label();
		l3.setBounds(200,200,500,50);

		tf1=new TextField();
		tf1.setBounds(200,100,100,40);
		
		tf2=new TextField();
		tf2.setBounds(200,150,100,40);
		add(b1);add(l1);add(tf1);
		add(l2);add(tf2);add(l3);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String u=tf1.getText();
		String p=tf2.getText();
		if(u.equals("admin")&&p.equals("xyz"))
			l3.setText("proceed to login");
		else
			l3.setText("either username or password is invalid");
	}
	public static void main(String args[])
	{
		new Awt_button1();
	}
}