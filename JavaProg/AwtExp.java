
import java.awt.*;
import java.awt.event.*;
class AwtExp extends Frame implements ActionListener 
{
	Label l1;
	Label l2;
	TextField tf1,tf2;
	AwtExp()
	{
		Button b1=new Button("click");
		b1.addActionListener(this);
		l1=new Label();
                
		l1.setBounds(50,100,75,40);
		l2=new Label();
        l2.setBounds(50,150,75,40);        
		tf1=new TextField();
        tf2=new TextField();
		b1.setBounds(50,200,100,50);
		tf1.setBounds(150,170,100,100); 
        tf2.setBounds(150,130,100,100);
		add(b1);add(l1);add(tf1);add(tf2);add(l2);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=tf1.getText();
        String s2=tf2.getText(); 

		if(s1.equals("admin")) 
                  { 
                    if(s2.equals("123")) 
                      { 
                          l1.setText("Your username and Passward  is valid,  login successful"); 
                       }  
                    else 
                      { 
                         l1.setText("Your Passward is invalid, can not login"); 
                       } 

                    }
			
		else
			l1.setText("Your username is invalid, can not login");

			
	}
	public static void main(String args[])
	{
		Awt_button obj=new Awt_button();
	}
}


