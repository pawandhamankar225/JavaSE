public class Outer
{
	int num1=20;
	void disp1()
	{
		System.out.println("in disp1");
	}
	Outer()
	{
		System.out.println("in InnerDemo1 def const");
		inner ref=new inner();
		ref.disp2();
	}
	inner y=new inner();
	
static class inner
	{
		int num2=30;
		final int kk=60; 
		static final int op=9;
	 void disp2()
		{
			System.out.println("in disp2");
			//disp1();
		}
	}

	public static void main(String args[])
	{
		Outer o=new Outer();
		System.out.println(o.num1);
		o.disp1();
		//Outer.inner k= 
		
		System.out.println(inner.op);
	}
}


 



