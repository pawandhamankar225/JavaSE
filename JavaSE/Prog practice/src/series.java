interface television {

	void watch();
}
class got implements television
{

	@Override
	public void watch() {
		// TODO Auto-generated method stub
		System.out.println("Watching GOT.....");
	}
	 
}
class friends implements television
{

	@Override
	public void watch() {
		// TODO Auto-generated method stub
		System.out.println("Watching friends.....");
	}
	
}
class bigbang implements television
{

	@Override
	public void watch() {
		// TODO Auto-generated method stub
		System.out.println("Watching bigbang........");
	}
	
}
class play<T extends television>
{
	public play(T ob)
	{
		ob.watch();
	}
}

public class series
{
	public static void main(String[] args) {
		play<friends> p=new play<friends>(new friends());
	}
}