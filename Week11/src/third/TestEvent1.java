//// #2
////package third;
////
////import java.awt.BorderLayout;
////import javax.swing.JFrame;
////import javax.swing.JLabel;
////import javax.swing.JScrollBar;
////
////public class TestEvent1 extends JFrame {
////	TestEvent1(){
////		setTitle("Scrollbar Event Handling~");
////		
////		JLabel lbl = new JLabel("", JLabel.CENTER);
////		JScrollBar sb = new JScrollBar(JScrollBar.HORIZONTAL);  //��ũ�ѹ��� ��� ��ƼĮ���ϸ� ī�η� ��ũ���ϰԵȴ�
////		sb.setValues(50, 1, 0, 100);
////		sb.addAdjustmentListener(ev -> {
////			int display = ev.getValue();
////			lbl.setText("���� ��ġ : " + display);
////		});
////
////		
////		add("North", lbl);
////		add("South", sb);
////		
////		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////		setSize(500,300);
////		setVisible(true);
////	}
////	
////	public static void main(String[] args) {
////		new TestEvent1();
////	}
////}
package third;

import java.awt.BorderLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class TestEvent1 extends JFrame {
	TestEvent1(){
		setTitle("Scrollbar Event Handling~");
		
		JLabel lbl = new JLabel("", JLabel.CENTER);
		JScrollBar sb = new JScrollBar(JScrollBar.HORIZONTAL);  //��ũ�ѹ��� ��� ��ƼĮ���ϸ� ī�η� ��ũ���ϰԵȴ�
		sb.setValues(50, 1, 0, 100);
		
//		sb.addAdjustmentListener(ev -> {
//			int display = ev.getValue();
//			lbl.setText("���� ��ġ : " + display);
//		});
		

		sb.addAdjustmentListener(new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				// TODO Auto-generated method stub
				int display = e.getValue();
				lbl.setText("���� ��ġ : " + display);
				
			}
		});

		add("North", lbl);
		add("South", sb);
		
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
//		
////		���ٷ� ó������ ���� ����
////		ActionListener al = new ActionListener() {
////			public void actionPerformed(ActionEvent ev) {
////				System.out.println("��ư Ŭ��!");
////			}
////		};
//
//		
//// 		ActionListener�� actionPerformed�� ������ ������ �ȵǴµ� ���� �ڵ�� �������ϸ� actionPerformed�� �ʿ䰡 ���Եȴ�
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