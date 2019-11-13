package InputOutput;
import java.io.FileInputStream;
import java.io.File; 

public class stream {
	
	public static void main(String args[]){    
		FileInputStream fis=null;
			File f=new File("fichier.txt");
		try{    
			fis=new FileInputStream(f);
			byte[] buf=new byte[1];
			int n;
			while((n=fis.read(buf))>=0) {
				for(int i=0; i<n; i++)
					System.out.print((char) buf[i]);
				/*
				 	for(byte b:buf)
					System.out.println((char) b);
					System.out.println(buf[0]);
				*/
			}
			
					
        }catch(Exception e){
        	System.out.println(e);
        	}  finally {
        		try {
        			fis.close();
        		}catch(Exception e) {
        			System.out.println(e);
        		}
        	}
       }    
	
}
