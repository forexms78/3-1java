// #5
package first;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestGui1 extends JFrame {
	TestGui1(){
		setTitle("�ȳ� GUI~");
		
		JPanel p = new JPanel();
		JLabel l = new JLabel("�ȳ� ���̺�~");	
		JButton b = new JButton("��ư");
		
		p.add(l); // �гΰ�ü p�� ���̺� ����
		p.add(b); // �гΰ�ü p�� ��ư ����
		
		add(p); // �г��� �����ӿ� ����
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,100);
		//pack();
		setVisible(true);		
	}	
	
	public static void main(String[] args) {
		new TestGui1();
	}
}


// #4
//package first;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//
//public class TestGui1 extends JFrame {
//	TestGui1(){
//		setTitle("�ȳ� GUI~");
//		
//		JButton b = new JButton("��ư");
//		add(b); // ��ư�� �����ӿ� ����
//		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(400,100);
//		setVisible(true);		
//	}	
//	
//	public static void main(String[] args) {
//		new TestGui1();
//	}
//}


// #3
//package first;
//
//import javax.swing.JFrame;
//
//public class TestGui1 extends JFrame {
//	// AWT, SWING, Java2D, JavaFX
//	TestGui1(){
//		setTitle("�ȳ� GUI~");
//		setSize(400,100);
//		setVisible(true);		
//	}	
//	
//	public static void main(String[] args) {
//		new TestGui1();
//	}
//}



// #2
//package first;
//
//import javax.swing.JFrame;
//
//
//class UrFrame extends JFrame{
//	UrFrame(){
//		setTitle("�ȳ� GUI~");
//		setSize(400,100);
//		setVisible(true);		
//	}
//}
//
//public class TestGui1 {
//	// AWT, SWING, Java2D, JavaFX
//	public static void main(String[] args) {
//		new UrFrame();
//	}
//}




// #1
//package first;
//
//import javax.swing.JFrame;
//
//public class TestGui1 {
//	// AWT, SWING, Java2D, JavaFX
//	public static void main(String[] args) {
//		JFrame f = new JFrame();
//		
//		f.setTitle("�ȳ� GUI~");
//		f.setSize(400,100);
//		f.setVisible(true);
//	}
//}