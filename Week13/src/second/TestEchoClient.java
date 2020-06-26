package second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TestEchoClient {
	public static void main(String[] args) {
		System.out.println("에코 클라이언트!");
		try(Socket cs = new Socket("127.0.0.1", 11000);
				PrintWriter out = new PrintWriter(cs.getOutputStream(),true);
				BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
				){
			System.out.println("연결 대기중....");
			Scanner scv = new Scanner(System.in);
			// Old Style Java 8이전버전
//			while(true) {
//				System.out.println("보낼 메세지 입력 : ");
//				String inputLine = scv.nextLine();
//				if("bye".equalsIgnoreCase(inputLine)) {
//					break;
//				}
//				out.println(inputLine); // 서버 전송
//				
//				System.out.println("서버 응답 : " + br.readLine());
//			}
			
			// Modern Style
			//Supplier<String> scvIn = ()-> { return scv.nextLine();};
			Supplier<String> scvIn = ()-> scv.nextLine(); 
			
			System.out.println("보낼 메세지 입력 : ");
			
			Stream.generate(scvIn).map(text ->{
				out.println(text);// 서버 전송
				System.out.println("서버 응답 : " + text);
				System.out.println("보낼 메세지 입력 : ");
				return text;
			}).allMatch(text -> !"bye".equalsIgnoreCase(text));		
			
		}catch (IOException e) {
				System.out.println("입출력 에러 발생!");
		}
	}
}