import java.util.Scanner;

class pratham extends Exception
{
	 pratham(String mess)
	{  
		super(mess);
	}
}
class find {
  private String m;
	void disp(String m) throws pratham
	{
		this.m=m;
		if(m.equalsIgnoreCase("Prathamesh"))
		{
			throw new pratham("Prathamesh is mad");
		}
	}
}
public class except
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name ");
		find f=new find();
		try {
			f.disp(sc.nextLine());
		} catch (pratham e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}