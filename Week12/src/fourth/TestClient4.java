package fourth;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class TestClient4 {
	public static void main(String[] args) throws IOException {
		Socket c = null;
		PrintWriter o = null;
		
		c = new Socket();
		System.out.println("서버 연결중 ...");
		c.connect(new InetSocketAddress("127.0.0.1"/*호스트네임*/, 10000/*포트번호*/),5000/*5초간의 시간을둔다*/);
		System.out.println("서버 연결 완료 ...");
		
		o = new PrintWriter(c.getOutputStream(), true);
		
		Scanner i = new Scanner(System.in);
		String msg;
		
		System.out.println("메시지는? ");
		
		while((msg = i.nextLine()) != null /*키보드로 타이핑한값이 비어있지않으면 while문을 계속 돌린다*/) {
			if(msg.contentEquals("bye")/*탈출시키는 구문 bye를 치면 빠져나오게된다*/) break;
			o.println(msg);
			System.out.println("더 보낼 메세지는? (프로그램 종료는 bye 입력) ");			
		}
		System.out.println("프로그램 종료!");
		o.close(); /*열었던 인아웃 객체 종료 출력용*/
		i.close(); /*스캔*/
		c.close(); /*소켓*/
	}
}