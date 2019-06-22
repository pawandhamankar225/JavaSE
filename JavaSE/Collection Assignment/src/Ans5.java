import java.util.*;
public class Ans5 {
public static void main(String[] args) {
Map<Integer,String> m=new HashMap<Integer,String>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter name of all the crickters");
for(int i=1;i<=5;i++)
{
	m.put(i, sc.nextLine());
}
System.out.println("Enter any rank of your wish");
int k=sc.nextInt();
System.out.println(m.get(k));
}
}
