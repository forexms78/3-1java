package fourth;

import java.util.TreeSet;

// ����Ÿ�� E
// first() ���� ���� ��ü�� ����
// last() ���� ���� ��ü ����
// lower(E e) �־��� ��ü���� �ٷ� �Ʒ� ��ü�� ����
// higher(E e) �־��� ��ü���� �ٷ� �� ��ü�� ����
// floor(E e) �־��� ��ü�� ������ ��ü�� ������ ����, ���� ������ �־��� ��ü�� �ٷ� �Ʒ��� ��ü�� ����
// ceiling(E e) �־��� ��ü�� ������ �� ü�� ������ ����, ���� ������ �־��� ��ü�� �ٷ� ���� ��ü�� ����
// pollFirst() ���� ���� ��ü�� �������� �÷��ǿ��� ����
// pollLast() ���� ���� ��ü�� �������� �÷��ǿ��� ����
public class TestTreeSet {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TreeSet
		// 7 4 10 1 5
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		
		numbers.add(7);
		numbers.add(new Integer(4));
		numbers.add(new Integer(10));
		numbers.add(new Integer(1));
		numbers.add(new Integer(5));
		
		Integer number = null;
		
		number = numbers.first();
		//System.out.println(number);
		
		number = numbers.last();
		//System.out.println(number);
		
		number = numbers.lower(3);
		//System.out.println(number);

		number = numbers.higher(6);
		//System.out.println(number);
		
		number = numbers.floor(100);
		System.out.println(number);
		
		number = numbers.ceiling(100);
		System.out.println(number);

		number = numbers.ceiling(6);
		//System.out.println(number);
		
		
		while(!numbers.isEmpty()) {
			number = numbers.pollLast();
			//System.out.println(number + " : " + numbers.size());
		}
	}
}