package first;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class TestStreamIterator {
	// Iterator와 Stream
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple","kiwi","banana","watermelon");
		
		Iterator<String> it = fruits.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			String fruit = it.next();
			System.out.println(fruit);
		}
		
		System.out.println();
		
		Stream<String> st = fruits.stream();
		st.forEach(fruit -> {
			System.out.println(fruit);
			System.out.println((int)(Math.random()*6)+1);
		});
		
		
		// 함수적 인터페이스
		// Consumer : 매개변수 값은 있고 리턴값은 없음
		// Supplier : 매개변수 값은 없고 리턴값은 있음
		// Function : 매개변수 값도 있고 리턴값도 있음  (매개변수 Function 리턴)
		// Operator : 매개변수 값도 있고 리턴값도 있음  (매개변수 Operator 리턴)
		// Predicate : 매개변수 값도 있고 리턴값이 T/F (매개변수 Predicate Boolean리턴)
	}
}