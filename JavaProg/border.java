import java.awt.*;
import java.awt.event.*;
class border extends Frame
{
	Button b1,b2,b3,b4,b5;
	BorderLayout bl;
	border()
	{
		bl=new BorderLayout(20,20);
		b1=new Button("add_north");
		b2=new Button("sub_south");
		b3=new Button("prod_east");
		b4=new Button("div_west");
		b5=new Button("square_center");
		setLayout(bl);
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		add(b5,BorderLayout.CENTER);
		
		addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
		}}); 
		
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String args[])
	{
	  border obj=new border( );	
	}
}
		