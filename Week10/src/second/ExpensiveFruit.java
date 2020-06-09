package second;

import java.util.ArrayList;
import java.util.List;
// Custom Container
public class ExpensiveFruit {
	// ������Ʈ�� ������ �÷���
	private List<Fruit> fruits;
	
	// ������
	public ExpensiveFruit(){
		fruits = new ArrayList<Fruit>();
		System.out.println("##" + Thread.currentThread().getName() + "## ExpensiveFruit()");
	}
	
	// ������Ʈ�� �����ϴ� �޼���
	public void accumulate(Fruit f) {
		fruits.add(f);
		System.out.println("##" + Thread.currentThread().getName() + "## accumulate()");		
	}
	
	// 2���� ExpensiveFruit�� �����ϴ� �޼���
	// combine �޼���� ����ó���ÿ��� ����
	public void combine(ExpensiveFruit ef) {
		fruits.addAll(ef.getList());
		System.out.println("##" + Thread.currentThread().getName() + "## combine()");	
	}
	
	// ������Ʈ�� ����� �÷����� ����(getter �޼���)
	public List<Fruit> getList(){
		return fruits;
	}
}
