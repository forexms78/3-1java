package second;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashMap, HashTable, LinkedHashMap, Properties, TreeMap ��..
// �߰� : V put(k, v) �־��� Ű�� ���� �߰�, ���� �� ��(Value) ����
// �˻�
// boolean containsKey(Object k)
// boolean containsValue(Object v)
// Set<Map.Entry<K, V>> entrySet()
// V get(Object k) 
// Set<K> keySet() 
// int size()
// Collection<V> values()
// ����
// void clear()
// V remove(Object k)
public class TestMap {
	public static void main(String[] args) {
		Map<String, String> fruits = new HashMap<String, String>();
		
		fruits.put("apple","���");
		fruits.put("banana","�ٳ���");
		fruits.put("watermelon","����");
		fruits.put("kiwi","Ű��");
		fruits.put("banana","������");
		
		System.out.println(fruits.size());
		System.out.println(fruits.get("watermelon"));
		
		Set<String> keySet = fruits.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			String v = fruits.get(k);
			System.out.println(k + " : " + v);
		}
		
		fruits.remove("kiwi");
		System.out.println(fruits.size());
	}
}