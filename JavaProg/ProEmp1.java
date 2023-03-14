import java.util.*;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.String;
import java.awt.*;  
import java.awt.event.*; 
public class ProEmp1 implements ActionListener
{
	Frame f=new Frame("Empolyee Management System");
	Label l0=new Label("Employee_Name");
	Label l1=new Label("Emp_Id");
	Label l2=new Label("Emp_Salary");
	Label l3=new Label("Experiance_in_years");
          Label l4=new Label("Course Teaching");
          Label l5=new Label("NOTE- EVERY OPERATION IS TO BE PERFORMED ON THE BASIS OF UNIQUE EMP ID");
	TextField t0=new TextField();
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
        TextField t4=new TextField();
	TextArea ta=new TextArea();
	Button b1=new Button("Insert");
	Button b2=new Button("Delete");
        Button b3=new Button("Update Salary");

	ProEmp1()
	{
		l0.setBounds(50,60,100,20);
		l1.setBounds(50,80,100,20);
		l2.setBounds(50,100,100,20);
		l3.setBounds(50,120,100,20);
                    l4.setBounds(50,140,100,20);
                    l5.setBounds(20,450,520,20);
		t0.setBounds(200,60,100,20);
		t1.setBounds(200,80,100,20);
		t2.setBounds(200,100,100,20);
		t3.setBounds(200,120,100,20);
                  t4.setBounds(200,140,100,20);
		b1.setBounds(50,200,50,50);
		b2.setBounds(110,200,50,50);
                 b3.setBounds(170,200,90,50);
		ta.setBounds(20,250,400,150);
		f.add(l0);
		f.add(l1);
		f.add(l2);
		f.add(l3);
                    f.add(l4);
                    f.add(l5);
		f.add(t0);
		f.add(t1);
		f.add(t2);
		f.add(t3);
                    f.add(t4);
		f.add(b1);
		f.add(b2);
                    f.add(b3);
		f.add(ta);
		b1.addActionListener(this);
		b2.addActionListener(this);
                 	b3.addActionListener(this);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(600,600);
                        f.addWindowListener(new WindowAdapter()
                          { 
                             public void windowClosing(WindowEvent e) 
                                { 
                                   f.dispose( );
                              }});
	}

	public void actionPerformed(ActionEvent e)
	{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
            PreparedStatement ps1=null;
		ResultSet rs1=null;
		try
		{
			if(e.getSource()==b1)
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Allen","Allen0209");
				String sql = "insert into ProjEmp values(\'"+t0.getText()+"\',"+t1.getText()+",\'"+t2.getText()+"\',\'"+t3.getText()+"\')";
                        String sql1= "insert into ProjEmp1 values("+t1.getText()+",\'"+t4.getText()+"\')";
				ps=con.prepareStatement(sql);
                        ps1=con.prepareStatement(sql1); 
				rs=ps.executeQuery();
                        rs1=ps1.executeQuery();
			}
			if(e.getSource()==b2)
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Allen","Allen0209");
				String sql = "delete from ProjEmp1 where id = "+t1.getText()+"";
                                  ps=con.prepareStatement(sql);
				rs=ps.executeQuery();   
			}
                                  if(e.getSource()==b3)
			{
                                            Class.forName("oracle.jdbc.driver.OracleDriver");
				    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Allen","Allen0209");
				    String sql = "update  ProjEmp set  salary="+t2.getText()+" where id="+t1.getText()+"";
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
		ta.setText("Emp_Name: "+t0.getText()+", Emp_Id: "+t1.getText()+",Emp_Salary:"+t2.getText()+", Emp_Experiance: "+t3.getText());
	}
	public static void main(String args[])
	{
		new ProEmp1();			
	}
}