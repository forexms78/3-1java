package third;

import java.util.Map;
import java.util.TreeMap;

// TreeMap
// TreeMap<key, value> tm = new TreeMap<key, value>();

//return�� Map.Entry<K, V>
//firstEntry() ���� ���� Map.Entry�� ����
//lastEntry() ���� ���� Map.Entry�� ����
//lowerEntry(K ky) �־��� Ű���� �ٷ� �Ʒ� Map.Entry ��ü�� ����
//higherEntry(K ky) �־��� Ű���� �ٷ� �� Map.Entry ��ü�� ����
//floorEntry(K ky) �־��� Ű�� ������ Ű�� ������ �ش� ME��ü�� ����, ������ �־��� Ű �ٷ� �Ʒ��� ME��ü�� ����
//ceilEntry(K ky) �־��� Ű�� ������ Ű�� ������ �ش� ME��ü�� ����, ������ �־��� Ű �ٷ� ���� ME��ü�� ����
//pollFirstEntry() ���� ���� ME��ü�� �������� �÷��ǿ��� ����
//pollLastEntry() ���� ���� ME��ü�� �������� �÷��ǿ��� ����

public class TestTreeMap   {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		tm.put(new Integer(90), "��ű�");
		tm.put(100, "�ڽű�");
		tm.put(71, "�ֽű�");
		tm.put(97, "�̽ű�");
		tm.put(81, "��ű�");
		
		Map.Entry<Integer, String> et = null;
		
		et = tm.firstEntry();
		//System.out.println(et.getKey() + " : " + et.getValue());
		
		et = tm.lastEntry();
		//System.out.println(et.getKey() + " : " + et.getValue());
		
		et = tm.lowerEntry(97); // 97���� �Ʒ� ����
		//System.out.println(et.getKey() + " : " + et.getValue());
		
		et = tm.higherEntry(96); // 96���� �� ����
		//System.out.println(et.getKey() + " : " + et.getValue());

		et = tm.floorEntry(81); // 81
		//System.out.println(et.getKey() + " : " + et.getValue());
		
		et = tm.ceilingEntry(89); // 89
		//System.out.println(et.getKey() + " : " + et.getValue());	
		
		while(!tm.isEmpty()) {
			et = tm.pollLastEntry();
			System.out.println(et);
			System.out.println(tm.size());
			//System.out.println(tm.values() + " : " + tm.keySet()  + "\n"+tm.size());
		}
	}
}