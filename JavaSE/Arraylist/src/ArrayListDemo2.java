import java.util.*;
import static java.lang.System.*;
public class ArrayListDemo2
{
	public static void main(String args[])
	{
		ArrayList <Integer>a1=new ArrayList<Integer>();
		out.println("Initial size of a1:  "+a1.size());
		a1.add(5);
		a1.add(10);
		a1.add(15);
		a1.add(20);
		//a1.add(2);
		a1.add(30);
		out.println("After adding size of a1:  "+a1.size());
		Iterator i=a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		out.println("Contents of a1:  "+a1);
		//a1.remove(2); // remove element at index 2
		a1.remove(new Integer(30)); // remove element "2"
		
		out.println("After removing size of a1:  "+a1.size());
		//out.print(a1);
		Iterator i2=a1.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		//	out.println("Contents of a1:  "+a1);
	}
}





