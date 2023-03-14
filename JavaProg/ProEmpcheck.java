import java.util.*;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.String;
import java.awt.*;  
import java.awt.event.*; 
public class ProEmpcheck implements ActionListener
{
	Frame f=new Frame("Empolyee Management System");
	Label l0=new Label("Employee_Name");
	Label l1=new Label("Emp_Id");
	Label l2=new Label("Emp_Salary");
	Label l3=new Label("Experiance_in_years");
	TextField t0=new TextField();
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	TextArea ta=new TextArea();
	Button b1=new Button("Insert");
	Button b2=new Button("Delete");
       Button b3=new Button("Display");
	ProEmpcheck()
	{
		l0.setBounds(50,60,100,20);
		l1.setBounds(50,80,100,20);
		l2.setBounds(50,100,100,20);
		l3.setBounds(50,120,100,20);
		t0.setBounds(200,60,100,20);
		t1.setBounds(200,80,100,20);
		t2.setBounds(200,100,100,20);
		t3.setBounds(200,120,100,20);
		b1.setBounds(50,160,50,50);
		b2.setBounds(110,160,50,50);
               b3.setBounds(170,160,50,50);
		ta.setBounds(20,230,400,150);
		f.add(l0);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(t0);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(b1);
		f.add(b2);
               f.add(b3);
		f.add(ta);
		b1.addActionListener(this);
		b2.addActionListener(this);
               b3.addActionListener(this);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(500,500);
	}
	public void actionPerformed(ActionEvent e)
	{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try
		{
			if(e.getSource()==b1)
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Allen","Allen0209");
				String sql = "insert into Project values(\'"+t0.getText()+"\',"+t1.getText()+",\'"+t2.getText()+"\',\'"+t3.getText()+"\')";
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
                                                ta.setText("Emp_Name: "+t0.getText()+", Emp_Id: "+t1.getText()+",Emp_Salary:"+t2.getText()+", Emp_Experiance: "+t3.getText());
			}
			if(e.getSource()==b2)
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Allen","Allen0209");
				String sql = "delete from Project where Emp_Id = "+t1.getText()+"";
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
			}
                                   if(e.getSource()==b3)
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Allen","Allen0209");
				String sql = "select * from  Project where Emp_Id="+t1.getText()+"";
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
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
		new ProEmpcheck();			
	}
}