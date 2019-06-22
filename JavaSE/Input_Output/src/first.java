import java.io.*;
public class first {
	public static void main(String args[])
	{
	File f=new File("d://Pk.java");   //Checks the file path
	if(!f.exists())    
	{
		System.out.println("File does not exist\n");
	}
	else
	{
		System.out.println("File exist");
	}
	try {
		FileInputStream fis=new FileInputStream("d://Pk.java");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
