package first;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class TestStreamIterator {
	// Iterator�� Stream
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
		
		
		// �Լ��� �������̽�
		// Consumer : �Ű����� ���� �ְ� ���ϰ��� ����
		// Supplier : �Ű����� ���� ���� ���ϰ��� ����
		// Function : �Ű����� ���� �ְ� ���ϰ��� ����  (�Ű����� Function ����)
		// Operator : �Ű����� ���� �ְ� ���ϰ��� ����  (�Ű����� Operator ����)
		// Predicate : �Ű����� ���� �ְ� ���ϰ��� T/F (�Ű����� Predicate Boolean����)
	}
}