import java.util.*;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.String;
import java.awt.*;  
import java.awt.event.*; 
public class Att implements ActionListener
{
	Frame f=new Frame("Attendence Management System");
	Label l0=new Label("Student_name");
	Label l1=new Label("Roll_number");
	Label l2=new Label("Subject_id");
	Label l3=new Label("Subject_name");
	Label l4=new Label("Total_classes");
	Label l5=new Label("Classes_present");
    	Label l6=new Label("Classes_absent");
	Label l7=new Label();
	TextField t0=new TextField();
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	TextField t4=new TextField();
	TextField t5=new TextField();
    	TextField t6=new TextField();
	TextArea ta=new TextArea();
	Button b1=new Button("Get(%)");
	Button b2=new Button("Exit");
	Att()
	{
		l0.setBounds(50,60,100,20);
		l1.setBounds(50,80,100,20);
		l2.setBounds(50,100,100,20);
		l3.setBounds(50,120,100,20);
		l4.setBounds(50,140,100,20);
		l5.setBounds(50,160,100,20);
		l6.setBounds(50,180,100,20);
		t0.setBounds(200,60,100,20);
		t1.setBounds(200,80,100,20);
		t2.setBounds(200,100,100,20);
		t3.setBounds(200,120,100,20);
        	t4.setBounds(200,140,100,20);
		t5.setBounds(200,160,100,20);
		t6.setBounds(200,180,100,20);
		b1.setBounds(50,230,50,20);
		b2.setBounds(220,230,50,20);
		l7.setBounds(50,55,100,20);
		ta.setBounds(20,300,440,200);
		f.add(l0);
		f.add(l1);
		f.add(l2);
		f.add(l3);
       		f.add(l4);
		f.add(l5);
		f.add(l6);
        	f.add(l7);
		f.add(t0);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);
		f.add(b1);
		f.add(b2);
		f.add(ta);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(550,550);
	}
	public void actionPerformed(ActionEvent e)
	{
		int n1=Integer.parseInt(t4.getText());
		int n2=Integer.parseInt(t5.getText());
		int n3=Integer.parseInt(t6.getText());
		String n4;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try
		{
			if(e.getSource()==b1)
			{
				n4=String.valueOf((n2/n1)*100);
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Allen","Allen0209");
				String sql = "insert into attendencevalues(\'"+t0.getText()+"\',"+t1.getText()+",\'"+t2.getText()+"\',\'"+t3.getText()+"\',\'"+t4.getText()+"\',\'"+t5.getText()+"\',\'"+t6.getText()+"\')";
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
				l7.setText("ThankYou! Your Attendence for subject +t3.getText() is:+n4");
			}
			if(e.getSource()==b2)
			{

			}
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	ta.setText(""+t0.getText()+"\n"+""+t1.getText()+"\n"+""+t2.getText()+"\n"+t3.getText()+"\n"+t4.getText()+"\n"+t5.getText()+"\n"+t6.getText());
	}
	public static void main(String args[])
	{
		new Att();			
	}
}