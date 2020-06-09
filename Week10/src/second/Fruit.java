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
		// price < o.price 이면 음수 리턴
		// price == o.price 이면 0 리턴
		// price > o.price 이면 양수 리턴
		
		// 양수가 리턴되면 2 객체를 교환
		// 음수나 0이 리턴되면 그대로 둔다
	}	
}
