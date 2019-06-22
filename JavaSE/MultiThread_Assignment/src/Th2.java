
public class Th2 implements Runnable {

	@Override
	 public void run() {
		// TODO Auto-generated method stub
		synchronized(this)
		{
		for(char i='A';i<='J';i++)
		{
			System.out.println(i);
			/*try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		}
	}
	
    public static void main(String args[])
    {
    	Th2 a=new Th2();
    	Thread t1=new Thread(a);
    	Thread t2=new Thread(a);
    	t1.start();
    	t2.start();
    	
    }
}
