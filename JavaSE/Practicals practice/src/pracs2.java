import java.util.*;
import java.io.*;
import java.io.*;
import java.util.*;
class Employee implements Serializable
{
	private int  empid;
	private String empname;
	private String desgn;
	private int sal;
	public Employee(int empid, String empname, String desgn, int sal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.desgn = desgn;
		this.sal = sal;
	}
	void disp()
	{
		System.out.println(empid+" "+empname+" "+desgn+" "+sal);
	}
}
public class pracs2 {
public static void main(String[] args) {
	List<Employee> list=new ArrayList<Employee>();
	Employee e=new Employee(123,"Onkar","Sr Engineer",45666);
	Employee e1=new Employee(158,"Pawan","Asst Engineer",45666);
	list.add(e);
	list.add(e1);
	File f=new File("E:\\Data\\employee.txt");
	try(FileOutputStream fos=new FileOutputStream(f))
	{
    try(ObjectOutputStream oos=new ObjectOutputStream(fos))
    {
    	  oos.writeObject(list);
    	
    }
	}
	catch(IOException ee)
	{
		ee.printStackTrace();
	}
	try(FileInputStream fis=new FileInputStream(f))
	{
    try(ObjectInputStream ois=new ObjectInputStream(fis))
    {
    	 try {
			List<Employee>list1=(List<Employee>) ois.readObject();
			
		  Iterator i=list1.iterator();
			while(i.hasNext())
			{
				   Employee em=(Employee)i.next();  //Using iterator
				   em.disp();
		     }
		    } 
    	  catch (ClassNotFoundException e5) {
			// TODO Auto-generated catch block
			e5.printStackTrace();
		}
    	
    }
	}
	catch(IOException ee)
	{
		ee.printStackTrace();
	}
}
}

