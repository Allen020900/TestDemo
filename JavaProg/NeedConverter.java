import Measure.Converter;
public class NeedConverter
{
public static void main(String args[])
{
Converter c=new Converter();
System.out.println(" mm to m is "+c.mmtom(100));
System.out.println(" cm to m is "+c.cmtom(1000));
System.out.println(" m to km is "+c.mtokm(3000));
}
}