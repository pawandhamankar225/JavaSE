public class Th6 implements Runnable
{
	synchronized public void run()
	{
		for(int i=0;i<5;i++)
		{	
			System.out.println("Hello"+i);
			/*try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ae)
			{
				
			}*/
		}
	}
	public static void main(String args[])
	{
		Th6 ob=new Th6();
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob);
		t1.start();
		t2.start();
	}
}