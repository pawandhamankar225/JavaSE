interface A
{
	void disp1();
	
}
interface B extends A
{
	void disp2();	
}
class C implements B
{
	public void disp1()
	{
		System.out.println("I am in disp1 class C");
	}
	public void disp2()
	{
		System.out.println("I am in disp2 class C");
	}
}
public class ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C c=new C();
c.disp1();
c.disp2();
	}

}
