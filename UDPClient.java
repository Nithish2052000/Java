import java.io.*;
import java.net.*;
class UDPClient{
public static void main(String[] args) {
 InputStreamReader in=new InputStreamReader(System.in);
 BufferedReader inFromUser=new BufferedReader(in);
 DatagramSocket clientSocket=new DatagramSocket();
 InetAddress IPAddress=InetAddress.getByName("localhost");
 String sentence=inFromUser.readLine();
 byte[] sendata=new byte[1024];
 byte[] recieveata=new byte[1024];
 DatgramPacket sendPacket=new DatgramPacket(senddata,sendata.length,IPAddress,9999);
 clientSocket.send(sendPacket);

  }
}
