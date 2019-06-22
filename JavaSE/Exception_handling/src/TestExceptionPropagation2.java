import java.io.IOException;
class Testthrows1{


 
 public static void main()
 {
	 Testthrows1 obj=new Testthrows1();
	obj.o();
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
 
 void o()
 {
	 try {
		n();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("Printing exception");
	}
 }
	
}
