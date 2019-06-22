class A8 implements Runnable
{
	
	 static void disp()
	{ synchronized (A8.class)
		 {
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		disp();
	}
}
class pk extends Thread
{
	
	public synchronized void run()
	{
		for(int i=10;i<=50;i++)
		{
			System.out.println(i);
		}
	}
	
	
}

public class Th10 {
public static void main(String[] args) {
	

	A8 a=new A8();
	Thread t1=new Thread(a);
	pk p=new pk();
	Thread t2=new Thread();
	t1.start();
	t2.start();
	

}
}