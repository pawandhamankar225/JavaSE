public class Th1 implements Runnable{
 synchronized  public void run()
    {
	  if(Thread.currentThread().getName().equals("First"))
	  {
	 for(int i=1;i<=27;i++)	  
	   {
		   System.out.println(i);
	   
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

	 for(char i='A';i<='Z';i++)	  
	   { 	 notifyAll();
		   System.out.println(i);
		   
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
		Th1 ob=new Th1();
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob);
		t1.setName("First");
		t2.setName("Second");
		t1.start();
		t2.start();
	}
	
}
