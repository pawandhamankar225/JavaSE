/*import java.io.*;
public class Demo6 {

	public static void main(String args[])
	{
		File f=new File("e://nano.txt");
		Nano ob=new Nano();
		ob.setLdate("23-06-2005");
		try(FileOutputStream fos=new FileOutputStream(f))
		{
			try(ObjectOutputStream oos=new ObjectOutputStream(fos))
			{
				oos.writeObject(ob);
				ob=null;
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		try(FileInputStream fis=new FileInputStream(f))
		{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
				 try {
					Nano n1=(Nano) ois.readObject();
					System.out.println(n1.getLdate());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		catch(IOException ee)
		{
			ee.printStackTrace();
		}
	}
}
*/