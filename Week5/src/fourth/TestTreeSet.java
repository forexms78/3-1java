package fourth;

import java.util.TreeSet;

// 리턴타입 E
// first() 제일 낮은 객체를 리턴
// last() 제일 높은 객체 리턴
// lower(E e) 주어진 객체보다 바로 아래 객체를 리턴
// higher(E e) 주어진 객체보다 바로 위 객체를 리턴
// floor(E e) 주어진 객체와 동등한 객체가 있으면 리턴, 만약 없으면 주어진 객체의 바로 아래의 객체를 리턴
// ceiling(E e) 주어진 객체와 동등한 객 체가 있으면 리턴, 만약 없으면 주어진 객체의 바로 위의 객체를 리턴
// pollFirst() 제일 낮은 객체를 꺼내오고 컬렉션에서 제거
// pollLast() 제일 높은 객체를 꺼내오고 컬렉션에서 제거
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