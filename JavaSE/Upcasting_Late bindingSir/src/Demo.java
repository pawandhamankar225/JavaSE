class base
{
	void disp()
	{
		System.out.println("base disp");
	}
}
class sub1 extends base     
{
	void disp()     
	{
		System.out.println("sub disp");
	}
}
public class Demo
{
	public static void main(String args[])
	{
		base ref=new sub1();  // upcasting
		ref.disp();  // late binding
	}
}











