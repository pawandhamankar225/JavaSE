
public class Ascend implements Runnable{
 synchronized  public void run()
    {
	  if(Thread.currentThread().getName().equals("First"))
	  {
	 for(int i=1;i<=50;i++)	  
	   {
		 
		   System.out.println("First"+i);
	   
	  try{
		  wait();
	  }
	  catch(InterruptedException ie)
	  {
		  
	  }
	   
	  notifyAll();
    }
	  }
 else
 {

	 for(int i=50;i>=1;i--)	  
	   { 	 notifyAll();
		   System.out.println("Second"+i);
		   
		   try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
 }
 }
    	
    }
	public static void main(String args[])
	{
		Ascend ob=new Ascend();
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob);
		t1.setName("First");
		t2.setName("Second");
		t1.start();
		t2.start();
	}
	
}
