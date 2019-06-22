import java.util.Scanner;

class VoterException extends Exception
{
      public VoterException(String m)	
	{
    	  super(m);
   }
}
class A
{ private int a;
	void Votingcheck(int a) throws VoterException
	{this.a=a;
		if(a<18)
			throw new VoterException("Age should be greater than 18");
		else
			System.out.println("You are eligible for voting");
	}
}
public class Th2
{
	public static void main(String args[])
	{   int a;
		A ob=new A();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		a=sc.nextInt();
		try {
			ob.Votingcheck(a);
		} catch (VoterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}