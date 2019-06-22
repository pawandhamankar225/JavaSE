//Abstract Class Example
abstract class electronic_app
{
   public abstract void on();
   public abstract void off();
   public void run(){
	   System.out.println("sds");
   }
}
class tv extends electronic_app
{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("TV is on");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("TV is off");
	
	}
	
}
public class abstr_exp {

	static void perform_on(electronic_app ptr)
			{
		         ptr.on();
			}
	static void perform_off(electronic_app ptr)
	{
		ptr.off();
	}
	static void run(electronic_app ptr)
	{
		ptr.run();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perform_on(new tv());
		perform_off(new tv());
		run(new tv());
	}

}
