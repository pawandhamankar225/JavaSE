import java.util.Scanner;

public class AssertDemo
{
	/*public static void main(String args[])
	{
		System.out.println("Before checking num");
		int num=10;
		assert(num<=);
		System.out.println("After checking num");

		assert(num>20):"num is not gt 20";
		System.out.println("After checking num");
	}*/
	
	
	public static void main(String args[])
		{  int num;
			System.out.println("Before checking num");
	   Scanner sc=new Scanner(System.in);
			System.out.println("Enter the num");
			num=sc.nextInt();
			assert(num>10):"Number is less than 10";
			System.out.println(num);
		}
	
}