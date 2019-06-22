import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import sun.applet.Main;

class Vitadata implements Serializable
{   private int no;
    private String name;
	public Vitadata(int no, String name) {
	//super();
	this.no = no;
	this.name = name;
   }
	void disp()
	{
		System.out.println(no+" "+name);
	}
	@Override
	public String toString() {
		return "Vitadata [no=" + no + ", name=" + name + "]";
	}
	
	
}
public class prac3 {
	public static void main(String[] args) {
	
	Map<Vitadata,Integer> h=new HashMap<Vitadata,Integer>();	
	Vitadata e=new Vitadata(54,"Prathamesh");
	Vitadata e1=new Vitadata(56,"Akshay");
	Vitadata e2=new Vitadata(57,"Manoj");
	h.put(e, 100);
	h.put(e1, 250);
	h.put(e2, 215);
	File f=new File("E:\\Data\\pktest.txt");
	try(FileOutputStream fos=new FileOutputStream(f))
	{
		try(ObjectOutputStream oos=new ObjectOutputStream(fos))
		{
			oos.writeObject(h);
		}
	}
	catch(IOException a)
	{
		a.printStackTrace();
	}
	
	try(FileInputStream fis=new FileInputStream(f))
	{
		try(ObjectInputStream ois=new ObjectInputStream(fis))
		{
			Map<Vitadata,Integer> m1=( Map<Vitadata,Integer>)ois.readObject();
			Set set=m1.entrySet();
			Iterator i=set.iterator();
			while(i.hasNext())
			{
				Map.Entry<Vitadata,Integer> p=(Entry<Vitadata,Integer>) i.next();
				    
				System.out.println(p.getKey());
				System.out.println(p.getValue());
				
				
			}
			   
			
			  
			
		} catch (ClassNotFoundException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
	}
	catch(IOException a)
	{
		a.printStackTrace();
	}
	
	
}
}