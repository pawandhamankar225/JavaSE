public class MyClass
{
public static void main(String args[])
{
try
{
method();
}
catch(Exception ie)
{
}
}
static void method()
{
try
{
wrench();
System.out.println("a");
}
catch(ArithmeticException ae)
{
System.out.println("b");
}
finally
{
System.out.println("c");
}
System.out.println("d");
}
static void wrench()
{
throw new NullPointerException();
}
}