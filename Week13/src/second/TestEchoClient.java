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
		System.out.println("���� Ŭ���̾�Ʈ!");
		try(Socket cs = new Socket("127.0.0.1", 11000);
				PrintWriter out = new PrintWriter(cs.getOutputStream(),true);
				BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
				){
			System.out.println("���� �����....");
			Scanner scv = new Scanner(System.in);
			// Old Style Java 8��������
//			while(true) {
//				System.out.println("���� �޼��� �Է� : ");
//				String inputLine = scv.nextLine();
//				if("bye".equalsIgnoreCase(inputLine)) {
//					break;
//				}
//				out.println(inputLine); // ���� ����
//				
//				System.out.println("���� ���� : " + br.readLine());
//			}
			
			// Modern Style
			//Supplier<String> scvIn = ()-> { return scv.nextLine();};
			Supplier<String> scvIn = ()-> scv.nextLine(); 
			
			System.out.println("���� �޼��� �Է� : ");
			
			Stream.generate(scvIn).map(text ->{
				out.println(text);// ���� ����
				System.out.println("���� ���� : " + text);
				System.out.println("���� �޼��� �Է� : ");
				return text;
			}).allMatch(text -> !"bye".equalsIgnoreCase(text));		
			
		}catch (IOException e) {
				System.out.println("����� ���� �߻�!");
		}
	}
}