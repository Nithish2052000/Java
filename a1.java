import java.net.*;
import java.io.*;
class a1 {
public static void main(String args[]) throws Exception {
URL hp=new URL("https://www.google.com/downloads");
System.out.println("Protocol : "+hp.getProtocol());
System.out.println("Port : "+hp.getPort());
System.out.println("Host : "+hp.getHost());
System.out.println("File : "+hp.getFile());
System.out.println("Port : "+hp.toExternalForm());
}
}







/*
int c;
// Create a socket connected to internic.net, port 43.
Socket s = new Socket("internic.net", 43);
// Obtain input and output streams.
InputStream in = s.getInputStream();
OutputStream out = s.getOutputStream();
String str = (args.length == 0 ? "wwww.sastra.edu" : args[0]) + "\n";
 // Convert to bytes.
byte buf[] = str.getBytes();
// Send request.
out.write(buf);
// Read and display response.
 while ((c = in.read()) != -1) {
   System.out.print((char) c); }
   s.close();
*/




















/*import java.net.*;
class a1{
  public static void main(String args[]) throws UnknownHostException{
    InetAddress Address = InetAddress.getLocalHost();
    System.out.println(Address);
    Address = InetAddress.getByName("www.google.com");
    System.out.println(Address);
    Address =InetAddress.getByName("www.sastra.edu");
    System.out.println(Address);
    String address=InetAddress.getHostAddress("www.google.com");
  }
}*/
/*class emp{
  int salary;
  int empid;
  static String ceo;
  void show(){
    System.out.println("The deatails are : "+salary+":"+empid+":"+ceo);
  }
}
class a1{
  public static void main(String args[]){
   emp arun = new emp();
   emp amul = new emp();
   arun.salary=5000;
   arun.empid=1;
   arun.ceo="mahesh";
   amul.salary=4000;
   amul.empid=2;
   amul.ceo="dinesh";
   arun.show();
   amul.show();

  }
}*/
