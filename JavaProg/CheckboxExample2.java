// importing necessary packages  
import java.awt.*;    
import java.awt.event.*;    
public class CheckboxExample2 implements ItemListener 
{    
	Checkbox checkbox1,checkbox2;
	final Label label;
	CheckboxGroup cbg;
// constructor to initialize   
     CheckboxExample2() {    
// creating the frame  
        Frame f = new Frame ("CheckBox Example");    
// creating the label  
        label = new Label();             
// setting the alignment, size of label       
   label.setAlignment(Label.CENTER);    
        label.setSize(400,100);  
			cbg=new CheckboxGroup();
// creating the checkboxes  
        checkbox1 = new Checkbox("MALE",cbg,false);    
        checkbox1.setBounds(100, 100,  50, 50);    
         checkbox2 = new Checkbox("FEMALE",cbg,false);    
        checkbox2.setBounds(100, 150,  50, 50);    
// adding the checkbox to frame  
f.add(checkbox1);  
f.add(checkbox2);   
f.add(label);    
  
// adding event to the checkboxes  
        checkbox1.addItemListener(this);
		    
        checkbox2.addItemListener(this);
		
// setting size, layout and visibility of frame  
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);    
     }    
	 public void itemStateChanged(ItemEvent e)
	 {
		 if(e.getSource()==checkbox1)
		 {
			label.setText("MALE");
			}
		 if(e.getSource()==checkbox2)
		 {
			label.setText( "FEMALE"); 
			}
	 }
// main method  
public static void main(String args[])    
{    
   CheckboxExample2 obj =new CheckboxExample2( );
}    
}    