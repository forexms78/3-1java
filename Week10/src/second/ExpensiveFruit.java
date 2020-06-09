package second;

import java.util.ArrayList;
import java.util.List;
// Custom Container
public class ExpensiveFruit {
	// 엘리먼트를 저장할 컬렉션
	private List<Fruit> fruits;
	
	// 생성자
	public ExpensiveFruit(){
		fruits = new ArrayList<Fruit>();
		System.out.println("##" + Thread.currentThread().getName() + "## ExpensiveFruit()");
	}
	
	// 엘리먼트를 수집하는 메서드
	public void accumulate(Fruit f) {
		fruits.add(f);
		System.out.println("##" + Thread.currentThread().getName() + "## accumulate()");		
	}
	
	// 2개의 ExpensiveFruit를 결합하는 메서드
	// combine 메서드는 병렬처리시에만 동작
	public void combine(ExpensiveFruit ef) {
		fruits.addAll(ef.getList());
		System.out.println("##" + Thread.currentThread().getName() + "## combine()");	
	}
	
	// 엘리먼트가 저장된 컬렉션을 리턴(getter 메서드)
	public List<Fruit> getList(){
		return fruits;
	}
}
