import java.awt.*;
import java.awt.event.*;
/*Frame can be created in two ways : 
   1-Extending Frame Class
   2-Creating Frame Object*/
class ButtonExample extends Frame implements ActionListener
{
  public static void main(String args[])
  {
    new ButtonExample();
  }
  Label l1;
  Label l2;
  TextField t1;
  TextField t2;
  Label l3;
  ButtonExample()
  {
    Frame obj=new Frame("Frame");//By Creating Frame Object    
    Button b1=new Button("Login");    
    b1.addActionListener(this);
    l1=new Label("UserName");
    l2=new Label("Password");
    l3=new Label("Label ");
    t1=new TextField();
    t2=new TextField();
    b1.setBounds(50,200,100,50);
    t1.setBounds(200,100,75,40);
    t2.setBounds(200,150,75,40);
    l1.setBounds(50,100,75,40);
    l2.setBounds(50,150,75,40);
    l3.setBounds(200,200,100,50);
    obj.add(b1);
    obj.add(l1);
    obj.add(l2);
    obj.add(l3);
    obj.add(t1);
    obj.add(t2);
    obj.setSize(400,400);
    obj.setLayout(null);
    obj.setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
    String s1=t1.getText();
    String s2=t2.getText();
    if(s1.equalsIgnoreCase(s2))
      l3.setText("You Can Login");
    else
      l3.setText("Wrong Username or Password");    
  }
}