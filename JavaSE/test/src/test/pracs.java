/*package test;
class learnthis
{
	private int a;
	private static int b;
	
	public  learnthis(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	public int sum()
	{
		 return a+b;
	}

	
}
public class pracs
{
	public static void main(String args[])
	{
		learnthis a1 = new learnthis(5,89);
		System.out.println(a1.sum());
		
		
		
	}
}*/
package test;
class Sample
{
	static void disp1()
	{
		System.out.println("in disp1");
	}
	void disp2()
	{
		System.out.println("in disp2");
	}
}
public class pracs
{
		
		public static void main(String args[])
		{
			Sample s=null;
		
			
			s.disp1();	
			s.disp2();
			
		}
}