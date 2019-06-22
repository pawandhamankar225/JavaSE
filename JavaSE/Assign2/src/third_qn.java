class A
{
	 A()
	{
		System.out.println("In A");
	}
}
class B extends A
{  int a;
	 B()
	{
		System.out.println("In B");
	}
	void disp(int a)
	{
		this.a=a;
		System.out.println(a);
	}
}
class C extends A
{
	 C()
	{
		System.out.println("In C");
	}
	
}
public class third_qn{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    B ob = new B();
      ob.disp(10);
	}

}
