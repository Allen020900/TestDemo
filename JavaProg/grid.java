 import java.awt.*;
import java.awt.event.*;
class grid extends Frame
{
	Button b1,b2,b3,b4;
	
	grid()
	{
		b1=new Button("add");
		b2=new Button("sub");
		b3=new Button("prod");
		b4=new Button("div");
		
		add(b1);add(b2);add(b3);add(b4);
				setLayout(new GridLayout(2,2,10,20));

		addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
		
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String args[])
	{
		grid obj = new grid( );
	}
}
		