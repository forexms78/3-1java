package first;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
// Set Collection : �ߺ��� ��� x, �������� x
// HashSet, LinkedHashSet, TreeSet

// ��ü ���� : add() ������ boolean, �Ű����� E

// ��ü �˻� : isEmpty() ������ boolean
// ��ü �˻� : contains() ������ boolean
// ��ü �˻� : size() ������ int
// ��ü �˻� : iterator() ���� Iterator<E>
// ��ü ���� : clear() 
// ��ü ���� : remove() ���� boolean, �Ű������� O

// �ݺ���
// hasNext() : ���� boolean
// next() : ���� E
// remove() : ���� void
public class TestSet {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("I love java~");
		s.add("�ڹ�");
		s.add("C++");
		s.add("�ڹ�");
		
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
