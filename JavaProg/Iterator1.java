import java.util.*;
class Iterator1
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist
		list.add("Ravi");//Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		//Traversing list through Iterator
		Iterator itr=list.iterator();
		System.out.println(list);//displays as [   ]
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}