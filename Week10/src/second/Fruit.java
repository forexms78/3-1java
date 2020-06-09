package second;

public class Fruit implements Comparable<Fruit> {
	private String name;
	private int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;		
	}
	public int getPrice() {
		return price;		
	}

	@Override
	public int compareTo(Fruit o) {
		return Integer.compare(price, o.price);
		// price < o.price �̸� ���� ����
		// price == o.price �̸� 0 ����
		// price > o.price �̸� ��� ����
		
		// ����� ���ϵǸ� 2 ��ü�� ��ȯ
		// ������ 0�� ���ϵǸ� �״�� �д�
	}	
}
