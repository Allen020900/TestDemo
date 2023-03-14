import java.awt.*;
import java.awt.event.*;
class emp_details implements ItemListener,ActionListener
{
	Checkbox checkbox1,checkbox2;
	CheckboxGroup cbg;
	Frame f=new Frame("Allen Tech");
	Label l1=new Label("Employee name");
	Label l2=new Label("Employee id");
	Label l3=new Label("Employee salary");
	Label l4=new Label("Gender");
	Label l5=new Label("Hobbies");
	Button b1= new Button("Submit");
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	TextField t4=new TextField();
	TextField t5=new TextField();
        TextArea ta;
	emp_details()
	{        
        	ta=new TextArea( );
		l1.setBounds(50,100,100,20);
		l2.setBounds(50,140,100,20);
		l3.setBounds(50,180,100,20);
		l4.setBounds(50,220,100,20);
		l5.setBounds(50,290,100,20);
		t1.setBounds(200,100,100,20);
		t2.setBounds(200,140,100,20);
		t3.setBounds(200,180,100,20);
		t4.setBounds(200,220,100,20);
		t5.setBounds(200,290,100,20);
		b1.setBounds(50,320,50,20);
        	ta.setBounds(50,400,300,150);
		cbg=new CheckboxGroup();
        	checkbox1 = new Checkbox("MALE",cbg,false);    
        	checkbox1.setBounds(200, 240,  100, 20);    
        	checkbox2 = new Checkbox("FEMALE",cbg,false);    
        	checkbox2.setBounds(200, 260,  100, 20);     
		f.add(checkbox1);  
		f.add(checkbox2);    
        	checkbox1.addItemListener(this);
        	checkbox2.addItemListener(this); 
        	b1.addActionListener(this);   
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(b1);
        	f.add(ta);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(500,500);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==checkbox1)
		{
			t4.setText("MALE");
		}
		if(e.getSource()==checkbox2)
		{
			t4.setText("FEMALE"); 
		}
	}  
    public void actionPerformed(ActionEvent o) 
    {
		
			
			String s1=l1.getText( );
			String s2=l2.getText( );
			String s3=l3.getText( );
			String s4=l4.getText( );
			String s5=l5.getText( );
			String s6=t1.getText( );
			String s7=t2.getText( );
			String s8=t3.getText( );
			String s9=t4.getText( );
			String s10=t5.getText( );
			ta.setText("SUBMITTED DETAILS:"+"\n"+s1+":"+s6+"\n"+s2+":"+s7+"\n"+s3+":"+s8+"\n"+s4+":"+s9+"\n"+s5+":"+s10);    
		
	}
	public static void main(String args[])
	{
		new emp_details();
	}
}