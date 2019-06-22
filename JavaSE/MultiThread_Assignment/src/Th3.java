
public class Th3 implements Runnable{

	public void run()
	{ 
		synchronized(this)
		{
	       System.out.println(Thread.currentThread());
		for(int i=0;i<=5;i++)
		{
			System.out.println("Exec"+i);
		}
		}
		
	}

	public static void main(String args[])
	{
		Th3 a=new Th3();
		Thread t1= new Thread(a);
		Thread t2= new Thread(a);
		Thread t3= new Thread(a);
		t1.setName("First");
		t2.setName("Second");
		t3.setName("Third");
		t1.start();
		t2.start();
		t3.start();
	}
	
}
