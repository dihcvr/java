package Test;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class testSocket {

	public static void main(String[] args) throws Exception {
		
			
			InetAddress loc = InetAddress.getLocalHost();
			//Socket soc = new Socket(InetAddress.getByName(loc.getHostAddress()), 80); 
			//Socket soc2 = new Socket("www.google.com", 80); 
			
			Socket soc =null;
			for (int i=1;i<=65536;i++) {
				try {
					 soc = new Socket(InetAddress.getByName(loc.getHostAddress()), i);
					 System.out.println(" Port : "+i);
					}catch(Exception e) {}
				finally {
					if(soc != null) {
						soc.close();
					}
				}
			
		}
			
			

		
		
	}

}
