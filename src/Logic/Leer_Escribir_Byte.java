package Logic;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.tomcat.util.http.fileupload.IOUtils;

public class Leer_Escribir_Byte {

	
	public byte[] leer_byte(String url) throws IOException {
		int contador=0;
		byte[] bytes = new byte[1000000];
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(url));
            bytes = dis.readAllBytes();
            System.out.println("este es el string file" +new String(bytes));
            dis.close();
		
		}catch(IOException e){
			
		}
		return bytes;
		}
}
