package third;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TestClient2 {
	public static void main(String[] args) {
		Socket s = null;
		try {
			s = new Socket();
			System.out.println("- 연결 요청중 : ");
			s.connect(new InetSocketAddress("localhost",9998));
			System.out.println("- 연결 성공 : ");
			
			byte[] bytes = null;
			String msg = null;
			
			OutputStream os = s.getOutputStream();
			msg = "Hi Server~";
			bytes = msg.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("- 자료 보내기 성공 : ");			
				
			InputStream is = s.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);				
			msg = new String(bytes, 0, readByteCount, "UTF-8");
			System.out.println("- 자료 받기 성공 : " + msg);
			
			os.close();				
			is.close();	
		}catch(IOException e){
			e.printStackTrace();
		}

	if(!s.isClosed())
	{
		try {
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}}
