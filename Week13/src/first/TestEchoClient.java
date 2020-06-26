package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TestEchoClient {
	public static void main(String[] args) {
		System.out.println("에코 클라이언트!");
		try (Socket cs /* 서버소켓이 아닌 일반소켓 */ = new Socket("127.0.0.1",
				11000)/* 서버의 접속할 주소가 필요하다 */;
				PrintWriter out = new PrintWriter(cs.getOutputStream(),true/*출력 개체*/);
				BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
		/* 서버가 보내는 메시지를 받을 버퍼 객체 */){
			System.out.println("연결 대기중....");
			Scanner scv = new Scanner(System.in);
			
			while(true) {
				System.out.println("보낼 메세지 입력 : ");
				String inputLine = scv.nextLine();
				if ("bye".equalsIgnoreCase /* 대문자를 써도 인식되는 */(inputLine)) {
					break;
				}
				out.println(inputLine); // 서버 전송
				
				System.out.println("서버 응답 : " + br/*서버에서 들어온 내용*/.readLine()/*문자열에 넣는다*/);
			}
		}catch (IOException e) {
				System.out.println("입출력 에러 발생!");
		}
	}
}