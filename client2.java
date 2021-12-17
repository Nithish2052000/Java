import java.io.*;
import java.net.*;
import java.util.Scanner;
class client2{
  public static void main(String args[]){
    Socket s=new Socket("localhost",9999);
    Scanner in=new Scanner(System.in);
    String m=in.nextLine();
    PrintWriter pr=new PrintWriter(s.getOutpuStream());
    pr.println(m);
    pr.flush();
    InputStreamReader ir=new InputStreamReader(s.getInputStream());
    BufferedReader bf=new BufferedReader(ir);
    bf.readLine();
  }
}
