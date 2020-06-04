package second;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestLambdaStream {
	// 1) ���ٽ� �Ǵ� �޼��� ������ ���� ���� ó�� �ڵ带 �Ű������� ����
	public static void main(String[] args) {
		List<Fruit> fruits = Arrays.asList(
				new Fruit("apple",20000), 
				new Fruit("kiwi",17000),
				new Fruit("banana",11000), 
				new Fruit("watermelon",25000)				
		);

		Stream<Fruit> st = fruits.stream();
		st.forEach(fruit ->	{
			String n = fruit.getName();
			int p = fruit.getPrice();
			System.out.println(n + " : " + p + "��");
		});
		
	}
}


// 2) ����ó���� ����!













