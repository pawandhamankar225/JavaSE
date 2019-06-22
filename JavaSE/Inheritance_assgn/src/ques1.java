/*class A
{
	 void disp1()
	{
		 
		System.out.println("I am in Parent class");
		
	}
	A()
	{
		System.out.println("I am in A's default constructor");
	}
	A(int a)
	{
		System.out.println("I am in A's 1 Param constructor");
		System.out.println(a);
	}
}
class B extends A
{
	 void disp2()
	{
		System.out.println("I am in Child-B class");
		
	}
	B()
	{
		super(20);
		System.out.println("I am in B's default constructor");
	}
}
class C extends B
{
	 void disp3()
	{
		System.out.println("I am in Child-C class");
	}
	C()
	{
		
		System.out.println("I am in C's default constructor");
	}
}
public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
  B b=new B();
   b.disp1();
   b.disp2();
   C c=new C();
   c.disp2();
   c.disp3();
	}

}
*/