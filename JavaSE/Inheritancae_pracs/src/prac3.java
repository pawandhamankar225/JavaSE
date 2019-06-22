class base2 
{
	int a,b;
	void disp2()
	{
		System.out.println("In base 2");
	}
	base2(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+" "+b);
	}
	
}
class sub2 extends base2
{
	sub2(int a) {
		super(80,60);
      System.out.println(a);		// TODO Auto-generated constructor stub
	}
	int num2=10;
	void disp2()
	{
		System.out.println(num2);
	}
	
}

public class prac3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       sub2  m = new sub2(5);
     /*m.disp2();
       m.disp2();*/
		
	}

}
