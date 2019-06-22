// one try , multiple catch blocks.
class A
{ int num;
	A(int num)
	{
		this.num=num;
	}
	
public String toString()
{
	return "["+num+"]";
}
}

public class demo3
{
	public static void main(String args[])
	{   
		/*int arr[]=new int[4];
		A ob=new A(200);
		demo3 e1= new demo3(); //.toString returns */
		System.out.println("Array created");
		/*try
		{
		System.out.println(ob.toString());
		}*/
		//System.out.println(e1.hashCode());
		/*try
		{
			arr[3]=10;
			e1.toString();
		}*/
		catch(ArrayIndexOutOfBoundsException ae) 
		{
			System.out.println(ae);
		}
		catch(NullPointerException ne)
		{
			System.out.println(ne);
		}
		System.out.println("Array assigned");
	}
}












