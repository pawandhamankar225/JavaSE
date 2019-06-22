//BASICS
class  Animal
{
	String name;
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal
{
	void breed()
	{
		System.out.println("Golden retriever");
	}
	void eat()
	{   //super.eat();
		System.out.println("Dog is eating");
		//super.eat();
	}   
	Dog()
	{
		super();
	}
}

public class MyDemo1_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal d=new Dog();
		//d.eat();

	}

}
