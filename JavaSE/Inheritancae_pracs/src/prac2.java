class base1 
{
	int num=10;
	void disp1()
	{
		System.out.println(num);
	}
	base1()
	{
		System.out.println("Inside Base");
	}
	
}
class sub1 extends base1
{
	int num=20;
	void disp2()
	{
		System.out.println(num);
	}
	sub1()
	{
		System.out.println("Inside Sub");
	}
}

public class prac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       sub1  m=new sub1();
       m.disp2();
       m.disp2();
		
	}

}
