package fourth;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class TestClient5 {
	public static void main(String[] args) throws IOException {
		Socket c = null;
		PrintWriter o = null;
		
		c = new Socket();
		System.out.println("서버 연결중 ...");
		c.connect(new InetSocketAddress("127.0.0.1", 10000),5000);
		System.out.println("서버 연결 완료 ...");
		
		o = new PrintWriter(c.getOutputStream(), true);
		
		Scanner i = new Scanner(System.in);
		String msg;
		
		System.out.println("메시지는? ");
		
		while((msg = i.nextLine()) != null) {
			if(msg.contentEquals("bye")) break;
			o.println(msg);
			System.out.println("더 보낼 메세지는? (프로그램 종료는 bye 입력) ");			
		}
		System.out.println("프로그램 종료!");
		o.close();
		i.close();
		c.close();
	}
}