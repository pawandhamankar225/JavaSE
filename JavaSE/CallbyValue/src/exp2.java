class sample1
{
	private int num;
	
	sample1(int num)
	{
		this.num=num;
	}
	public int getnum()
	{
		return num;
	}
	public  void change(sample1 a)
	{
		a.num=200;
	}
	
}
public class exp2
{
	public static void main(String args[])
	{
		sample1 s=new sample1(100);
		s.change(s);
		System.out.println(s.getnum());
	}
}