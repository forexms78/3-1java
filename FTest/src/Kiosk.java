//package second;

//import java.awt.BorderLayout;
//import java.awt.ComponentOrientation;
//import java.awt.FlowLayout;
//import java.awt.GridLayout;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//public class TestGui2 extends JFrame {	
//	TestGui2(){
//		setTitle("Grid Layout");
//		setLayout(new GridLayout(0,3));		
//	
//		JButton b1 = new JButton("Button 1");
//		JButton b2 = new JButton("Btn 2");
//		JButton b3 = new JButton("B 3");
//		JButton b4 = new JButton("B4");
//		JButton b5 = new JButton("Button 55555");
//		JButton b6 = new JButton("Button 55555");
//
//		
//		add(b1);
//		add(b2);
//		add(b3);
//		add(b4);
//		add(b5);
//		add(b6);
//		add(new JButton("마지막 버튼"));
//		
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

// #2


import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Kiosk extends JFrame implements ActionListener {	
	
	JPanel pan1, pan2, pan3;
	JLabel textl1, textl2;
	JButton btn1, btn2, btn3;
	JButton jb1, jb2, jb3, jb4, jb5;
	ImageIcon mov1, mov2, mov3;
	
	Kiosk(){
		setTitle("영화 예매 키오스크");
		setLayout(new BorderLayout());
		
		
		
		pan1 =new JPanel();
		pan2 =new JPanel();
		pan3 =new JPanel();
		
		textl1 = new JLabel("영화 예매");	
		textl2 = new JLabel("상영 가능영화 : 마녀 어벤져스 독전");

		mov1 = new ImageIcon("./images/movie1.jpg");
		btn1 = new JButton("영화제목 : 마녀", mov1);
		mov2 = new ImageIcon("./images/movie2.jpg");
		btn2 = new JButton("영화제목 : 어벤져스", mov2);
		mov3 = new ImageIcon("./images/movie3.jpg");
		btn3 = new JButton("영화제목 : 독전", mov3);
		 
		jb1 = new JButton("예매");
		jb2 = new JButton("취소");
		jb3 = new JButton("전체 이용가");
		jb4 = new JButton("15세 이용가");
		jb5 = new JButton("19세 이용가");
		
		pan1.add(textl1);
		pan1.add(jb3);
		pan1.add(jb4);
		pan1.add(jb5);
		
		pan2.add(btn1);
		pan2.add(btn2);
		pan2.add(btn3);
		
		pan3.add(textl2);
		pan3.add(jb1);
		pan3.add(jb2);
		

 		add("North",pan1);
 		add("Center",pan2);
 		add("South",pan3);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1100, 500);
		setVisible(true);		
	}

	public static void main(String[] args) {
		new Kiosk();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jb3) {
	}
	}}

