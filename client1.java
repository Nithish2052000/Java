import java.net.*;
import java.io.*;
class client1{
  public static void main(String args[]) throws IOException{
    Socket s=new Socket("localhost",4999);
    PrintWriter pr =new PrintWriter(s.getOutputStream());
    pr.println("Hello server this is client");
    pr.flush();
    InputStreamReader in=new InputStreamReader(s.getInputStream());
    BufferedReader br=new BufferedReader(in);
    String str=br.readLine();
    System.out.println("Server : "+str);
  }
}
