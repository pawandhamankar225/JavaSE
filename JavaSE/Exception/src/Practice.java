class FekException extends Exception
{
	FekException(String ref)
	{
		super(ref);
	}
}
class Calculator
{  

public int Calc(int a) throws FekException
  {
	 
	  if(a<0)
	  {
		  throw new FekException("Negative is not allowed");
	  }
	  else if(a==0)
	  {
		  throw new FekException("0 is not allowed");
		  
	  }
	  else
	  {
		return a*a;  
	  }
	  
  }
	
}
public class Practice
{
	public static void main(String args[]) 
	{
		Calculator ob=new Calculator();
		
			try {
				System.out.println(ob.Calc(-9));
			} catch (FekException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	
}
}