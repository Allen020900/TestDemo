
import java.util.Arrays;
public class AArray{
    public static void main(String args[])
    {
        int []arr={10,20,-1,3,2};
        Arrays.sort(arr);
       
        System.out.println("MIN="+arr[0]);
        System.out.println("MAX="+arr[arr.length-1]);
        System.out.println("Middle="+arr[(arr.length)/2]);
        System.out.println("Even Numbers=");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            System.out.println(arr[i]);
            
        }
        System.out.println("Odd Numberss=");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            System.out.println(arr[i]);
            
        }
        System.out.println("Positive Numbers=");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            System.out.println(arr[i]);
            
        }
        System.out.println("Negative Numbers=");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            System.out.println(arr[i]);
            
        }

      
    }
}