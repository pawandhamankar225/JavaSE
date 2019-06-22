interface course
{
	void disp();
}
class mscit implements course
{

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Mscit starting......");
	}
	
}
class pgdac implements course
{

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Pgdac starting....");
	}
	void precat()
	{
		System.out.println("Get ready for precat");
	}
}
class pgdbda implements course
{

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Pg-DBDA starting.....");
	}
	
}
public class Demo2 {

	static void perform(course c)
	{    
		if(c instanceof pgdac)
	{
		pgdac p=(pgdac) c;
		p.disp();
	    p.precat();
		
	}
	}
	public static void main(String[] args) {
		perform(new pgdbda());
		perform(new pgdac());
	}
}
