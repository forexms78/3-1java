package fourth;

import java.util.Arrays;

public class TestFinal {
	// 집계 메서드 : sum, average, max, min, count, findFirst
	public static void main(String[] args) {
		int min = Arrays.stream(new int[] {9, 22, 7, 71, 16})
				.filter(n -> n%2 == 1)
				.min().getAsInt();
		System.out.println(min);
		
		long cnt = Arrays.stream(new int[] {9, 22, 7, 71, 16})
				.filter(n -> n%2 == 1)
				.count();
		System.out.println(cnt);
		
		int f = Arrays.stream(new int[] {9, 22, 7, 71, 16})
				.filter(n -> n%2 == 1)
				.findFirst().getAsInt();
		System.out.println(f);				
	}
}