package fourth;
import java.util.LinkedList;
import java.util.Queue;
//FIFO (First In First Out)
//Queue
//offer(E item) �־��� ��ü�� ť�� �ִ´�
//poll() ��ü�� �����ϰ�, �ش� ��ü�� ť���� �����Ѵ�.
//peek() ��ü�� �����Ѵ�.

//Queue<E> q = new LinkedList<E>();
public class TestQueue {
	public static void main(String[] args) {
		Queue<Trump> q = new LinkedList<Trump>();
		
		q.offer(new Trump("���̾Ƹ��","Queen"));
		q.offer(new Trump("�����̵�","Queen"));
		q.offer(new Trump("��Ʈ","Queen"));
		q.offer(new Trump("Ŭ�ι�","Queen"));
		
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