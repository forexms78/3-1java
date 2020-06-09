package fouth;

import java.util.Arrays;
import java.util.List;

public class TestP4 {
	// Performance of Parallel Operation
	// 1) 엘리먼트의 수와 엘리먼트당 처리 시간 : 병렬처리의 경우 스레드풀을 생성하고 스레드를 생성하는 추가적인 비용이 발생한다.
	// 2) 스트림 소스의 종류 : 병렬처리의 경우 배열이나 ArrayList가 아닌 LinkedList 또는 Set 계열의 스트림 소스일 경우 상대적으로 처리속도가 늦다.
	// 3) Core의 갯수 : CPU가 싱글코어 일 경우 스트림 순차처리가 빠르다. 병렬처리를 하게 되면 스레드의 수만 증가하고 동시성 작업으로 처리되기 때문에 속도가 늦다.
	
	// 처리
	public static void work(int v) {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	// 병렬
	public static long timeParallel(List<Integer> p) {
		long start = System.nanoTime();
		p.stream().parallel().forEach((a)->work(a));
		long end = System.nanoTime();
		return end - start;
	}
	// 순차
	public static long timeSequencial(List<Integer> p) {
		long start = System.nanoTime();
		p.stream().forEach((a)->work(a));
		long end = System.nanoTime();
		return end - start;		
	}
	public static void main(String[] args) {
		List<Integer> src = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		
		long timeS = timeSequencial(src);
		long timeP = timeParallel(src);
		
		System.out.println("순차처리 : " + timeS);
		System.out.println("병렬처리 : " + timeP);
	}
}