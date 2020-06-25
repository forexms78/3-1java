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
		System.out.println("���� ������ ...");
		c.connect(new InetSocketAddress("127.0.0.1", 10000),5000);
		System.out.println("���� ���� �Ϸ� ...");
		
		o = new PrintWriter(c.getOutputStream(), true);
		
		Scanner i = new Scanner(System.in);
		String msg;
		
		System.out.println("�޽�����? ");
		
		while((msg = i.nextLine()) != null) {
			if(msg.contentEquals("bye")) break;
			o.println(msg);
			System.out.println("�� ���� �޼�����? (���α׷� ����� bye �Է�) ");			
		}
		System.out.println("���α׷� ����!");
		o.close();
		i.close();
		c.close();
	}
}