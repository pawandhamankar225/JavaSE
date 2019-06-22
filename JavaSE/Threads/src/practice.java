class manya implements Runnable
{

	synchronized  void disp()
	{
		
		if(Thread.currentThread().getName().equals("Manya1"))
		{
			for(int i=0;i<5;i++)
		{  
			System.out.println(i);
		
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			notifyAll();
		}
	}
	
	else
	{for(int i=50;i>=1;i--)
	{  
		System.out.println(i);
		notifyAll();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		disp();
	}
	


}
public class practice
{
	public static void main(String[] args) {
		manya m=new manya();
		Thread t1=new Thread(m);
		t1.setName("Manya1");
	    t1.start();
	    Thread t2=new Thread(m);
	    t2.setName("Manya2");
	    t2.start();
	}
}

