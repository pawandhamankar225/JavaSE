public class ClassCastExceptionDemo3
{
    public static void main(String[] args)
    {
        Object o = new String();
        String i = (String) o;
    }
}