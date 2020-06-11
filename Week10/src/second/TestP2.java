package second;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestP2 {
	// collect() : 스트림에서 엘리먼트들을 필터링 또는 매핑한 후 해당 엘리먼트들을 수집하는 최종 처리 메서드
	//             필요한 엘리먼트들만 컬렉션으로 담을 수 있다. 또한 엘리먼트들을 그룹핑한 후 집계 할 수 있다.
	public static void main(String[] args) {
		List<Fruit> fruits = Arrays.asList(
				new Fruit("apple", 20000), 
				new Fruit("kiwi", 17000),
				new Fruit("banana", 11000), 
				new Fruit("watermelon", 25000)				
		);
		
		List<Fruit> ExpensiveList = fruits.stream()
				.filter(f -> f.getPrice() >= 20000)
				.collect(Collectors.toList()); // 최종 집계
		ExpensiveList.stream().forEach(f -> System.out.println(f.getName()));
		
		List<Fruit> CheapList = fruits.stream()
				.filter(f -> f.getPrice() < 20000)
				.collect(Collectors.toList()); // 최종 집계
		CheapList.stream().forEach(f -> System.out.println(f.getName()));
		
		List<Fruit> I7000List = fruits.stream()
				.filter(f -> f.getPrice() == 17000)
				.collect(Collectors.toList());
		I7000List.stream().forEach(f -> System.out.println(f.getName()));
	}
}