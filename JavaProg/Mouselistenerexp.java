import java.awt.*;
import java.awt.event.*;
public class Mouselistenerexp extends Frame implements MouseListener,MouseMotionListener
{
	Label a;
	Mouselistenerexp()
	{
		
		a=new Label();
		a.setBounds(20,50,300,100);
                addMouseListener(this);
		addMouseMotionListener(this);
		add(a);	
		setSize(400,400);
		setLayout(null);
		setVisible(true);		
	}
	public void mouseEntered(MouseEvent e)
	{
		a.setText("Mouse cursor entered window frame");
	}
	public void mouseExited(MouseEvent e)
	{
		a.setText("Mouse cursor exited from window frame");
	}
	public void mousePressed(MouseEvent e)
	{
		a.setText("Mouse is pressed");
	}
	public void mouseClicked(MouseEvent e)
	{
		a.setText("Mouse is clicked");
	}
	public void mouseReleased(MouseEvent e)
	{
		a.setText("Mouse Released");
	}
	public void mouseDragged(MouseEvent e)
	{
		a.setText("Mouse cursor is dragged");
	}
	public void mouseMoved(MouseEvent e)
	{
		a.setText("Mouse cursor is moving");
	}
	public static void main(String args[])
	{
			Mouselistenerexp obj=new Mouselistenerexp();
	}

}