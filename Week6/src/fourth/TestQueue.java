package fourth;
import java.util.LinkedList;
import java.util.Queue;
//FIFO (First In First Out)
//Queue
//offer(E item) 주어진 객체를 큐에 넣는다
//poll() 객체를 리턴하고, 해당 객체를 큐에서 제거한다.
//peek() 객체를 리턴한다.

//Queue<E> q = new LinkedList<E>();
public class TestQueue {
	public static void main(String[] args) {
		Queue<Trump> q = new LinkedList<Trump>();
		
		q.offer(new Trump("다이아몬드","Queen"));
		q.offer(new Trump("스페이드","Queen"));
		q.offer(new Trump("하트","Queen"));
		q.offer(new Trump("클로버","Queen"));
		
		Trump t1 = q.peek();
		Trump t2 = q.peek();
		Trump t3 = q.peek();



		System.out.println(t1.type + " " + t1.number);
		System.out.println(t2.type + " " + t2.number);

		System.out.println(t3.type + " " + t3.number);

		
		while(!q.isEmpty()) {
			Trump t = q.poll();
			System.out.println(t.type + " " + t.number);
		}
	}


}