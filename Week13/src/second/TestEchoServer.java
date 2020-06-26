package second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TestEchoServer {
	public static void main(String[] args) {
		System.out.println("에코 서버!");
		try (ServerSocket ss = new ServerSocket(11000)) {
			System.out.println("서버 대기중....");

			Socket cs = ss.accept();
			System.out.println("클라이언트 연결됨!");

			try (BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream())); // 수신용
					PrintWriter out = new PrintWriter(cs.getOutputStream(), true);) { // 송신용
				// Old Style
//					String inputLine;
//					while ((inputLine = br.readLine()) != null) {
//						System.out.println("클라이언트 메세지 : " + inputLine);
//						out.println(inputLine); // 클라이언트 한테 클라이언트가 보낸 메세지 리턴 (에코)
//					}	

				// Modern Style
				Supplier<String> socketIn = () -> {
					try {
						return br.readLine();
					} catch (IOException e) {
						e.printStackTrace();
						return null;
					}
				};
				Stream<String> s = Stream.generate(socketIn);
				s.map(text -> { /* while문 반복문이 없다 ctrl + shift + f 정렬 */
					System.out.println("클라이언트 메세지 : " + text);
					out.println(text);
					return text;
				}).allMatch(text -> text != null); /* 조건문 역활을한다 */

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("에코 서버 종료...");
	}
}
