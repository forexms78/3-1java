package third;

import java.util.Arrays;
import java.util.List;

public class TestMapping {
	// �߰� ó�� ��� : ����(flatMapOOO(), MapOOO())
	// Function : �Ű����� ���� �ְ� ���ϰ��� ����  (�Ű����� Function ����)
	public static void main(String[] args) {
		List<String> il = Arrays.asList("ȫ �浿", "�� �浿");
		il.stream().flatMap(words -> Arrays.stream(words.split(" ")))
		.forEach(word -> System.out.println(word));
	}
}