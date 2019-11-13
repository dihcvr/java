package cours;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIO {
	
	public static void main(String[] args) {
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		File fo = new File("ficherBis.txt");
		try {
			bos = new BufferedOutputStream ( new FileOutputStream(fo));
			dos= new DataOutputStream(bos);
			dos.writeByte(65);
			dos.writeDouble(65.456d);
			dos.writeInt(65);
			dos.writeFloat(65.890f);
			bos.close();
			
			bis = new BufferedInputStream ( new  FileInputStream(fo));
			dis = new DataInputStream (bis);
			
			System.out.println(dis.readByte());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			
		}catch(IOException e){
			e.printStackTrace();
			
		}
	}

}
