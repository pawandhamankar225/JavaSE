import java.util.*;

public class Ans2 {
public static void main(String[] args) {
Map<Integer,String> h=new HashMap<Integer,String>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Key and Values");
for(int i=0;i<4;i++)
{
	h.put(i, sc.nextLine());
}
Set s=h.entrySet();
Iterator i=s.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
}
}
