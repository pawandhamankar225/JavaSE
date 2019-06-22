package jdbcconnection;

import java.sql.*;
public class usingpreparedstatement2
{
	public static void main(String args[])
	{
		String ss="jdbc:mysql://localhost:3306/mydb";
		try(Connection con=DriverManager.getConnection(ss,"root","root"))
		{
PreparedStatement pst=con.prepareStatement("update dept set loc=?");
pst.setString(1, "delhi");
int stmtupdated=pst.executeUpdate();
System.out.println("The statements updated are :"+stmtupdated);

}
catch(Exception ee)
{
	System.out.println(ee);
}
}
}






						