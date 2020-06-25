package first;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

// InetAddress
// byte[] getAddress() : IP �ּҸ� �迭�� ����
// String getHostAdress() : IP �ּҸ� ���ڿ��� ����
// String getHostName() : ȣ��Ʈ �̸��� ���ڿ��� ����

public class TestNet1 {
	public static void main(String[] args) {
		InetAddress a1 = null, a2 = null;
		Scanner i = new Scanner(System.in);
		String url = i.nextLine();
		
		try {
			a1 = InetAddress.getByName(url);
			a2 = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			System.out.print(url + "�� �������� �ʽ��ϴ�.");
			System.out.print(e.getMessage());
			//e.printStackTrace();
		}	
		System.out.print(url + " IP �ּ� : ");
		System.out.println(a1.getHostAddress());
		System.out.print("����  IP �ּ� : ");
		System.out.println(a2.getHostAddress());
		
	}
}