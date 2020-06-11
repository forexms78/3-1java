package second;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestP2 {
	// collect() : ��Ʈ������ ������Ʈ���� ���͸� �Ǵ� ������ �� �ش� ������Ʈ���� �����ϴ� ���� ó�� �޼���
	//             �ʿ��� ������Ʈ�鸸 �÷������� ���� �� �ִ�. ���� ������Ʈ���� �׷����� �� ���� �� �� �ִ�.
	public static void main(String[] args) {
		List<Fruit> fruits = Arrays.asList(
				new Fruit("apple", 20000), 
				new Fruit("kiwi", 17000),
				new Fruit("banana", 11000), 
				new Fruit("watermelon", 25000)				
		);
		
		List<Fruit> ExpensiveList = fruits.stream()
				.filter(f -> f.getPrice() >= 20000)
				.collect(Collectors.toList()); // ���� ����
		ExpensiveList.stream().forEach(f -> System.out.println(f.getName()));
		
		List<Fruit> CheapList = fruits.stream()
				.filter(f -> f.getPrice() < 20000)
				.collect(Collectors.toList()); // ���� ����
		CheapList.stream().forEach(f -> System.out.println(f.getName()));
		
		List<Fruit> I7000List = fruits.stream()
				.filter(f -> f.getPrice() == 17000)
				.collect(Collectors.toList());
		I7000List.stream().forEach(f -> System.out.println(f.getName()));
	}
}