class parent1
{
	void disp()
	{
		System.out.println("I am in class Parent1");
	}
}
interface parent2
{
	void disp();
		
}
class child extends parent1 implements parent2
{
	public void disp()
	{
		System.out.println("I am in child class");
	}
}
public class ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child c=new child();
c.disp();
	}

}
