import java.sql.*;
public class jdbc1{
	public static void main(String[] args) {
		try{
		Class.forName("com.mysql.jdbc.Driver");
	//System.out.println("Connection has been established successfully");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","srinivasan");
        //Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResutSet.CONCUR_UPDATABLE);
        //System.out.println("Create the statement");
		String query1="select * from Employees";
		PreparedStatement stmt1=c.prepareStatement(query1);
		ResultSet rs=stmt1.executeQuery();
        rs.last();
        int id=rs.getInt("id");
        System.out.println("The required identification numbers are : "+id);
        rs.close();
        //stmt.close();
        con.close();
    }catch(SQLException se){
    	System.out.println("Sorry dude");
    }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }
   }
}
/*finally{
      //finally block used to close resources
      try{
         if(stmt1!=null)
            stmt1.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(con!=null)
            con.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");

	}
}*/