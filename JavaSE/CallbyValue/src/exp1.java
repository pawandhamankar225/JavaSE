
// Call by Value
class Sample
{
	void change(int k)
	{
		k=200;
	}
}
public class exp1
{
	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		int data=100;
		System.out.println("Before\t"+data);
		s1.change(data);
		System.out.println("After\t"+data);
	}
}

