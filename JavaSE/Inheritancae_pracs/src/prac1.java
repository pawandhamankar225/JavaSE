class base 
{
	int num=10;
	void disp1()
	{
		System.out.println(num);
	}
	
}
class sub extends base
{
	int num=20;
	void disp2()
	{
		System.out.println(num);
	}
}

public class prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       sub  m=new sub();
       m.disp2();
       m.disp2();
		
	}

}
