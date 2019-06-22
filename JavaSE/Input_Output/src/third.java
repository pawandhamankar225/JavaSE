//Using fileoutputstream

import java.io.*;
import java.util.*;
public class third {
	
		public static void main(String args[])
		{String a;
			File f = new File(("e:\\pk.txt"));
			if(!f.exists())
			{
				System.out.println("File does not exist");
			}
			else
			{
				System.out.println("File exist");
			}
			try(FileOutputStream fo=new FileOutputStream(f))  //true gives the write permission
			{	Scanner sc=new Scanner(System.in);
		     	/*byte b[]=new byte[100];
			      int k=System.in.read(b);
			      fos.write(b,0,k);*/
				System.out.println("Enter a string");
				a=sc.nextLine();
				byte b[]=a.getBytes();     //get the no of bytes according to string size
				fo.write(b);
				
				 }
			catch(IOException e)
			{
				e.printStackTrace();
			}
}
}