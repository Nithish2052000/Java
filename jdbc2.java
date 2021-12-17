import java.util.Scanner;
import java.sql.*;
public class jdbc2{
	public static void main(String args[]){
		try{
            Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connection has been established......");
			String url="jdbc:mysql://localhost:3306/database1";
			String username="root";
			String password="srinivasan";
			Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
			System.out.println("PLease enter the query to display the details of the person (Table Name: student)");
			Scanner jdbc2 =new Scanner(System.in);
			String query1;
			query1=jdbc2.nextLine();
			Statement stmt1=con.createStatement();
			ResultSet rs=stmt1.executeQuery(query1);
            rs.first();
            System.out.println("Enter the id of the person who's detail is to be displayed : ");
            result r =new result();
            int n=jdbc2.nextInt();
            switch(n){
            	case 0:System.out.println("THE PERSONS DETAILS ARE :");
            	       rs.absolute(n);
            	       System.out.println("Please don't enter zero");
            	       break;
            	case 1:System.out.println("THE PERSONS DETAILS ARE :");
            	       rs.absolute(n);
            	       r.display(rs);
            	       break;
            	case 2:System.out.println("THE PERSONS DETAILS ARE :");
            	       rs.absolute(n);
            	       r.display(rs);
            	       break;
                case 3:System.out.println("THE PERSONS DETAILS ARE :");
            	       rs.absolute(n);
            	       r.display(rs);
            	       break;
                case 4:System.out.println("THE PERSONS DETAILS ARE :");
            	       rs.absolute(n);
            	       r.display(rs);
            	       break;
            	case 5:System.out.println("THE PERSONS DETAILS ARE :");
            	       rs.absolute(n);
            	       r.display(rs);
            	       break;
                case 6:System.out.println("THE PERSONS DETAILS ARE :");
            	       rs.absolute(n);
            	       r.display(rs);
            	       break;
                      }
		     }catch(SQLException se){
			System.out.println("Sorry dude the server is down");
		     }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }
	}
}
class result{
	void display(ResultSet rs)throws SQLException{
    try{
	int mark1 = rs.getInt("Mark1");
	int mark2 =rs.getInt("Mark2");
  	int mark3 =rs.getInt("Mark3");
	String name =rs.getString("Name");
	String fname=rs.getString("FatherName");
	String mname=rs.getString("MotherName");
	System.out.println("Students Name :"+name);
	System.out.println("Students Father's Name :"+fname);
	System.out.println("Students Mother's Name :"+mname);
	System.out.println("Students Mark1 :"+mark1);
	System.out.println("Students Mark2 :"+mark2);
	System.out.println("Students Mark3 :"+mark3);
    System.out.println("Students total marks are:"+(mark1+mark2+mark3));
	}catch(SQLException se){
	     System.out.println("Sorry dude");
	}
}
}
