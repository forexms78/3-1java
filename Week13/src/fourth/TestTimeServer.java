package fourth;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class TestTimeServer {
// ��Ƽĳ��Ʈ IP �ּ� : 224.0.0.0 ~ 239.255.255.255
// UDP : USER DATAGRAM PROTOCOL (Layer 4 : Transport layer)
	public static void main(String[] args) {
		System.out.println("��Ƽĳ��Ʈ Ÿ�� ����");
		DatagramSocket ss = null;
		
		try {
			ss = new DatagramSocket();
			while(true) {
				String dates = new Date().toString();
				byte[] buf = new byte[256];
				buf = dates.getBytes();
				
				InetAddress group = InetAddress.getByName("224.0.0.0");
				DatagramPacket packet = new DatagramPacket(buf, buf.length, group, 9500);
				ss.send(packet);
				System.out.println("�ð� ���� : " + dates);
				
				Thread.sleep(1000); // 1�� ������ ��ε�ĳ��Ʈ
			}
		}catch (Exception e) {
			
		}
	}
}