import java.io.*;
import java.util.*;
public class Demo4 {

	public static void main(String args[])
	{
		File f=new File("d://testing.txt");
		
		char[] str={'a','b','c','d','e'};
		char str2[]=null;
		
		try (FileWriter fw=new FileWriter(f))
		     {fw.write(str);
			//File f1=new File("d://testing2.txt");
		     }
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			try(FileReader fr=new FileReader(f))
			{
		   str2= new char[(int)new File("d://testing.txt").length()];
			fr.read(str2);
			
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try(FileWriter fwe=new FileWriter("d://testing2.txt"))
			{
				fwe.write(str2);
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(int i=0;i<str2.length;i++)
			{
				System.out.println(str2[i]);
			}
		} 
		
	}

