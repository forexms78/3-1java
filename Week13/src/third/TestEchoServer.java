package third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TestEchoServer implements Runnable {
	
	private static Socket cs;
	
	public TestEchoServer(Socket cs) {
		this.cs = cs;
	}
	
	// Ŭ���̾�Ʈ ����ó�� & ������ ��ü ����
	public static void main(String[] args) {
		System.out.println("������ ���� ����!");
		try (ServerSocket ss = new ServerSocket(11000)) {
			while(true) {
				System.out.println("���� �����....");
				Socket cs = ss.accept();
				
				TestEchoServer tes = new TestEchoServer(cs);
				new Thread(tes).start();
			}	
		} catch (IOException e) {
				e.printStackTrace();
		}
		System.out.println("���� ���� ����...");
	}

	// ����� ���� �� �Է� �ؽ�Ʈ ���� ó��
	@Override
	public void run() {
		System.out.println("Ŭ���̾�Ʈ �����!");

		try (BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream())); // ���ſ�
				PrintWriter out = new PrintWriter(cs.getOutputStream(), true);) { // �۽ſ�
			// Old Style
//				String inputLine;
//				while ((inputLine = br.readLine()) != null) {
//					System.out.println("Ŭ���̾�Ʈ �޼��� : " + inputLine);
//					out.println(inputLine); // Ŭ���̾�Ʈ ���� Ŭ���̾�Ʈ�� ���� �޼��� ���� (����)
//				}	

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
			s.map(text -> {
				System.out.println("Ŭ���̾�Ʈ �޼��� : " + text);
				out.println(text);
				return text;
			}).allMatch(text -> text != null);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
