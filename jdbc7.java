import java.sql.*;
class jdbc7{
  public static void main(String args[]){
    try{
      String url="jdbc:mysql://localhost:3306/database1";
      String username="root";
      String password="srinivasan";
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Connection has been established......");
      String query="drop table CLIMATE;";
      String query1="create table CLIMATE(NameOfPlace varchar(255),Altitude float,Temperature float,Vegetation varchar(255), Country varchar(255));";
      String query2="insert into CLIMATE values('Srinagar',350.09,35.53,'tropical','India');";
      String query3="insert into CLIMATE values('Varanasi',390.09,76.53,'deserted','India');";
      String query4="insert into CLIMATE values('VaticanCity',90.09,00.53,'cold','USA');";
      String query5="insert into CLIMATE values('Erode',21.09,45.53,'humid','India');";
      String query6="insert into CLIMATE values('Madagaskar',10021.09,75.53,'hot','Madagaskar');";
      String query7="select * from CLIMATE;";
      Connection con=DriverManager.getConnection(url,username,password);
      PreparedStatement stmt8=con.prepareStatement(query);
      stmt8.executeUpdate();
      PreparedStatement stmt=con.prepareStatement(query1);
      stmt.executeUpdate();
      PreparedStatement stmt1=con.prepareStatement(query2);
      stmt1.executeUpdate();
      PreparedStatement stmt2=con.prepareStatement(query3);
      stmt2.executeUpdate();
      PreparedStatement stmt3=con.prepareStatement(query4);
      stmt3.executeUpdate();
      PreparedStatement stmt4=con.prepareStatement(query5);
      stmt4.executeUpdate();
      PreparedStatement stmt5=con.prepareStatement(query6);
      stmt5.executeUpdate();
      Statement stmt6=con.createStatement();
      ResultSet rs=stmt6.executeQuery(query7);
      rs.absolute(3);
      String NameOfPlace=rs.getString("NameOfPlace");
      float Altitude=rs.getFloat("Altitude");
      float Temperature=rs.getFloat("Temperature");
      String Vegetation=rs.getString("Vegetation");
      String Country=rs.getString("Country");
      System.out.println(NameOfPlace+":"+Altitude+":"+Temperature+":"+Vegetation+":"+Country);
      con.close();
    }catch(SQLException se){
      se.printStackTrace();
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
