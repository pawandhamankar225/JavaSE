class base1
{ 
	base1(int a)
	{
		System.out.println(a);
	}
}

class sub1 extends base1
{
	private int rollno;
	private String name,address;
	sub1()
	{super(500);
		System.out.println("i m in default constructor");
	}
	public sub1(String name)
	{super(50);
		this.name=name;
		System.out.println("name:" +name);
	}
	public sub1(int rollno, String address)
	{
		super(500);
		this.rollno=rollno;
		this.address=address;
		System.out.println("rollno:" +rollno+"\t address:"+address);
	}
}

public class ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 sub1 s1=new sub1("ABC");
 
 
	}

}
