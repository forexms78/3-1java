package fourth;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class TestTimeServer {
// 멀티캐스트 IP 주소 : 224.0.0.0 ~ 239.255.255.255
// UDP : USER DATAGRAM PROTOCOL (Layer 4 : Transport layer)
	public static void main(String[] args) {
		System.out.println("멀티캐스트 타임 서버");
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
				System.out.println("시간 전송 : " + dates);
				
				Thread.sleep(1000); // 1초 단위로 브로드캐스트
			}
		}catch (Exception e) {
			
		}
	}
}