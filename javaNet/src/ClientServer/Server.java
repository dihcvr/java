package ClientServer;

import java.io.*;
import java.net.*;

public class Server {

public static void main(String[] args) {
// TODO Auto-generated method stub
ServerSocket sSoc=null;
Socket soc =null;
try {
sSoc=new ServerSocket(1458);
System.out.println(InetAddress.getLocalHost());
soc=sSoc.accept();
System.out.println("un client s'est connecté");
BufferedInputStream bis = new BufferedInputStream(soc.getInputStream());
StringBuilder sb = new StringBuilder();
int n;
while((n = bis.read())!=-1) {
sb.append((char)n);
}
System.out.println(sb);
//sSoc.close();
//soc.close();

} catch (Exception e) {
// TODO: handle exception
//System.out.println(e);
}
}

}
