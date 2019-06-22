interface Electronicdevice
{
	void on();
	void off();
}
 class TV implements Electronicdevice
{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("ON TV");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("OFF TV");
	}
}

 class Washingmachine implements Electronicdevice
{
	
	@Override
	public void on()
	{
		System.out.println("ON WASHING MACHINE");	
	}
	@Override
	public void off()
	{
		System.out.println("OFF WASHING MACHINE");
	}
}

