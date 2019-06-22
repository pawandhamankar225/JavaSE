public class Th7 implements Runnable
{
	  public synchronized void run()
	  {
		  for(int i=0;i<5;i++)
		  {
			  System.out.println("Hello"+i);
			  try
			  {
				  Thread.sleep(100);
			  }
			  catch(InterruptedException e)
			  {
				  
			  }
			  
		  }
	  }
	
	  public static void main(String args[])
	  {
		  Th7 ob=new Th7();
		  Thread t1=new Thread(ob);
		  Thread t2=new Thread(ob);
		  t1.start();
		  t2.start();
	  }
	  
}