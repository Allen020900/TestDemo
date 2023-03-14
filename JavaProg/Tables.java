import java.awt.*;
import java.awt.event.*;
class Tables impliments ActionListener
{
	Frame f=new Frame("Table Calci");
	Button b1=new Button("GET");
	Label l1=new Label("enter a table digit");
	TextField tf=new TextField();
	TextArea ta=new TextArea();
	Tables()
	{
		l1.setBounds(50,50,50,20);
		tf.setBounds(100,50,50,20);
		b1.setBounds(50,70,30,20);
		ta.setBounds(25,100,50,20);
		f.add(b1);
		f.add(l1);
		f.add(tf);
		f.add(ta);
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
	}
}
public void ActionListener(Action event e)
{
	if(e.getSource==b1)
	{
		for(int i=1;i<=10;i++)
		{
			ta.setText(tf+"*"+i+"="+tf*i);
		}
	}
}
public static void main(String args[])
{
	new Tables();
}