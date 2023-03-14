import java.awt.*;
import java.awt.event.*;
public class Tarea extends Frame implements ActionListener
{
	TextField tf;
	Button b1;TextArea ta;Label l1;
	Tarea()
	{
		tf=new TextField();
		b1=new Button("click");
		b1.addActionListener(this);
		ta=new TextArea();
		l1=new Label("This is Label");
		setSize(500,500);
		l1.setBounds(30,80,100,50);
		tf.setBounds(160,80,100,80);
		ta.setBounds(200,200,150,100);
		b1.setBounds(250,400,100,50);
		add(tf);add(b1);add(l1);add(ta);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=tf.getText();
		String s1=l1.getText();
		ta.setText(s+" "+s1);
	}
	public static void main(String args[])
	{
		Tarea obj=new Tarea();
	}
}
	