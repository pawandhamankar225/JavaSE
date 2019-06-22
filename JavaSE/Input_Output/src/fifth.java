import java.io.*;
public class fifth
{
public static void main(String args[])
{
	try(FileOutputStream f=new FileOutputStream("e://pk.txt"))
	{
		try(DataOutputStream fos=new DataOutputStream(f))
		{
			fos.writeInt(10);
			fos.writeChar('A');
			fos.writeFloat(3.9f);
			fos.writeBoolean(true);
			fos.writeUTF("Hello World");
		}
		
	
	catch(IOException a)
	{
		a.printStackTrace();
	}
		
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  try(FileInputStream fis=new FileInputStream("e://pk.txt"))
  {
	  try(DataInputStream fin=new DataInputStream(fis))
	  {
		  System.out.println(fin.readInt());
		  System.out.println(fin.readChar());
		  System.out.println(fin.readFloat());
		  System.out.println(fin.readBoolean());
		  System.out.println(fin.readUTF());
	  }
  }
  catch(IOException ee)
  {
	  ee.printStackTrace();
  }
  
}
}

