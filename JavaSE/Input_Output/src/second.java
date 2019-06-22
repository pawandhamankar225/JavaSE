//Using fileinputstream
import java.io.*;
public class second {

	public static void main(String args[])
	{
		File f=new File("d:\\Pk.java");
		if(!f.exists())
		{
			System.out.println("File not found");
		}
		else
		{
			System.out.println("FILE FOUND");
		}
		
				try {
					FileInputStream fis= new FileInputStream(f);
					byte b[]=new byte[((int)f.length())];
					fis.read(b);
					String ss=new String(b);
					System.out.println(ss);
				} catch (IOException e) {                     //FileNotFound exception not required instead used parent IO Exception
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
}			
}
				
				
			