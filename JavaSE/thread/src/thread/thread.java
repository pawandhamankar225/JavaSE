package thread;

class a implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
}
class b implements Runnable
{
	public void run()
	{
		for(char i='a';i<'c';i++)
		{
			System.out.println(i);
		}
	}
}
public class thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a x = new a();
		Thread t=new Thread(x);
		t.start();
		
	}

}
