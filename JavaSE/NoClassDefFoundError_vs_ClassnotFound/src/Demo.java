/*class  A1
{
	}
public class Demo
{
  public static void main(String args[])      //NoClassDefFoundError
{
A1 ob=new A1();
}
}
*/
public class Demo
{
  public static void main(String args[])      //NoClassDefFoundError
{
try
{
	Class.forName("com.mysql.Driver");
}
catch(ClassNotFoundException e)
{
	System.out.println(e);
}
}
}