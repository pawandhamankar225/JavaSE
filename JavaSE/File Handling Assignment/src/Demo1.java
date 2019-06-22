import java.util.Scanner;
import java.io.*;

public class Demo1 {

public static void main(String args[])
{
	 int a[]=new int[100];
	   int c;
	   int i=0;
	   int count=0;
	try (FileOutputStream fos=new FileOutputStream("e://abc.txt"))
	{ 
	   DataOutputStream f=new DataOutputStream(fos);
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the numbers");
	   
	   for(i=0;i<a.length;i++)
		{
		   c=sc.nextInt();
		if(c==0)
		  break;
		else
		{
			a[i]=c;
			count++;
		}
	  }
	   
	  
	  
	   for(i=0;i<count;i++)
		{
		   f.writeInt(a[i]);
		}
		
		
	}
    catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("----------------------------------------");
	try(FileInputStream j=new FileInputStream("e://abc.txt"))
	{  
		DataInputStream k=new DataInputStream(j);
		 for(i=0;i<count;i++)
		    System.out.println(k.readInt()); 
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
}
