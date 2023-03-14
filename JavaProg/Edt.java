import java.awt.*;
import java.awt.event.*;

class ButtonExample extends Frame 

{
  public static void main(String args[])
  {
    new ButtonExample();
  }
  Label l1;
  
  TextField t1;
 
  
  ButtonExample()
  {
    Frame obj=new Frame("Frame");//By Creating Frame Object    
    
    l1=new Label("UserName");
   
    t1=new TextField();
    
   
    t1.setBounds(200,100,75,40);
    
    l1.setBounds(50,100,75,40);
    
   
    obj.add(l1);
    
    
    obj.add(t1);
    
    obj.setSize(400,400);
    obj.setLayout(null);
    obj.setVisible(true);
  }
}