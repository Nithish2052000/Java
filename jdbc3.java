import java.util.Scanner;
import java.sql.*;
class jdbc3{
public static void main(String args[]){	
	try{
		String url="jdbc:mysql://localhost:3306/Database1";
		String username="root";
		String password="srinivasan";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,username,password);
        Statement stmt =con.createStatement();
        Statement stmt1=con.prepareStatement();
        System.out.println("Please tell number of Queries u wish to enter");
        Scanner jdbc3=new Scanner(System.in);
        int n=jdbc3.nextInt();
        for(int i=0;i<n;i++)
        {
        String query1="select * from student";
        ResultSet rs=stmt1.executeQuery(query1);
        }
        table o1=new table();
        System.out.println("Please enter whether u want to update or view");
        System.out.println("1.update");
        System.out.println("2.view");
        int m=jdbc3.nextInt();
        switch(m){
        	case 0 :System.out.println("Sorry better luck next time"); 
        	        break;
        	case 1 :System.out.println("You are ready to update....");
        	        o1.update();
        	        break();
        	case 2 :System.out.println("You are ready to view.....");
        	        o1.display(rs);
        	        break;
        	default:System.out.println("Please enter a valid number");
        	        break;                 
        }
        



     rs.close();
     stmt.close();
     con.close();
	}catch(SQLException se)
	{
		se.printStackTrace();
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
