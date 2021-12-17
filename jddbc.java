import java.sql.*;
public class jddbc
{
	public static void main(String[] args) {
	class.forName(com.mysql.jdbc.Driver);
	String url ="jdbc:mysql://localhost:3306/student";
	String username ="root";
        String password ="srinivasan";  
        Connection con = DriverManager.getConnection(url,username,password);
        System.out.println("Connection is established");
        /*Statement stmt = con.createStatement();*/
        /*stmt.close();*/
        con.close();	
	}
}