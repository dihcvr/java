package Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.net.Socket;


public class ReadNetworkFileSock {

	public static void main(String[] args) {
		
		Socket soc = null;
		try {
			soc = new Socket("www.este.ucam.ac.ma",80);
			String req = "GET / HTTP/1.1\r\n";
			req += "Host: www.este.ucam.ac.ma\r\n";
			req += "\r\n";
			//BufferedWriter bw = new BufferedWriter(soc.getOutputStream());
			BufferedOutputStream bos = new BufferedOutputStream(soc.getOutputStream());
			bos.write(req.getBytes());
			bos.flush();
			BufferedInputStream bis = new BufferedInputStream(soc.getInputStream());
			StringBuilder sb=new StringBuilder();
			int n;
			while((n = bis.read()) != -1) {
				sb.append((char) n);
			}
			System.out.println(sb);
			
		}catch(Exception e) {
			
		}
		

	}

}
