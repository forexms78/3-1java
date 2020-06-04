package fourth;

import java.util.Arrays;
import java.util.List;

import second.Fruit;

public class TestMidFinal {
	// 3) �߰�ó��(filtering, sorting, mapping), ����ó��(�հ�, ���, ����) ����
	public static void main(String[] args) {
		List<Fruit> fruits = Arrays.asList(
				new Fruit("apple", 20000), 
				new Fruit("kiwi", 17000),
				new Fruit("banana", 11000), 
				new Fruit("watermelon", 25000)				
		);
		
		int total = fruits.parallelStream().mapToInt(Fruit::getPrice).sum();
		double avg = fruits.stream().mapToInt(Fruit::getPrice).average().getAsDouble();
		System.out.println("�� �հ� : " + total);
		System.out.println("���� �ݾ� ��� : " + avg);
	}
}