package third;

import java.util.Arrays;
import java.util.List;

public class TestMapping {
	// 중간 처리 기능 : 매핑(flatMapOOO(), MapOOO())
	// Function : 매개변수 값도 있고 리턴값도 있음  (매개변수 Function 리턴)
	public static void main(String[] args) {
		List<String> il = Arrays.asList("홍 길동", "고 길동");
		il.stream().flatMap(words -> Arrays.stream(words.split(" ")))
		.forEach(word -> System.out.println(word));
	}
}