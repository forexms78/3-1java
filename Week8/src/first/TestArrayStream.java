package first;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestArrayStream {
	public static int hap;
	
	public static void main(String[] args) {
		// 범위로 부터 스트림 객체 생성 rangeClosed(시작값, 끝값)
		IntStream ir = IntStream.rangeClosed(1, 10);
		ir.forEach(i -> hap = hap + i);
		System.out.println(hap);
		
		
		// 배열로 부터 스트림 객체 생성
		int[] numbers = {100, 99, 89, 95, 81};
		IntStream istr = Arrays.stream(numbers);
		istr.forEach(n -> System.out.println(n + " "));
		
		String[] texts = {"김", "이", "박", "최", "정"};
		Stream<String> sstr = Arrays.stream(texts);
		sstr.forEach(s -> System.out.println(s + " "));
	}
}