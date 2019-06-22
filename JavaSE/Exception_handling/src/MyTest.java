public class MyTest
{
public static void throwIt() throws Exception
{
throw new Exception();
}
public static void main(String[] args)
{
try
{
System.out.println("Hey There");
}
finally
{
System.out.println("in Finally");
}
}
}