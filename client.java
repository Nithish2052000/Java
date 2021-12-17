import java.net.*;
import java.io.*;
import java.util.Scanner;
class client{
  public static void main(String args[]) throws IOException{
    Socket s=new Socket("localhost",9999);
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the string : ");
    String n=input.nextLine();
    PrintWriter pr=new PrintWriter(s.getOutputStream());
    pr.println(n);
    pr.flush();
    InputStreamReader in=new InputStreamReader(s.getInputStream());
    BufferedReader bf= new BufferedReader(in);
    String str= bf.readLine();
    System.out.println("string"+str);
  }
}
