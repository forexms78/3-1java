package second;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashMap, HashTable, LinkedHashMap, Properties, TreeMap 등..
// 추가 : V put(k, v) 주어진 키와 값을 추가, 저장 후 값(Value) 리턴
// 검색
// boolean containsKey(Object k)
// boolean containsValue(Object v)
// Set<Map.Entry<K, V>> entrySet()
// V get(Object k) 
// Set<K> keySet() 
// int size()
// Collection<V> values()
// 삭제
// void clear()
// V remove(Object k)
public class TestMap {
	public static void main(String[] args) {
		Map<String, String> fruits = new HashMap<String, String>();
		
		fruits.put("apple","사과");
		fruits.put("banana","바나나");
		fruits.put("watermelon","수박");
		fruits.put("kiwi","키위");
		fruits.put("banana","버내너");
		
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