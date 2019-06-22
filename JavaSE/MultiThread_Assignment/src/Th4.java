
public class Th4 implements Runnable {
	
	public void run()
	{
		  synchronized(this)
		  {   System.out.println(Thread.currentThread());
			  for(int i=0;i<=10;i++)
			  {
				  System.out.println(i);
			  }
		  }
		
	}

	public static void main(String args[])
	{
		Th4 ob=new Th4();
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob);
		t1.start();
		t2.start();
		
	}
  
}
