package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestEchoServer {
	public static void main(String[] args) {
		System.out.println("���� ����!");
		try(ServerSocket ss = new ServerSocket(11000)){  /*���� ���� 11000��Ʈ ����*/
			System.out.println("���� �����....");
			
			Socket cs/*Ŭ���̾�Ʈ�� �ּҸ� �������ִ�*/ = ss.accept();		/*Socket cs = (new)�� ����ȵȴ�. ss.accept()*/
			System.out.println("Ŭ���̾�Ʈ �����!");
			
			try(BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream())); // ���ſ�
					PrintWriter out /* ��¹��� */= new PrintWriter(cs.getOutputStream(), true /*������ ����� ��Ȱ���Ѵ� ������ �÷����� �ɼ��ִ�*/);){ // �۽ſ�
				
					String inputLine;
					while ((inputLine = br.readLine()) /* ������ �д´� */!= null) {
						System.out.println("Ŭ���̾�Ʈ �޼��� : " + inputLine);
						out.println(inputLine); // Ŭ���̾�Ʈ ���� Ŭ���̾�Ʈ�� ���� �޼��� ���� (����)
					}	
					}catch(IOException e) {
						e.printStackTrace();
					}
		} catch (IOException e) {		e.printStackTrace();		}
		System.out.println("���� ���� ����...");
	}
}
