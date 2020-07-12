import javax.swing.*;
import java.awt.*;

public class Moive extends JFrame {
	Moive() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel textLabel = new JLabel("영화 예매");
		ImageIcon img = new ImageIcon("./images/movie2.jpg"); 
		JLabel imageLabel = new JLabel(img);
		ImageIcon icon = new ImageIcon("./images/movie1.jpg"); 
		JLabel label = new JLabel("커피한잔 하실래예, 전화주이소",icon, SwingConstants.CENTER);
		c.add(textLabel);
 		c.add(imageLabel);
 		c.add(label);
		setSize(800,600);
		setVisible(true);
	}
	public static void main(String [] args) {
		new Moive();
	}
}