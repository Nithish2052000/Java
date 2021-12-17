import java.sql.*;
class jdbc5{
	public static void main(String[] args){
		try{
		String url="jdbc:mysql://localhost:3306/database1";
		String username="root";
		String password ="srinivasan";
		String query1="select * from student";
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Connection established successfully");
		Connection con=DriverManager.getConnection(url,username,password);
		Statement stmt1=con.prepareStatement(query1);
		ResultSet rs=stmt1.executeQuery(query1);
		rs.next();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		int mark1=rs.getInt("Mark1");
        System.out.println("Mark1 : "+mark1);
        rs.close();
        con.close();
	    }catch(SQLException se){
		System.out.println("sorry dude");
	    }catch(Exception e){    
	    e.printStackTrace();
	    }
}   
}