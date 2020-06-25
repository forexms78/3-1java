package hw;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestClient7 extends JFrame implements ActionListener {
	JTextField tf1;
	JLabel lbl;
	JButton b1;
	JButton b2;
	
	Socket c = null;
	
	public TestClient7() throws IOException{
		setLayout(new FlowLayout());
		tf1 = new JTextField(10);
		lbl = new JLabel("Display");
		b1 = new JButton("전송");
		b2 = new JButton("종료");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		add(tf1);add(lbl);add(b1);add(b2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,120);
		setVisible(true);
		
		c = new Socket();
		lbl.setText("서버 연결중");
		c.connect(new InetSocketAddress("127.0.0.1"/*호스트네임*/, 10000/*포트번호*/),5000/*5초간의 시간을둔다*/);
		lbl.setText("(서버 연결 완료)메시지를 입력");
	}
	
	public static void main(String[] args) throws IOException {		
			new TestClient7();
	}

	
	@Override
	public void actionPerformed(ActionEvent ev) {
		String s1 = tf1.getText();
		PrintWriter o = null;
		try {
			o = new PrintWriter(c.getOutputStream(), true);
		} catch (IOException e) {
		}

		if (ev.getSource() == b1) {
			o.println(s1);
			tf1.setText("");
			lbl.setText("전송완료 보낼 메시를 다시 입력해주세요");
		}
		if (ev.getSource() == b2) {
			try {
				System.out.println("프로그램 종료!");
				o.close();
				c.close();
				System.exit(0);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	

}