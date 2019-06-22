class base4
{
	void disp()
	{
		System.out.println("Base Display");
	}
}
class sub4 extends base4
{
	
	void disp()
	{
		System.out.println("Sub1 display");
	}
}
public class prac4 {

	public static void main(String args[]){
		
		sub4 s1=new sub4();
		s1.disp();
	}
}
