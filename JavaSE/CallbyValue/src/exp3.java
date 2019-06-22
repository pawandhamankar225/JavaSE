class Sample3
{
	private int num;
	Sample3(int num)
	{
		this.num=num;
	}
	int getNum()
	{
		return num;
	}
	void change(Sample3 ref)
	{
		ref=new Sample3(500);
		ref.num=200;
	}
}
public class exp3
{
	public static void main(String[] args) 
	{
		Sample3 s1=new Sample3(100);
		System.out.println("Before\t"+s1.getNum());
		s1.change(s1);
		System.out.println("After\t"+s1.getNum());
	}
}
