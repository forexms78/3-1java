// #2
package third;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class TestEvent1 extends JFrame {
	TestEvent1(){
		setTitle("Scrollbar Event Handling~");
		
		JLabel lbl = new JLabel("", JLabel.CENTER);
		JScrollBar sb = new JScrollBar(JScrollBar.VERTICAL);
		sb.setValues(50, 1, 0, 100);
		sb.addAdjustmentListener(ev -> {
			int display = ev.getValue();
			lbl.setText("���� ��ġ : " + display);
		});
		
		
		add("North", lbl);
		add(sb, BorderLayout.EAST);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestEvent1();
	}
}



// #1  
//package third;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//
//public class TestEvent1 extends JFrame {
//	//  Event Handling Part1
//	TestEvent1(){
//		setTitle("Event Handling~");
//		
////		ActionListener al = new ActionListener() {
////			public void actionPerformed(ActionEvent ev) {
////				System.out.println("��ư Ŭ��!");
////			}
////		};
//		
//		ActionListener al = ev -> System.out.println("��ư Ŭ�� (���ٽ����� ó��)");
//		
//		
//		JButton btn = new JButton("Ŭ��!");
//		btn.addActionListener(al); // ��ư btn�� �̺�Ʈ ������ ���
//		
//		add(btn);	
//		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(300,120);
//		setVisible(true);
//	}
//	
//	public static void main(String[] args) {
//		new TestEvent1();
//	}
//}