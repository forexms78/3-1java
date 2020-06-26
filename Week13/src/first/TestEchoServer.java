package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestEchoServer {
	public static void main(String[] args) {
		System.out.println("에코 서버!");
		try(ServerSocket ss = new ServerSocket(11000)){  /*서버 소켓 11000포트 설정*/
			System.out.println("서버 대기중....");
			
			Socket cs/*클라이언트의 주소를 가지고있다*/ = ss.accept();		/*Socket cs = (new)를 쓰면안된다. ss.accept()*/
			System.out.println("클라이언트 연결됨!");
			
			try(BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream())); // 수신용
					PrintWriter out /* 출력문장 */= new PrintWriter(cs.getOutputStream(), true /*변기의 비대의 역활을한다 과도한 플러싱이 될수있다*/);){ // 송신용
				
					String inputLine;
					while ((inputLine = br.readLine()) /* 한줄을 읽는다 */!= null) {
						System.out.println("클라이언트 메세지 : " + inputLine);
						out.println(inputLine); // 클라이언트 한테 클라이언트가 보낸 메세지 리턴 (에코)
					}	
					}catch(IOException e) {
						e.printStackTrace();
					}
		} catch (IOException e) {		e.printStackTrace();		}
		System.out.println("에코 서버 종료...");
	}
}
