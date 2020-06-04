package fourth;

import java.util.Arrays;
import java.util.List;

import second.Fruit;

public class TestMidFinal {
	// 3) 중간처리(filtering, sorting, mapping), 최종처리(합계, 평균, 세기) 가능
	public static void main(String[] args) {
		List<Fruit> fruits = Arrays.asList(
				new Fruit("apple", 20000), 
				new Fruit("kiwi", 17000),
				new Fruit("banana", 11000), 
				new Fruit("watermelon", 25000)				
		);
		
		int total = fruits.parallelStream().mapToInt(Fruit::getPrice).sum();
		double avg = fruits.stream().mapToInt(Fruit::getPrice).average().getAsDouble();
		System.out.println("총 합계 : " + total);
		System.out.println("과일 금액 평균 : " + avg);
	}
}