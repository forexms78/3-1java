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
		b1 = new JButton("����");
		b2 = new JButton("����");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		add(tf1);add(lbl);add(b1);add(b2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,120);
		setVisible(true);
		
		c = new Socket();
		lbl.setText("���� ������");
		c.connect(new InetSocketAddress("127.0.0.1"/*ȣ��Ʈ����*/, 10000/*��Ʈ��ȣ*/),5000/*5�ʰ��� �ð����д�*/);
		lbl.setText("(���� ���� �Ϸ�)�޽����� �Է�");
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
			lbl.setText("���ۿϷ� ���� �޽ø� �ٽ� �Է����ּ���");
		}
		if (ev.getSource() == b2) {
			try {
				System.out.println("���α׷� ����!");
				o.close();
				c.close();
				System.exit(0);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	

}