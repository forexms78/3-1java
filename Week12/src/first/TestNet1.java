package first;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

// InetAddress
// byte[] getAddress() : IP 주소를 배열로 리턴
// String getHostAdress() : IP 주소를 문자열로 리턴
// String getHostName() : 호스트 이름을 문자열로 리턴

public class TestNet1 {
	public static void main(String[] args) {
		InetAddress a1 = null, a2 = null;
		Scanner i = new Scanner(System.in);
		String url = i.nextLine();
		
		try {
			a1 = InetAddress.getByName(url);
			a2 = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			System.out.print(url + "은 존재하지 않습니다.");
			System.out.print(e.getMessage());
			//e.printStackTrace();
		}	
		System.out.print(url + " IP 주소 : ");
		System.out.println(a1.getHostAddress());
		System.out.print("로컬  IP 주소 : ");
		System.out.println(a2.getHostAddress());
		
	}
}