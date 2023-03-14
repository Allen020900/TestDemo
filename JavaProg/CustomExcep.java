import java.util.*; 
import java.lang.Exception; 

 class NegativeAgeException extends Exception 
 { 
    NegativeAgeException(String s ) 
     { 
       super(s); 
      } 
 } 
public class CustomExcep
 { 
    void validate(int age)throws NegativeAgeException 
    { 
      if(age<0) 
       { 
          throw new NegativeAgeException("Invalid age");
       } 
      else 
       { 
         System.out.println("Correct age"); 
       } 
  }
   public static void main(String args[])
    {
     try
        { 
      Scanner sc =new Scanner(System.in); 
      System.out.println("ENTER AGE");
      int a =sc.nextInt( );
      CustomExcep obj=new CustomExcep( );
     obj.validate(a); 
        } 
        catch(NegativeAgeException e)
          { 
            System.out.println(e); 
           } 
     } 
   }



       