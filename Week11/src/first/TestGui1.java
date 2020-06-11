// #5
package first;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestGui1 extends JFrame {
	TestGui1(){
		setTitle("안녕 GUI~");
		
		JPanel p = new JPanel();
		JLabel l = new JLabel("안녕 레이블~");	
		JButton b = new JButton("버튼");
		
		p.add(l); // 패널객체 p에 레이블 부착
		p.add(b); // 패널객체 p에 버튼 부착
		
		add(p); // 패널을 프레임에 부착
		
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
//		setTitle("안녕 GUI~");
//		
//		JButton b = new JButton("버튼");
//		add(b); // 버튼을 프레임에 부착
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
//		setTitle("안녕 GUI~");
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
//		setTitle("안녕 GUI~");
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
//		f.setTitle("안녕 GUI~");
//		f.setSize(400,100);
//		f.setVisible(true);
//	}
//}