package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TestEchoClient {
	public static void main(String[] args) {
		System.out.println("���� Ŭ���̾�Ʈ!");
		try (Socket cs /* ���������� �ƴ� �Ϲݼ��� */ = new Socket("127.0.0.1",
				11000)/* ������ ������ �ּҰ� �ʿ��ϴ� */;
				PrintWriter out = new PrintWriter(cs.getOutputStream(),true/*��� ��ü*/);
				BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
		/* ������ ������ �޽����� ���� ���� ��ü */){
			System.out.println("���� �����....");
			Scanner scv = new Scanner(System.in);
			
			while(true) {
				System.out.println("���� �޼��� �Է� : ");
				String inputLine = scv.nextLine();
				if ("bye".equalsIgnoreCase /* �빮�ڸ� �ᵵ �νĵǴ� */(inputLine)) {
					break;
				}
				out.println(inputLine); // ���� ����
				
				System.out.println("���� ���� : " + br/*�������� ���� ����*/.readLine()/*���ڿ��� �ִ´�*/);
			}
		}catch (IOException e) {
				System.out.println("����� ���� �߻�!");
		}
	}
}