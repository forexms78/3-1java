package second;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestP3 {
	public static void main(String[] args) {
		List<Fruit> fruits = Arrays.asList(
				new Fruit("strawberry", 30000), 
				new Fruit("blueberry", 15000),				
				new Fruit("apple", 20000), 
				new Fruit("kiwi", 17000),
				new Fruit("banana", 11000), 
				new Fruit("watermelon", 25000)				
		);

		ExpensiveFruit expensiveFruit = fruits.stream()
		.filter(f -> f.getPrice() >= 20000)
		.collect(ExpensiveFruit:: new, ExpensiveFruit:: accumulate, ExpensiveFruit:: combine);		
		expensiveFruit.getList().forEach(f -> System.out.println(f.getName()));	
		
		System.out.println("==============================");
		
		ExpensiveFruit expensiveFruit1 = fruits.parallelStream()
				.filter(f -> f.getPrice() >= 20000)
				.collect(ExpensiveFruit:: new, ExpensiveFruit:: accumulate, ExpensiveFruit:: combine);		
				expensiveFruit1.getList().forEach(f -> System.out.println(f.getName()));	
		
//		ExpensiveFruit expensiveFruit = fruits.parallelStream()
//		.filter(f -> f.getPrice() >= 20000)
//		//.collect(ExpensiveFruit:: new, ExpensiveFruit:: accumulate, ExpensiveFruit:: combine);		
//		.collect(()-> new ExpensiveFruit(), (a, b)-> a.accumulate(b), ExpensiveFruit:: combine);
//		expensiveFruit.getList().forEach(f -> System.out.println(f.getName()));		
//		
//		List<Fruit> I7000List = fruits.stream()
//				.filter(f -> f.getPrice() == 17000)
//				.collect(Collectors.toList());
//		I7000List.stream().forEach(f -> System.out.println(f.getName()));
		
	}
}