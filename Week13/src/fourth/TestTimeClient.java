package fourth;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class TestTimeClient {
	public static void main(String[] args) {
		System.out.println("��Ƽĳ��Ʈ Ÿ�� Ŭ���̾�Ʈ");		
		try(MulticastSocket ms = new MulticastSocket(9500)){
			InetAddress group = InetAddress.getByName("224.0.0.0");
			ms.joinGroup(group); // �޼��� �ޱ� ���� �׷쿡 ����
			System.out.println("��Ƽĳ��Ʈ �׷� ���ԿϷ�!");
			
			byte[] buf = new byte[256];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			
			for(int k = 0; k < 3; k++) {
				ms.receive(packet);				
				String received = new String(packet.getData());
				System.out.println(received);
			}
			ms.leaveGroup(group); // ��Ƽĳ��Ʈ �׷� Ż��			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("��Ƽĳ��Ʈ Ÿ�� Ŭ���̾�Ʈ �����.");
	}
}
