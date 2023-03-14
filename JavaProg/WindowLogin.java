import java.util.*; 
import java.awt.*; 
import java.awt.event.*; 
 public class WindowLogin extends Frame implements ActionListener
  {   
       Button b1;
       Label l1,l2,l3;
       TextField tf1,tf2,  
    WindowLogin() 
     {  
        l1=new Label("USERNAME" ); 
        l2=new Label("PASSWORD" );
        tf1=new TextField( ); 
        tf2=new TextField( ); 
        l3=new Label( );
        b1=new Button("LOGIN");
        l1.setBounds(30,30,50,20); 
        l2.setBounds(30,70,80,20); 
        tf1.setBounds(120,30,80,20); 
        tf2.setBounds(120,70,80,20);
        l3.setBounds(40,120,80,20);
        b1.setBounds(40,90,50,20); 
        b1.addActionListener(this); 
        add(b1); 
        add(l1);
        add(l2); 
        add(tf1); 
        add(tf2); 
        add(l3);
        setSize(500,500); 
        setVisible(true); 
        setLayout(null); 
     }  
    public void actionPerformed(ActionEvent e) 
     { 
       String s1=tf1.getText( ); 
       String s2=tf2.getText( );
       if(s1.compareTo(s2)==0)
        {  
          l3.setText("WELCOME"); 
        } 
       else 
        { 
         l3.setText("INVALID");
        } 
     }
     
           
   public static void main(String args[ ]) 
    { 
         WindowLogin obj= new WindowLogin( ); 
    } 
 }
 
        
       
 
       