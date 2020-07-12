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
////		JScrollBar sb = new JScrollBar(JScrollBar.HORIZONTAL);  //스크롤바의 모양 버티칼로하면 카로로 스크롤하게된다
////		sb.setValues(50, 1, 0, 100);
////		sb.addAdjustmentListener(ev -> {
////			int display = ev.getValue();
////			lbl.setText("현재 위치 : " + display);
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
		JScrollBar sb = new JScrollBar(JScrollBar.HORIZONTAL);  //스크롤바의 모양 버티칼로하면 카로로 스크롤하게된다
		sb.setValues(50, 1, 0, 100);
		
//		sb.addAdjustmentListener(ev -> {
//			int display = ev.getValue();
//			lbl.setText("현재 위치 : " + display);
//		});
		

		sb.addAdjustmentListener(new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				// TODO Auto-generated method stub
				int display = e.getValue();
				lbl.setText("현재 위치 : " + display);
				
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
////		람다로 처리하지 않은 문장
////		ActionListener al = new ActionListener() {
////			public void actionPerformed(ActionEvent ev) {
////				System.out.println("버튼 클릭!");
////			}
////		};
//
//		
//// 		ActionListener는 actionPerformed가 없으면 실행이 안되는데 람다 코드로 실행을하면 actionPerformed가 필요가 없게된다
//
//		ActionListener al = ev -> System.out.println("버튼 클릭 (람다식으로 처리)");
//		
//		
//		JButton btn = new JButton("클릭!");
//		btn.addActionListener(al); // 버튼 btn에 이벤트 리스너 등록
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