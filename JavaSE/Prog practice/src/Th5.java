class pk implements Runnable
{
	public synchronized void run()
	{ System.out.println(Thread.currentThread());
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
public class Th5 
{
	public static void main(String[] args) {
     pk p=new pk();
     Thread t1=new Thread(p);
     Thread t2=new Thread(p);
     t1.start();
     t2.start();
}
}