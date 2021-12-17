import java.net.*;
import java.io.*;
class server{
  public static void main(String args[]) throws IOException{
ServerSocket ss= new ServerSocket(9999);
Socket s= ss.accept();
InputStreamReader in=new InputStreamReader(s.getInputStream());
BufferedReader bf= new BufferedReader(in);
String str=bf.readLine();
String str1=str.toUpperCase();
PrintWriter pr=new PrintWriter(s.getOutputStream());
pr.println(str1);
pr.flush();
  }
}
