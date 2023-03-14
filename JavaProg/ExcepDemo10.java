import java.util.*;
public class ExcepDemo10
{
 public static void main (String args[])
 {
 Scanner sc = new Scanner(System.in);
System.out.println("Enter the number num1");
 String s1 = sc.next();
 System.out.println("Enter the number2");
 String s2=sc.next();
 try
 { 
 int num1 = Integer.parseInt(s1);
 int num2 = Integer.parseInt(s2);
 System.out.println("num1 is " +num1);
 System.out.println("num2 is " +num2);
int res = num1/num2;
 System.out.println("The result is " +res);
} 
catch(NumberFormatException e) 
{ 
  System.out.println("Exception " +e);
}
catch(ArithmeticException e)
{
System.out.println("Exception" +e);
} 
}
}



