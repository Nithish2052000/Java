import java.io.*;
import java.net.*;
class server2{
  public static void main(String args[]){
    Socket s=new Socket(9999);
    ServerSocket ss=s.accept();
    InputStreamReader ir=new InputStreamReader(s.getInputStream());
    BufferedReader bf=new BufferedReader(ir);
    bf.readLine();
    PrintWriter pr=new PrintWriter(s.getOutpuStream());
    pr.println("hi");
    pr.flush();
}
}
