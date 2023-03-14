import java.util.*;
import  java.awt.*;
import javax.swing.*;
import  java.awt.event.*;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.String;
class screenp extends JFrame implements ActionListener
{
 JLabel l1,l2,l3,l4,l5;
 JTextField t1,t2,t3,t4;
  JButton u= new JButton("Generate ID");
 screen2()
 {

  u.addActionListener(this);
  u.setBounds(50,500,300,50);
  t1=new JTextField();
  t2=new JTextField();
  t3=new JTextField();
  t4=new JTextField();
  l1=new JLabel("Address");
  l2=new JLabel("Pin code");
  l3=new JLabel("Purpose of Deforestation");
  l4=new JLabel("Estimated Land");
  l1.setBounds(50,100,100,40);
  l2.setBounds(50,150,100,40);
  l3.setBounds(50,200,200,40);
  l4.setBounds(50, 200, 100, 40);
  t1.setBounds(250,100,100,40);
t2.setBounds(250,150,100,40);
t3.setBounds(250,200,100,40);
t4.setBounds(250, 250, 100, 40);

  add(u);add(t1);add(t2);add(t3);add(t4);add(l1);add(l2);add(l3);add(l4);
  setSize(700,700);
  setVisible(true);
  setLayout(null);
 }
 public void actionPerformed(ActionEvent e){ 
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try
		{
			
    
     			if(e.getSource()==u){
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","chandrakanth","padma");
				String sql = "insert into project values(\'"+t1.getText()+"\',"+t2.getText()+",\'"+t3.getText()+"\',\'"+t4.getText()+"\')";
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
				
      screen3 jjj=new screen3();
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
  screenp e1=new screenp();
 }
}
