package fourth;

import java.awt.GridLayout;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestTimeClient3 extends JFrame {	
	public TestTimeClient3(){
		setTitle("��Ƽĳ��Ʈ Ÿ�� Ŭ���̾�Ʈ3");
		 
		JPanel p = new JPanel(new GridLayout(2,0));
		JLabel l = new JLabel();
		JButton b = new JButton("��Ƽĳ��Ʈ �׷� ����!");
		
		p.add(l);
		p.add(b);
		add(p);
		
		b.addActionListener(e -> {
			try(MulticastSocket ms = new MulticastSocket(9500)){
				InetAddress group = InetAddress.getByName("224.0.0.0");
				ms.joinGroup(group); // �޼��� �ޱ� ���� �׷쿡 ����
				l.setText("��Ƽĳ��Ʈ �׷� ���ԿϷ�!");
				
				byte[] buf = new byte[256];
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				
				String texts = "";
				for(int k = 0; k < 3; k++) {
					ms.receive(packet);				
					String received = new String(packet.getData());
					texts = texts + received + "<br>";
				}
				l.setText("<html>"+texts+"</html>");
				ms.leaveGroup(group); // ��Ƽĳ��Ʈ �׷� Ż��			
			} catch (IOException err) {
				err.printStackTrace();
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TestTimeClient3();
	}
}