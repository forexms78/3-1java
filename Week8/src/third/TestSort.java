package third;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class TestSort {
	// 중간 처리 기능 : 정렬(sorted())
	public static void main(String[] args) {
		IntStream ist = Arrays.stream(new int[] {100, 91, 89, 95, 87});

		//ist.sorted().forEach(n -> System.out.println(n));
		
		List<Fruit> fruits = Arrays.asList(
				new Fruit("apple", 20000), 
				new Fruit("kiwi", 17000),
				new Fruit("banana", 11000), 
				new Fruit("watermelon", 25000)				
		);
		//fruits.stream().mapToInt(Fruit::getPrice).forEach(System.out::println);
		
		
		// 오름차순 정렬
		//fruits.stream().sorted().forEach(p -> System.out.print(p.getName()+" "));
		//fruits.stream().sorted(Comparator.naturalOrder()).forEach(p -> System.out.print(p.getName()+" "));
		fruits.stream().sorted((x,y) -> x.compareTo(y)).forEach(p -> System.out.print(p.getName()+" "));	
		
		// 내림차순 정렬
		//fruits.stream().sorted(Comparator.reverseOrder()).forEach(p -> System.out.print(p.getName()+" "));
		//fruits.stream().sorted((x,y) -> y.compareTo(x)).forEach(p -> System.out.print(p.getName()+" "));	
	}
}