package jdbcconnection;

import java.sql.*;

public class moreonresultset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ss="jdbc:mysql://localhost:3306/mydb";
		try(Connection con=DriverManager.getConnection(ss,"root","root"))
		{
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet rs=st.executeQuery("select deptno,dname,loc from dept");

rs.absolute(5);
rs.updateString("loc","USA");
/*rs.updateRow();
rs.previous();
rs.updateString("dname","edp");
rs.updateRow();
rs.absolute(4);
rs.updateString("loc","england");
rs.updateRow();*/

}
catch(Exception ee)
{
	System.out.println(ee);
}
}

	}

