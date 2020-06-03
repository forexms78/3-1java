package fourth;
import java.util.Stack;
// LIFO (Last In First Out)
// Stack

// push(E item) �־��� ��ü�� ���ÿ� �ִ´�
// pop() ������ �� �� ��ü�� �����ϰ�, �ش� ��ü�� ���ÿ��� �����Ѵ�.
// peek() ������ �� �� ��ü�� �����Ѵ�.

// Stack<E> s = new Stack<E>();
public class TestStack {
	public static void main(String[] args) {
		Stack<Card> s = new Stack<Card>();
		
		s.push(new Card("Jack"));
		s.push(new Card("7"));
		s.push(new Card("King"));
		s.push(new Card("2"));
		s.push(new Card("10"));
		
		while(!s.isEmpty()) {
			Card card =  s.pop();
			System.out.println("���� ī�� : " + card.getCard());
		}
		s.pop(); // EmptyStackException �߻�
	}
}