package ClientServer;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.*;

public class Client {

public static void main(String[] args) {
Socket soc = null;
String req = "je suis yassir";
req+="\r\n";
BufferedOutputStream bos = null;
try {

soc = new Socket("localhost",1234);
System.out.println("bien connecté");
bos = new BufferedOutputStream(soc.getOutputStream());
} catch (IOException e2) {
e2.printStackTrace();
}
try {
bos.write(req.getBytes());
bos.flush();
soc.close();
} catch (IOException e1) {
e1.printStackTrace();
}


}

}