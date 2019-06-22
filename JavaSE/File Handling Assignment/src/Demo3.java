import java.io.*;
import java.util.*;
public class Demo3 {

	public static void main(String args[])
	{ 
	  File f=new File("e://xyz1.txt");
		//int a[]=new int[100];
	  
	 
	try( FileOutputStream	fos = new FileOutputStream(f))
	{	byte b[]=new byte[100];
		System.out.println("Enter the integers");
		 int k=System.in.read(b);
		 
		
		 fos.write(b,0,k);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		File f1=new File("e://xyz2.txt");
	try(FileInputStream fis=new FileInputStream(f))
	{  int a;
		byte c[]=new byte[100];
		a=c.length;
		fis.read(c);
		try(FileOutputStream fcs=new FileOutputStream(f1))
		{
			fcs.write(c,0,a);
		}
		
	}
  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Copy Completed......");
		
		
	}
}
