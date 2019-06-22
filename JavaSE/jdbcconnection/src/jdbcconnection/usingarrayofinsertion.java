package jdbcconnection;
import java.sql.*;
public class usingarrayofinsertion {
	public static void main(String args[])
	{
		String ss="jdbc:mysql://localhost:3306/mydb";
		try(Connection con=DriverManager.getConnection(ss,"root","root"))
		{
Statement st=con.createStatement();
String s1="insert into dept values(70,'Manager','Accounts')";
String s2="insert into dept values(80,'Clerk','Staff')";
st.addBatch(s1);
st.addBatch(s2);
int k[]=st.executeBatch();
for(int i=0;i<k.length;i++)
{
	System.out.println(k[i]);
}
}
catch(Exception ee)
{
	System.out.println(ee);
}
}
}



