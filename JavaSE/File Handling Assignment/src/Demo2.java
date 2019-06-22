import java.io.File;
import java.io.*;
import java.io.Serializable;

class Customer implements Serializable
{
	private int  custid;
	private String custname;
	private  String address;
	private int age;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
public class Demo2 {
	public static void main(String args[])
	{
		File f=new File("e://testing.txt");
		Customer c=new Customer();
		c.setCustid(156);
		c.setCustname("Sachin");
		c.setAge(24);
		c.setAddress("ABC Soc");
		System.out.println(c.getCustid()+" "+c.getCustname()+" "+ c.getAge()+" "+ c.getAddress());
		System.out.println("--------------------------------------------------------------------------");
		try(FileOutputStream fos=new FileOutputStream(f))        //Serialization
		{
			
			try(ObjectOutputStream o=new ObjectOutputStream(fos))
			{
				o.writeObject(c);
			}
			//c=null;
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		try(FileInputStream fis=new FileInputStream(f))          //Deserialization
		{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
				try {
					Customer c1=(Customer) ois.readObject();
					System.out.println(c1.getCustid()+" "+c1.getCustname()+" "+c1.getAddress()+" "+c1.getAge());
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
