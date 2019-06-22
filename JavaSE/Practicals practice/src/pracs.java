import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;
public class pracs {

	public static void main(String[] args) {
HashMap<Integer,String> m=new HashMap<Integer,String>();
m.put(1,"Sowrabh");
m.put(2, "Omkar");
m.put(1,"Pk");
m.put(3, "Vijesh");
File f=new File("E:\\Data\\temp.txt");
try(FileOutputStream fos=new FileOutputStream(f))
{
	try(ObjectOutputStream oos=new ObjectOutputStream(fos))
	{
		oos.writeObject(m);
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
			HashMap<Integer,String>m1=(HashMap<Integer, String>) ois.readObject();
			Set set=m1.entrySet();
			Iterator i=set.iterator();
			while(i.hasNext())
			{
				Map.Entry k=(Entry)i.next();
				//System.out.println(k.getKey());
				//System.out.println(k.getValue());
			}
			Scanner sc=new Scanner(System.in);
			while(true)
			{
			System.out.println("Enter a key");
			int a=sc.nextInt();
			if(a==4)
			break;
			System.out.println(m1.get(a));
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