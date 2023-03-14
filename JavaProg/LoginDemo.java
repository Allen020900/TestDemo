import java.awt.*; 
import java.awt.event.*; 
public class LoginDemo extends Frame implements ActionListener
{ 
	Label l1,l2,l3; 
	TextField t1,t2; 
	Button b1;
	public LoginDemo()
	{ 
		l1=new Label("User Name"); 
		l1.setBounds(20,50,100,20); 

		l2=new Label("Password"); 
		l2.setBounds(20,100,100,20); 	
 
		t1= new TextField();
		t1.setBounds(130,50,100,20);

		t2= new TextField();
		t2.setBounds(130,100,100,20);
		t2.setEchoChar('*');

		b1= new Button("login");
		b1.setBounds(80,150,80,20);

		l3 = new Label("->");
		l3.setBounds(80,200,200,20);

		add(l1);add(t1);
		add(l2);add(t2);
		add(b1);add(l3);

		b1.addActionListener(this);
		setSize(400,400); 
		setLayout(null); 
		setVisible(true); 
	}
	public void actionPerformed(ActionEvent e)
	{ 
		String uname = t1.getText();
		String pwd = t2.getText(); 
		if(uname.equals("Allen") && pwd.equals("Forgot"))
		{
			l3.setText("Welcome"); 
		}
		else
		{
			l3.setText("Invalid Username or Password");
		}
	} 
	public static void main(String[] args)
	{ 
		new LoginDemo(); 
	} 
}