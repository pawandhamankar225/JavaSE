//Even Odd Using Classlock
public class Th implements Runnable{
	static Class cs;
	
	static void disp()
	{
		synchronized(cs)
		{      if(Thread.currentThread().getName().equalsIgnoreCase("First"))
		      { 
			   for(int i=1;i<=20;i++)
			   {if(i%2!=0)
				System.out.println("First"+i);
				 try {
					 
					cs.wait();
			 	      } 
				 catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				                      }
				 cs.notifyAll();
			    }
		      }
		else
		{ 
			for(int i=1;i<=20;i++)
				{cs.notifyAll();
				   if(i%2==0)
				System.out.println("Second"+i);
			     try {
					cs.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    }
		      }
		}
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		disp();
	}

	
	public static void main(String args[])
	{  try {
		cs=Class.forName("Th");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		Th a=new Th();
		Th b=new Th();
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		t1.setName("First");
		t2.setName("Second");
		t1.start();
		t2.start();
	}
	

}

	