import java.util.Scanner;

class myexception extends Exception
{ 
	myexception(String ref)
	{
		super(ref);
	}
}
class calct {

      void calc(int n) throws myexception
	{
		if(n>10)
	   throw new myexception("No should be less than ten");		
	}
}

public class exceptest
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		calct t=new calct();
		try {
			t.calc(sc.nextInt());
		} catch (myexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}