import java.net.*;
import java.io.*;
class server1{
  public static void main(String args[]) throws IOException{
    ServerSocket ss=new ServerSocket(4999);
    Socket s=ss.accept();
    PrintWriter pr =new PrintWriter(s.getOutputStream());
    pr.println("Hello client i am server");
    pr.flush();
    InputStreamReader in=new InputStreamReader(s.getInputStream());
    BufferedReader br=new BufferedReader(in);
    String str=br.readLine();
    System.out.println("Server : "+str);
  }
}
