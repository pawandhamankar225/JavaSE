class MyArithException extends Exception
{
	MyArithException(String ref)
	{
		super(ref);
	}
}
class calculator
{
	public int Calcdouble(int a)throws MyArithException
	{
		if(a==0)
		{
			throw new MyArithException("0 not allowed");
		}
		else if(a<0)
		{
			throw new MyArithException("Negative not allowed");
			
		}
		else
		{
			return 2*a;
		}
	}
}
	
	public class MycalcApp
	{
		public static void main(String args[])
		{    int a;
			calculator ob= new calculator();
			try {
				a=ob.Calcdouble(-5);
				System.out.println(a);
			} catch (MyArithException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}