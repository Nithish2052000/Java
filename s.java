import java.net.*;
import java.io.*;
class s{
  public static void main(String args[]) throws IOException{
    ServerSocket ss= new ServerSocket(4999);
    Socket s=ss.accept();
  PrintWriter pr=new PrintWriter(s.getOutputStream());
pr.println("hi client");
pr.flush();
InputStreamReader in=new InputStreamReader(s.getInputStream());
BufferedReader bf= new BufferedReader(in);
String str=bf.readLine();
System.out.println(str);
}
}
