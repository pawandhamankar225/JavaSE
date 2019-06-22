class parent
{
	parent()
	{
		
	}
	void run()
	{
		System.out.println("Hiii");
	}
}

class child extends parent
{
	child()
	{
		super.run();
		
	}
	
}

public class multi_lvl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child m = new child();
		
	
	}

}
