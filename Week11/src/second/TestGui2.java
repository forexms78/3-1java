package second;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestGui2 extends JFrame {	
	TestGui2(){
		setTitle("Grid Layout");
		setLayout(new GridLayout(0,3));		
	
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Btn 2");
		JButton b3 = new JButton("B 3");
		JButton b4 = new JButton("B4");
		JButton b5 = new JButton("Button 55555");
		JButton b6 = new JButton("Button 55555");

		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(new JButton("마지막 버튼"));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);		
	}

	public static void main(String[] args) {
		new TestGui2();
	}
}

// #2
//package second;
//
//import java.awt.BorderLayout;
//import java.awt.ComponentOrientation;
//import java.awt.FlowLayout;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//public class TestGui2 extends JFrame {	
//	TestGui2(){
//		setTitle("Border Layout");
//		setLayout(new BorderLayout());		
//	
//		JButton b1 = new JButton("Button 1");
//		JButton b2 = new JButton("Btn 2");
//		JButton b3 = new JButton("B 3");
//		JButton b4 = new JButton("B4");
//		JButton b5 = new JButton("Button 55555");
//		
////		add(b1, BorderLayout.EAST);
////		add(b2,BorderLayout.CENTER);
////		add(b3,BorderLayout.WEST);
////		add(b4,BorderLayout.NORTH);
////		add(b5,BorderLayout.CENTER);
//		
//		add("East", b1);
//		add("South", b2);
//		add(b3,BorderLayout.WEST );
//		add("North", b4);
//		add(b5, BorderLayout.CENTER);
//		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(300, 300);
//		setVisible(true);		
//	}
//
//	public static void main(String[] args) {
//		new TestGui2();
//	}
//}



// #1
//package second;
//
//import java.awt.ComponentOrientation;
//import java.awt.FlowLayout;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//// Layout : flow, border, grid, card, gridbag
//// setLayout(new FlowLayout())
//// setLayout(null)
//
//// Default Layout Manager
//// JDialog, JFrame, JWindow : BorderLayout
//// JApplet, JPanel : FlowLayout
//public class TestGui2 extends JFrame {	
//	TestGui2(){
//		setTitle("Flow Layout");
//		JPanel p = new JPanel(new FlowLayout()); // 플로우 레이아웃 지정 (생략 가능)
//		p.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT); // 패널에 컴포넌트를 오른쪽에서 왼쪽으로 배치
//		
//		JButton b1 = new JButton("Button 1");
//		JButton b2 = new JButton("Btn 2");
//		JButton b3 = new JButton("B 3");
//		JButton b4 = new JButton("B4");
//		JButton b5 = new JButton("Button 55555");
//		JLabel O = new JLabel("언아녕");
//		
//		p.add(b1);
//		p.add(b2);
//		p.add(b3);
//		p.add(b4);
//		p.add(b5);
//		p.add(O);
//		
//		
//		add(p);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(250, 120);
//		setVisible(true);		
//	}
//
//	public static void main(String[] args) {
//		new TestGui2();
//	}
//}