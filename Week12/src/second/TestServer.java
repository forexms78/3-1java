package second;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
//Ŭ���̾�Ʈ                ����
//2)���� ����              1)�������� ����
//              3)������ (���� ��û �� ����)
//4)����½�Ʈ�� ����  4)����½�Ʈ�� ����
//5)�ڷ�����               5)�ڷ�����
//6)���ϴݱ�               6)���ϴݱ�
public class TestServer {

	public static void main(String[] args) {
		try(ServerSocket s = new ServerSocket(9999);
				Socket conn = s.accept();
				InputStream is = conn.getInputStream();
				ObjectInputStream ois = new ObjectInputStream(is);)
		{
			System.out.println((String)ois.readObject() + " �ȳ�~");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}