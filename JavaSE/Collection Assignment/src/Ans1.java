import java.io.*;
import java.util.*;
class Myclass implements Serializable
{
	void disp()
	{
		System.out.println("In MyClass");
	}
	
}
public class Ans1 {

public static void main(String[] args) {
	Myclass m=new Myclass();
	Myclass m1=new Myclass();
	Myclass m2=new Myclass();
	Myclass m3=new Myclass();
	Myclass m4=new Myclass();
	ArrayList<Object>a=new ArrayList<Object>();
	a.add(m);
	a.add(m1);
	a.add(m2);
	a.add(m3);
	a.add(m4);
	File f=new File("E:\\Collection assgn\\arraylist.txt");
	try(FileOutputStream fos=new FileOutputStream(f))
	{
	try(ObjectOutputStream oos=new ObjectOutputStream(fos))
	{
		oos.writeObject(a);
		//a=null;
	}
	}     
	catch(IOException e)
	{
		e.printStackTrace();
	}
	try(FileInputStream fis=new FileInputStream(f))
	{
	try(ObjectInputStream ois=new ObjectInputStream(fis))
	{
	       try {
			
			ArrayList<Object>a2= (ArrayList<Object>) ois.readObject();
			Iterator i=a2.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}     
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
}
}
