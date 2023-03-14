import java.util.*; 
import java.lang.Thread; 
class Car extends Thread 
 { 
   public void run( ) 
    { 
      System.out.println("Threads"); 
    } 
  
public static void main(String args[ ]) 
 { 
   Car obj=new Car( ); 
   obj.start( ) ; 
 }
 } 