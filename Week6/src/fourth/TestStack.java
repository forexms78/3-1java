package fourth;
import java.util.Stack;
// LIFO (Last In First Out)
// Stack

// push(E item) 주어진 객체를 스택에 넣는다
// pop() 스택의 맨 위 객체를 리턴하고, 해당 객체를 스택에서 제거한다.
// peek() 스택의 맨 위 객체를 리턴한다.

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
			System.out.println("꺼낸 카드 : " + card.getCard());
		}
		s.pop(); // EmptyStackException 발생
	}
}