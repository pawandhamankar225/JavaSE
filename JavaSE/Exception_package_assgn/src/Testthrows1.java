import java.io.IOException;
class Testthrows1{
 
 public static void main(String args[]) 
 {
	 Testthrows1 obj=new Testthrows1();
	try {
		obj.o();
	} catch (IOException e) {
		// TODO Auto-generated catch block
	System.out.println("IO Exception handled");
	}
    System.out.println("Running re baba");
 }
 void m()throws IOException
 {
	throw new IOException("Throwing the exception in m");
 }
 void n()throws IOException
 {
	m(); 
 }
 
 void o()throws IOException
 {
	 n();
	
}
}
