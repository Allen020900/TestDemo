import java.awt.*;
import java.awt.event.*;
class choice_awt extends Frame implements ActionListener
{
	Label l1;
	Choice c;
	Button b1;
	choice_awt()
	{
		b1=new Button("select");
		l1=new Label();
		c=new Choice();
		c.add("cse");
		c.add("it");
		c.add("ece");
		c.add("eee");
		add(b1);
		b1.setBounds(100,300,100,60);
		
		l1.setBounds(50,50,100,49);
		add(c);
		add(l1);
		c.setBounds(100,100,50,50);
		b1.addActionListener(this);
		setLayout(null);
		setSize(400,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		int item_index=c.getSelectedIndex();
		String data=c.getItem(item_index);
		l1.setText(data+" is selected");
	}
	public static void main(String args[])
	{
		choice_awt obj=new choice_awt();
	}
}
	