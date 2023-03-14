import java.util.*;
import java.util.UUID;
import javax.swing.*;
import javax.swing.JScrollPane; 
import javax.swing.JFrame;  
import javax.swing.JTextArea; 
import java.awt.FlowLayout;  
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.String;
import java.awt.*;  
import java.awt.event.*; 
class Project implements ActionListener
{
	JLabel h2=new JLabel("System Generated Unique ID");
	JTextField h3=new JTextField();
	JFrame f=new JFrame("Student Transaction Management System");
	JLabel h1=new JLabel("Welcome to Student Transaction Management System");
	JLabel x1=new JLabel("=> To Find Your Transaction Please Enter the Amount_Spend Text Field");
	JLabel x2=new JLabel("=> To Delete Your Transaction Please Enter Generated id TextField");
	JLabel l0=new JLabel("Transaction_Date");
	JLabel l1=new JLabel("Amount_Spent");
	JLabel l2=new JLabel("Title");
	JLabel l3=new JLabel("Payment_Mode");
	JLabel l4=new JLabel();
	JLabel l5=new JLabel();
	JTextField t0=new JTextField();
	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	JTextField t3=new JTextField();
	TextArea ta=new TextArea();
	JButton b1=new JButton("Save");
	JButton b2=new JButton("Find");
	JButton b3=new JButton("Delete");
	JButton b4=new JButton("History");
	JButton b6=new JButton("Total Amount Spent  ");
	Project()
	{
		//heading label
		h1.setBounds(100,10,500,50);
		//user helping labels
		x1.setBounds(55,50,550,25);
		x2.setBounds(55,70,550,25);
		//side labels
		h2.setBounds(50,120,300,20);
		l0.setBounds(50,140,300,20);
		l1.setBounds(50,160,300,20);
		l2.setBounds(50,180,300,20);
		l3.setBounds(50,200,300,20);
		//message label
		l4.setBounds(75,280,300,20);
		//total amount label
		l5.setBounds(210,560,100,20);
		//text fields
		h3.setBounds(250,120,250,20);
		t0.setBounds(250,140,250,20);
		t1.setBounds(250,160,250,20);
		t2.setBounds(250,180,250,20);
		t3.setBounds(250,200,250,20);
		//buttons
		b1.setBounds(30,240,70,20);
		b2.setBounds(150,240,70,20);
		b3.setBounds(270,240,80,20);
		b4.setBounds(390,240,80,20);
		//total amt button
		b6.setBounds(20,560,170,20);
		//text area
		ta.setBounds(20,320,600,200);
		//adding to frame
		f.add(x1);
		f.add(x2);
		f.add(h1);
		f.add(h2);
		f.add(h3);
		f.add(l0);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(b6);
		f.add(l5);
		f.add(t0);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(ta);
		UUID uniqueKey = UUID.randomUUID();
		String KeyAsString = uniqueKey.toString(); 
		h3.setText(KeyAsString);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b6.addActionListener(this);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(650,650);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Allen","Allen0209");
			if(e.getSource()==b1)
			{
				String sql = "insert into project values(\'"+h3.getText()+"\',\'"+t0.getText()+"\',"+t1.getText()+",\'"+t2.getText()+"\',\'"+t3.getText()+"\')";
				ps=con.prepareStatement(sql);
				ps.execute();
				l4.setText("ThankYou! Your data has been stored in database");
				ta.setText("ID: "+h3.getText()+",\nDate: "+t0.getText()+",\nAmount Spent: "+t1.getText()+",\nSpent on: "+t2.getText()+",\nMode Of Payment: "+t3.getText()+".");
			}
			if(e.getSource()==b2)
			{
				String sql = "select * from project where Amount_Spent="+t1.getText()+"";
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
				ta.setText("");
				while(rs.next())
           		{           	   
					ta.append("\nID: "+rs.getString(1)+",Date: "+rs.getString(2)+", Amount Spent: "+rs.getString(3)+", Spent on: "+rs.getString(4)+", Mode Of Payment: "+rs.getString(5)+".");
            	}
				l4.setText("Your Transaction has Found in database");
			}
			if(e.getSource()==b3)
			{
				String sql="delete from project where SYS_ID=\'"+h3.getText()+"\'";
				ps=con.prepareStatement(sql);
				ps.executeUpdate();
				l4.setText("Your Transaction has been Deleted from database");
			}
			if(e.getSource()==b4)
			{
				String sql = "select * from project";
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
				ta.setText("");
				while(rs.next())
           		{    	   
					ta.append("\nID: "+rs.getString(1)+",Date: "+rs.getString(2)+", Amount Spent: "+rs.getString(3)+", Spent on: "+rs.getString(4)+", Mode Of Payment: "+rs.getString(5)+".");
            	}
				l4.setText("Your Past Transaction are Displayed in TextArea");
			}
			if(e.getSource()==b6)
			{
				String s;
				String sql="select sum(Amount_Spent) as tsum from project";
				ps=con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next())
				{
					String tsum=rs.getString("tsum");
					l5.setText(tsum);
				}
				l4.setText("Your Total Expenses are display in bottom");
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
	}
	public static void main(String args[])
	{
		new Project();			
	}
}