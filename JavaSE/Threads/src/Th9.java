/*public class Th9 implements Runnable
{
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{	
				System.out.println("Hello"+i);
			}
		}
	}
	public static void main(String args[])
	{
		Th9 ob=new Th9();
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob);
		t1.start();
		t2.start();
		
		System.out.println("Both the threads are over");
	}
}
*/
public class Th9 implements Runnable
{
	public void run()
	{
		synchronized(this)
		{ System.out.println(Thread.currentThread());
			for(int i=0;i<5;i++)
			{	
				System.out.println("Hello"+i);
			}
		}
	}
	public static void main(String args[])
	{
		Th9 ob=new Th9();
		Th9 ob1=new Th9();
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob1);
		t1.start();
		t2.start();
		try
		{
			t1.join();
			//t2.join();
		}
		catch(InterruptedException e)
		{
		}
		System.out.println("Both the threads are over");
	}
}

