package fourth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
// 검색은 어레이 삽입삭제는 링크드 리스트
public class TestList {
	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		List<String> b = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int k =0; k<100000; k++)
			a.add(0, String.valueOf(k));
		endTime = System.nanoTime();
		System.out.println("ArrayList : " + (endTime - startTime));
		
		startTime = System.nanoTime();
		for(int k =0; k<100000; k++)
			b.add(0, String.valueOf(k));
		endTime = System.nanoTime();
		System.out.println("LinkedList : " + (endTime - startTime));
		
	}
}

//public class TestList {
//	public static void main(String[] args) {
//		List<String> b = new Vector<String>();
//		b.add("java");
//		b.add("python");
//		b.add("c++");
//		for(String s : b)
//			System.out.println(s);
//		
//	}
//}





//package fourth;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class TestList {
//	public static void main(String[] args) {
//		List<String> b = Arrays.asList("자바","파이썬","c++");
//		for(String s : b)
//			System.out.println(s);
//		
//	}
//}


//package fourth;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class TestList {
//	public static void main(String[] args) {
//		List<String> a = new ArrayList<String>();
//		
//		a.add("java");
//		a.add("python");
//		a.add("c++");
//		
////		int size = a.size();
////		System.out.println(size);		//3
////		System.out.println(a);			//[java, python, c++]
////		System.out.println(a.get(1));	//python
////		a.remove(1);
//		a.remove("java");
//		
//		for(int i=0; i<a.size();i++) {
//			System.out.println(a.get(i));
//		}
//		for(String s: a)			//포위치 구문
//			System.out.println(s);
//		
//	}
//
//}
