interface Weapon
{
	void attack();
}
class Sword implements Weapon
{
	public void attack()
	{
		System.out.println("attack with Sword");
	}
}
class Gun implements Weapon
{
	public void attack()
	{
		System.out.println("attack with Gun");
	}
	public void fillBullets()
	{
		System.out.println("filling bullets....");
	}
}
class Bomb implements Weapon
{
	public void attack()
	{
		System.out.println("attack with Bomb");
	}
}
public class Demo
{
// make sure "fight()" is loosely coupled with a specific Weapon
	static void fight(Weapon ref)
	{
		//if(ref instanceof Gun) // it means content of ref "is-a" Gun
		//{
			Gun g=(Gun)ref;  // downcasting
			g.fillBullets();
		//}
		ref.attack();
	}
	public static void main(String args[])
	{
		fight(new Gun());
		fight(new Sword());
		
	}
}















