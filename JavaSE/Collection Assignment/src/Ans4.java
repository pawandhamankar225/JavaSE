
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
	
	/*@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", desgn=" + desgn + ", sal=" + sal + "]";
	}*/

	void disp()
	{
		System.out.println(empid+" "+empname+" "+desgn+" "+sal);
	}
}
public class Ans4 {

	public static void main(String[] args) 
	{
	List<Object>list=new ArrayList<Object>();	
	Employee e=new Employee(123,"Onkar","Sr Engineer",45666);
	Employee e1=new Employee(158,"Pawan","Asst Engineer",45666);
	Employee e2=new Employee(777,"Prathamesh","Manager",100000);
	Employee e3=new Employee(101,"Akshay","Junior Engineer",25666);
	Employee e4=new Employee(128,"Manoj","SW Engineer",20666);
	list.add(e);
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	File f=new File("E:\\Collection assgn\\employlist");
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
			//System.out.println(ois.readObject());         //Using toString method
			/*for(int i=0;i<5;i++)
             {Employee a=(Employee) list1.get(i);       //Without using iterator
			a.disp();
			}*/
			//System.out.println(list1);
		  Iterator i=list1.iterator();
			while(i.hasNext())
			{
				   Employee em=(Employee)i.next();  //Using iterator
				   em.disp();
		     }
		} catch (ClassNotFoundException e5) {
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

