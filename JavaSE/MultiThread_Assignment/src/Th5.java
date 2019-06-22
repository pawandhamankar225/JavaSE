
public class Th5 implements Runnable {
	
	synchronized public void run()
	{
	   // Thread t=Thread.currentThread();
	     if(Thread.currentThread().getName().equals("First"))
			{System.out.println(Thread.currentThread());
			   
			for(int i=1;i<=50;i++)
			
				System.out.println(i);
			        try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
			}
	     else
			{
				System.out.println(Thread.currentThread());
			for(int i=50;i>=1;i--)
			
				System.out.println(i);
			       try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			}
			
	

		
	}

	
public static void main(String args[])
{
	Th5 ob= new Th5();
	Thread t1 = new Thread(ob);
	t1.setName("First");
	Thread t2 =new Thread(ob);
	t2.setName("Second");
	t1.start();

	t2.start();
	
	
	
}
}






