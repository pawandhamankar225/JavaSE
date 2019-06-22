
public class Classlock2 implements Runnable{
   static Class c;
	static void display()
    {
          synchronized(c)   //(c)
          { System.out.println(Thread.currentThread());
        	  for(int i=1;i<=10;i++)
        	  {
        		  System.out.println(i);
        	  }
        	  
        	  /*try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
          }
    	
    }
	
	
	public void run()
	{
		display();
		
	}
	
	
	
	
	public static void main(String args[]) throws ClassNotFoundException 
	{
		
			c= Class.forName("Classlock2");
		
		Classlock2 a=new Classlock2();
		Thread t1=new Thread(a);
		Thread t2=new Thread(a);
		  t1.start();
		  t2.start();
		
		
	}
	
}
