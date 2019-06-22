class vehicle
{
	public void start()
	{
		System.out.println("In vehicle..");
	}
}
class fourwheeler extends vehicle
{
	public void start()
	{
		System.out.println("In fourwheeler");
	}
}
public class second_qn {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
  vehicle a=new fourwheeler();
        a.start();
	}

}
