package fourth;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class TestTimeClient {
	public static void main(String[] args) {
		System.out.println("멀티캐스트 타임 클라이언트");		
		try(MulticastSocket ms = new MulticastSocket(9500)){
			InetAddress group = InetAddress.getByName("224.0.0.0");
			ms.joinGroup(group); // 메세지 받기 전에 그룹에 가입
			System.out.println("멀티캐스트 그룹 가입완료!");
			
			byte[] buf = new byte[256];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			
			for(int k = 0; k < 3; k++) {
				ms.receive(packet);				
				String received = new String(packet.getData());
				System.out.println(received);
			}
			ms.leaveGroup(group); // 멀티캐스트 그룹 탈퇴			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("멀티캐스트 타임 클라이언트 종료됨.");
	}
}
