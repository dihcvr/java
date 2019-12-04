package Test;

import java.net.InetAddress;
import java.util.Scanner;

public class Inet {

	public static void main(String[] args) {
		try {
			/*
			InetAddress address = InetAddress.getLocalHost();
			
			System.out.println("localhost InetAddress : "+ address);
			System.out.println("localhost host Address : "+ address.getHostName());
			System.out.println("localhost name Address : "+ address.getHostAddress());
			System.out.println("name canonique : "+ address.getCanonicalHostName());
			*/
			String adr ="";
			Scanner sc = new Scanner(System.in);
			System.out.print("ADRESS : ");
			adr = sc.nextLine();
			InetAddress Address = InetAddress.getByName(adr);
			System.out.println("IP :  "+Address.getHostAddress());
			System.out.println("Name :  "+Address.getHostName());
			
			
		}catch(Exception e) {
			
		}

	}

}
