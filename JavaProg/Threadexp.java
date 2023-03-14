import java.util.*; 
import java.lang.Thread;
class Threadexp implements Runnable 
 { 
   public void run( ) 
    { 
      System.out.println("Runnable inter face " ); 
     } 
   public static void main(String args[ ]) 
     { 
       Threadexp obj =new Threadexp( ) ; 
       	Thread e=new Thread(obj); 
         e.start(); 
     }
  }