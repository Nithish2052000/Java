import java.sql.*;
class control1{
public static void main(String args[]){
	try{
		String url ="jdbc:mysql://localhost:3306/database1";
		String username="root";
		String password ="srinivasan";
	    Class.forName("com.mysql.jdbc.Driver");
	    Connection con =DriverManager.getConnection(url,username,password);
	    Statement stmt1=con.createStatement();
	    String query1="select * from student";
	    ResultSet rs;
	    rs=stmt1.executeQuery(query1);
	    rs.absolute(4);
	    int n=rs.getInt("Mark1");
	    System.out.println("The person's mark is :"+n);
	    con.close();
       }catch(SQLException se){
       	se.printStackTrace();
       }catch(Exception e){
       	e.printStackTrace();
       }
}
}
