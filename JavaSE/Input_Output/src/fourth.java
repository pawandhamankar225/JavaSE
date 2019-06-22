//Unicode character stream
//Using File Writer and File Reader
import java.io.*;
import java.util.*;
public class fourth {

	public static void main(String args[])
	{
		String a;
		char b[]={'a','b','c','d','e','f','g'};       //try
	  try(FileWriter f=new FileWriter("e://pk.txt",true))
		{
			/*Scanner sc=new Scanner(System.in);
			System.out.println("Enter a string to write");   
			a=sc.nextLine();*/
			 
			f.write(b);
		}
		catch(IOException ee)
		{
			ee.printStackTrace();
		}
		
	  try(FileReader fa=new FileReader("e://pk.txt"))
		{
			char a1[]= new char[(int) new File("e://pk.txt").length()];
			fa.read(a1);
			for(int i=0;i<a1.length;i++)
			{
				System.out.println(a1[i]);
			}
		
		}
		catch(IOException ee)
		{
			ee.printStackTrace();
		}
	}
}
