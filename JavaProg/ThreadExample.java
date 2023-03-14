import java.util.*; 
import java.lang.Thread; 
 class ThreadEx extends Thread
 { 
  
     public void run( ) 
      {
       try 
        {  
        System.out.println("Java is an Object Programming"+getName()); 
        sleep(1000); 
        }
       catch(InterruptedException e)
        { 
          System.out.println(e); 
         }  
      } 
  } 
public class ThreadExample extends Thread 
 { 
    public static void main(String args[])  
     { 
       ThreadEx t1=new ThreadEx( ); 
       ThreadEx t2=new ThreadEx( );  
       t1.setName("Thread1");
       t2.setName("Thread2"); 
       t1.start( ) ; 
       t2.start( ) ; 
     } 
 }
   

 
