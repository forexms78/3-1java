package first;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
// Set Collection : 중복값 허용 x, 순서유지 x
// HashSet, LinkedHashSet, TreeSet

// 객체 삽입 : add() 리턴은 boolean, 매개변수 E

// 객체 검색 : isEmpty() 리턴은 boolean
// 객체 검색 : contains() 리턴은 boolean
// 객체 검색 : size() 리턴은 int
// 객체 검색 : iterator() 리턴 Iterator<E>
// 객체 삭제 : clear() 
// 객체 삭제 : remove() 리턴 boolean, 매개변수는 O

// 반복자
// hasNext() : 리턴 boolean
// next() : 리턴 E
// remove() : 리턴 void
public class TestSet {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("I love java~");
		s.add("자바");
		s.add("C++");
		s.add("자바");
		
		int size = s.size();
		System.out.println(size);

		Iterator<String> i = s.iterator();
		while(i.hasNext())
			System.out.println(i.next());

		s.remove("C++");
		System.out.println("=================");
		i = s.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
	}
}
