import java.io.*;
import java.util.*;
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int k;
		File f=new File("e://copy1.txt");
		byte b[]=new byte[100]; 
	
		try(RandomAccessFile raf=new RandomAccessFile(f,"rw"))
		
		{ raf.seek(raf.length());
			System.out.println("Enter a string");
		    k=System.in.read(b);
			raf.write(b, 0, k);
			raf.seek(raf.length());
	        System.out.println("Enter another string");
	        k=System.in.read(b);
	        raf.write(b, 0, k);
	        raf.seek(0);
	        byte c[]=new byte[(int) new File("e://copy1.txt").length()];
	        raf.read(c);
	        String ss=new String(c);
	        System.out.println(ss);
	  
	        System.out.println("Finally the whole string is");
	        
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		

}
}
