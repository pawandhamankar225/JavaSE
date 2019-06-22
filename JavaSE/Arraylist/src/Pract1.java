import java.util.*;
class MyClass
{
	int i=5;
	
}
public class Pract1 {

	public static void main(String args[])
	{
	ArrayList<Object> a=new ArrayList<Object>();
	MyClass m=new MyClass();
	MyClass m1=new MyClass();
	MyClass m2=new MyClass();
	//System.out.println(m2);
	a.add(m);
	a.add(m2);
	a.add(m1);
	System.out.println("Size :"+a.size());
	a.remove(0);
	System.out.println("Size: "+a.size());
	System.out.println("Contents :"+a);
	MyClass b=(MyClass) a.get(1);
	System.out.println(b);
	
	
}
}
