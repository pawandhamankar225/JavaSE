class base
{
	static
	{
		System.out.println("in base static");
	}
	base()
	{
		System.out.println("base const");
	}
}
class sub extends base
{
	static
	{
		System.out.println("in sub static");
	}
}
public class myclass
{
	
	public static void main(String args[])
	{
		base b=new base();

		System.out.println("....................");
		sub s=new sub();
	}
}











