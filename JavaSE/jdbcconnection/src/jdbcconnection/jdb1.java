package jdbcconnection;
import java.sql.*;
public class jdb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String ss="jdbc:mysql://localhost:3306/mydb";
     
     /*The Driver manager sends url to the the driver interface where the acceptURL() then checks if any registered driver accpets the url.If
      * a registered driver accepts the URL return true and return the connection object
      * else return NULL 
      * Drivers are nothing but the classes which implement driver interface (java.sql.Driver)
      */
     try(Connection con=DriverManager.getConnection(ss,"root","root"))
     {
    	 //Object for sending SQL statement to the database.SQL statement without parameters
    	 Statement st=con.createStatement();
    	// Statement();
    	 
    	 //The object of result set maintains the cursor pointing to the row of the table.Intially the cursor points before the first row
    	 ResultSet rs=st.executeQuery("select * from dept");
    	/* rs.absolute(3);
    	 int no=rs.getInt("deptno");
   	    String name=rs.getString("dname");
   	      String add=rs.getString("loc");
         System.out.println(no+"\t"+name+"\t"+add);*/
    	 while(rs.next())
    	 {int no=rs.getInt("deptno");
    	  String name=rs.getString("dname");
    	  String add=rs.getString("loc");
    	  System.out.println(no+"\t"+name+"\t"+add);
    	 
    		 
    	 }
     } 
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     }
	}


