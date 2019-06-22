



public class Th1 extends Thread{

	public void run()
	{
		for(char i='A';i<='J';i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  Th1 a=new Th1();
    Thread t1=new Thread(a);
    Thread t2=new Thread(a);
     t1.start();
     t2.start();
	}
	

}
