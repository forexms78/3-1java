package third;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer2 {
	public static void main(String[] args) {
		ServerSocket s = null;
		try {
			s = new ServerSocket();
			s.bind(new InetSocketAddress("localhost",9998));
			
			while(true) {
				System.out.println("- 연결 대기중 : ");
				Socket ss = s.accept();
				InetSocketAddress isa = (InetSocketAddress)ss.getRemoteSocketAddress();
				System.out.println("- 연결됨 : " + isa.getHostName());
				
				byte[] bytes = null;
				String msg = null;
				
				InputStream is = ss.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				
				msg = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("- 자료 받기 성공 : " + msg);
				
				
				OutputStream os = ss.getOutputStream();
				msg = "Welcome Client~";
				bytes = msg.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("- 자료 보내기 성공 : ");
				
				is.close();
				os.close();
				ss.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(!s.isClosed()) {
			try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}