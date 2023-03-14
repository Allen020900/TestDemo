import java.awt.*;
import java.awt.event.*;
public class Keyevents_1 extends Frame implements KeyListener
{
	Label a;TextArea t;
	Keyevents_1()
	{
		
		a=new Label();
		t=new TextArea();
		t.addKeyListener(this);
		a.setBounds (20, 50, 100, 20);
		t.setBounds (20, 80, 300, 300);
		//add components to frame
		add(a);
		add(t);
		setSize(400,400);
		setLayout(null);
		setVisible(true);//now components are visible to user
		
	}
	public void keyPressed(KeyEvent k)
	{
		a.setText("key is pressed");
	}
	public void keyReleased(KeyEvent k)
	{
		a.setText("key is release");
	}
	public void keyTyped(KeyEvent k)
	{
		a.setText("key is typed");
	}
	public static void main(String args[])
	{
		Keyevents_1 obj=new Keyevents_1();		
	}
}