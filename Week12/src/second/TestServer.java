package second;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
//클라이언트                서버
//2)소켓 생성              1)서버소켓 생성
//              3)연결대기 (연결 요청 시 수락)
//4)입출력스트림 생성  4)입출력스트림 생성
//5)자료전송               5)자료전송
//6)소켓닫기               6)소켓닫기
public class TestServer {

	public static void main(String[] args) {
		try(ServerSocket s = new ServerSocket(9999);
				Socket conn = s.accept();
				InputStream is = conn.getInputStream();
				ObjectInputStream ois = new ObjectInputStream(is);)
		{
			System.out.println((String)ois.readObject() + " 안녕~");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}