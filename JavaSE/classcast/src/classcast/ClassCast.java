/**
 * 
 */
package classcast;

/**
 * @author pkale
 *
 */
class Vehicle
{
	 public void start()
	{
		System.out.println("start");
	}
}
class Twowheeler extends Vehicle
{
	public void start()
	{
		System.out.println("start");
	}
	public void fillfuel()
	{
		System.out.println("fillfuel");
	}
}
class ThreeWheeler extends Vehicle
{
	public void start()
	{
		System.out.println("start");
	}
	
}
class FourWheeler extends Vehicle
{
	public void start()
	{
		System.out.println("start");
	}
	
}

public class ClassCast {
static void perform(Vehicle v)
{
	
	v.start();
	if(v instanceof Twowheeler )
	{
		Twowheeler t=(Twowheeler)v;
	t.fillfuel();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
perform(new Twowheeler());



	}

}
