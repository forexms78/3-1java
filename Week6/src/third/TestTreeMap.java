package third;

import java.util.Map;
import java.util.TreeMap;

// TreeMap
// TreeMap<key, value> tm = new TreeMap<key, value>();

//return은 Map.Entry<K, V>
//firstEntry() 제일 낮은 Map.Entry를 리턴
//lastEntry() 제일 높은 Map.Entry를 리턴
//lowerEntry(K ky) 주어진 키보다 바로 아래 Map.Entry 객체를 리턴
//higherEntry(K ky) 주어진 키보다 바로 위 Map.Entry 객체를 리턴
//floorEntry(K ky) 주어진 키와 동등한 키가 있으면 해당 ME객체를 리턴, 없으면 주어진 키 바로 아래의 ME객체를 리턴
//ceilEntry(K ky) 주어진 키와 동등한 키가 있으면 해당 ME객체를 리턴, 없으면 주어진 키 바로 위의 ME객체를 리턴
//pollFirstEntry() 제일 낮은 ME객체를 꺼내오고 컬렉션에서 제거
//pollLastEntry() 제일 높은 ME객체를 꺼내오고 컬렉션에서 제거

public class TestTreeMap   {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		tm.put(new Integer(90), "김신구");
		tm.put(100, "박신구");
		tm.put(71, "최신구");
		tm.put(97, "이신구");
		tm.put(81, "고신구");
		
		Map.Entry<Integer, String> et = null;
		
		et = tm.firstEntry();
		//System.out.println(et.getKey() + " : " + et.getValue());
		
		et = tm.lastEntry();
		//System.out.println(et.getKey() + " : " + et.getValue());
		
		et = tm.lowerEntry(97); // 97보다 아래 점수
		//System.out.println(et.getKey() + " : " + et.getValue());
		
		et = tm.higherEntry(96); // 96보다 위 점수
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