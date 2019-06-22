import java.io.*;
public class learnfinalize {
public void finalize(){
	
	System.out.println("Finalize is being called");
}
public static void main(String[] args)
{
learnfinalize f1=new learnfinalize();
learnfinalize f2=new learnfinalize();
f1=null;
f2=null;
System.gc();
}
}