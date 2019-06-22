import static java.lang.System.*;
interface Game
{
	void play();
}
class cricket implements Game
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		out.println("Chalo Cricket khele......");
	}
	
}
class football implements Game
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		out.println("Lets Football........");
	}
	
}
class tennis implements Game
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		out.println("Chala tennis khelu....");
	}
	
}
class call<T extends Game>
{
	
	
	public call(T ob)
	{
		ob.play();
	}
	
}
public class Ans3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		call<football> a=new call<football>(new football());
	//	call<football> a=new call<football>(new cricket());   error
	//	call<football> a=new call<football>(new tennis());    error
		
		
		
		/*a.perform(new cricket());
		a.perform(new football());
		a.perform(new tennis());*/
		
	}

}
