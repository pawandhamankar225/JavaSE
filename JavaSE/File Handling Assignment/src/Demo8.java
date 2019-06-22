import java.io.*;
import java.util.*;
public class Demo8 {
	public static void main(String args[])
	{
	char s[]=new char[10];
	File f=new File("e://temp.txt");
	try(FileWriter fw=new FileWriter(f))
	{	Scanner sc=new Scanner(System.in);
	System.out.println("Enter characters");
	for(int i=0;i<10;i++)
	fw.write(sc.next());
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	try(FileReader fr=new FileReader(f))
	{
		fr.read(s);
		System.out.println(s);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	
	
}
}