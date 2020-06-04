package third;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestParallel {
	// 2) 병렬처리가 쉽다!
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple","kiwi","banana","watermelon");
		
		//Stream<String> st = fruits.stream();
		//st.forEach(fruit -> TestParallel.print(fruit));
		Stream<String> st = fruits.parallelStream();
		st.forEach(TestParallel::print);

	}
	public static void print(String f) {
			System.out.println(f + " : " + Thread.currentThread().getName());
		}
}


