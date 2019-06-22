abstract class Game {
  abstract void play();
}

class football extends Game
{
	void play()
	{
		System.out.println("Playing Football...");
	}
}
class cricket extends Game
{
	void play()
	{
		System.out.println("Playing Cricket...");
	}
}
class Tennis extends Game
{
	void play()
	{
		System.out.println("Playing Tennis...");
	}
}
public class first
{
	static void perform(Game ref)
	{
		if (ref instanceof cricket)
		ref.play();
	}
    public static void main(String args[])
    {
        Game ob[] = new Game[3];
        ob[0]= new football();
        ob[1]= new cricket();
        ob[2]= new Tennis();
        
        for(int i=0;i<3;i++)
    	{
    		perform(ob[i]);
    	}
}
}