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
		System.out.println("���� ������ ...");
		c.connect(new InetSocketAddress("127.0.0.1"/*ȣ��Ʈ����*/, 10000/*��Ʈ��ȣ*/),5000/*5�ʰ��� �ð����д�*/);
		System.out.println("���� ���� �Ϸ� ...");
		
		o = new PrintWriter(c.getOutputStream(), true);
		
		Scanner i = new Scanner(System.in);
		String msg;
		
		System.out.println("�޽�����? ");
		
		while((msg = i.nextLine()) != null /*Ű����� Ÿ�����Ѱ��� ������������� while���� ��� ������*/) {
			if(msg.contentEquals("bye")/*Ż���Ű�� ���� bye�� ġ�� ���������Եȴ�*/) break;
			o.println(msg);
			System.out.println("�� ���� �޼�����? (���α׷� ����� bye �Է�) ");			
		}
		System.out.println("���α׷� ����!");
		o.close(); /*������ �ξƿ� ��ü ���� ��¿�*/
		i.close(); /*��ĵ*/
		c.close(); /*����*/
	}
}