// importing awt libraries  
import java.awt.*;    
import java.awt.event.*;    
	
public class KeyListenerExample extends Frame implements KeyListener {    
		 
 Label l;    
    TextArea area;    
		 
    KeyListenerExample() {    
           
        l = new Label();    
 
        l.setBounds (20, 50, 100, 20);    
 
        area = new TextArea();    
  
        area.setBounds (20, 80, 300, 300);    
 
        area.addKeyListener(this);  
  
        add(l);  
        add(area);    
// setting the size, layout and visibility of frame  
        setSize (400, 400);    
        setLayout (null);    
        setVisible (true);    
    }    
// overriding the keyPressed() method of KeyListener interface where we set the text of the label when key is pressed  
    public void keyPressed (KeyEvent e) {    
        l.setText ("Key Pressed");    
    }    
// overriding the keyReleased() method of KeyListener interface where we set the text of the label when key is released  
    public void keyReleased (KeyEvent e) {    
        l.setText ("Key Released");    
    }    
// overriding the keyTyped() method of KeyListener interface where we set the text of the label when a key is typed  
    public void keyTyped (KeyEvent e) {    
        l.setText ("Key Typed");    
    }    
  // main method  
    public static void main(String[] args) {    
        KeyListenerExample obj=new KeyListenerExample();    
    }    
}   