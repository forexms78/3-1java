package third;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		tm.put(90, "��ű�");
		tm.put(100, "�ڽű�");
		tm.put(71, "�ֽű�");
		tm.put(97, "�̽ű�");
		tm.put(81, "��ű�");
		
		Map.Entry<Integer, String> et = null;
		
		while(!tm.isEmpty()) {
		//	et = tm.firstEntry();
		//	et = tm.pollFirstEntry();
		//	et = tm.pollLastEntry();
			et = tm.lastEntry();
		System.out.println(et.getKey());	
		}

	}

}
