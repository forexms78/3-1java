package third;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		tm.put(90, "김신구");
		tm.put(100, "박신구");
		tm.put(71, "최신구");
		tm.put(97, "이신구");
		tm.put(81, "고신구");
		
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
