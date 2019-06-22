class Top1
{
	void disp1()
	{
		System.out.println("I am in parent class Top");
	}
}
class Bottom1 extends Top1
{
	void disp1()
	{
		System.out.println("I am in Bottom1 class");
	}
}
class Bottom2 extends Top1
{
	void disp1()
	{
		System.out.println("I am in  Bottom2 class");
	}
}
class Bottom3 extends Top1
{
	void disp1()
	{
		System.out.println("I am in  Bottom3 class");	
	}
}
public class ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Top1 t=new Bottom1();
 t.disp1();
 
 Top1 t1=new Bottom2();
 t1.disp1();
 
 Top1 t2=new Bottom3();
 t2.disp1();
	}

}
