class vehicle
{
public void start()
{
System.out.println("I am in Parent Class");	
}
}
class fourwheeler extends vehicle
{
public void start()
{
System.out.println("I am in Child Class");
}
}
public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
vehicle f=new fourwheeler();
f.start();
	}

}
