// #2
package fourth;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestEvent2 extends JFrame implements ActionListener{
	JTextField tf1, tf2;
	JLabel lbl;
	JButton b1;
	JButton b2;
	
	TestEvent2(){
		setLayout(new FlowLayout());
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);		
		lbl = new JLabel("Display");
		b1 = new JButton("Plus");
		b2 = new JButton("Minus");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		add(tf1);add(tf2);add(lbl);add(b1);add(b2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,120);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ev) {
		String s1 = tf1.getText();
		String s2 = tf2.getText();
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		int result = 0;
		if(ev.getSource() == b1) {
			result = a + b;
		}else if(ev.getSource() == b2) {
			result = a - b;
		}
		lbl.setText(String.valueOf(result));		
	}
	
	public static void main(String[] args) {  
		new TestEvent2();
	}	
}


// #1
//package fourth;
//
//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//
//public class TestEvent2 extends JFrame{
//	//JTextField tf1;
//	TestEvent2(){
//		setLayout(new FlowLayout());
//		JTextField tf1 = new JTextField(10);
//		JTextField tf2 = new JTextField(10);
//		// tf1 = new JTextField(10);
//		JLabel lbl = new JLabel("Display");
//		JButton b1 = new JButton("Plus");
//		JButton b2 = new JButton("Minus");
//		
//		ActionListener al = new ActionListener() {
//			public void actionPerformed(ActionEvent ev) {
//				String s1 = tf1.getText();
//				String s2 = tf2.getText();
//				int a = Integer.parseInt(s1);
//				int b = Integer.parseInt(s2);
//				int result = 0;
//				if(ev.getSource() == b1) {
//					result = a + b;
//				}else if(ev.getSource() == b2) {
//					result = a - b;
//				}
//				lbl.setText(String.valueOf(result));				
//			}
//		};
//		b1.addActionListener(al);
//		b2.addActionListener(al);
//		
//		add(tf1);add(tf2);add(lbl);add(b1);add(b2);
//		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(500,120);
//		setVisible(true);
//	}
//	
//	public static void main(String[] args) {  
//		new TestEvent2();
//	}  
//}