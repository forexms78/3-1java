package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer7 extends Thread{
	protected static boolean cont = true;
	protected Socket conn = null;

	private TestServer7(Socket c) {
		conn = c;
		start();
	}
		
	public void run() {
		BufferedReader i;
		System.out.println("��� ������ ����");
		
		try {
			i = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String msg;
			
			while((msg = i.readLine()) != null) {
				System.out.println("���� �޼��� : " + msg);			
			}
			
			i.close();
			conn.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args) throws IOException {
		ServerSocket s = new ServerSocket(10000);
		System.out.println("���� ���� ����");
		
		while(cont) {
			System.out.println("���� ����� ....");
			new TestServer7(s.accept());
		}
		s.close();
	}
}
