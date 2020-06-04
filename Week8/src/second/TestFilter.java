package second;

import java.util.Arrays;
import java.util.List;

public class TestFilter {
	// 중간 처리 기능 : 필터링 (distinct(), filter())
	// distinct()  매개변수 없음, 중복 제거
	
	// Predicate : 매개변수 값도 있고 리턴값이 T/F (매개변수 Predicate Boolean리턴)
	// filter(Predicate)  조건 필터링
	// filter(IntPredicate)
	// filter(LongPredicate)
	// filter(DoublePredicate)
	public static void main(String[] args) {
		List<String> city = Arrays.asList(
				"서울", "부산", "광주", "대구", "대전", "부산", "서울", "대구", "서울", "경기");
		
		//city.stream().distinct().forEach(c -> System.out.println(c));
		//city.parallelStream().filter(c -> c.startsWith("대")).forEach(c -> System.out.println(c));
		city.parallelStream().distinct().filter(c -> c.startsWith("대")).forEach(c -> System.out.println(c));
	}
}