package second;

import java.util.Arrays;
import java.util.List;

public class TestFilter {
	// �߰� ó�� ��� : ���͸� (distinct(), filter())
	// distinct()  �Ű����� ����, �ߺ� ����
	
	// Predicate : �Ű����� ���� �ְ� ���ϰ��� T/F (�Ű����� Predicate Boolean����)
	// filter(Predicate)  ���� ���͸�
	// filter(IntPredicate)
	// filter(LongPredicate)
	// filter(DoublePredicate)
	public static void main(String[] args) {
		List<String> city = Arrays.asList(
				"����", "�λ�", "����", "�뱸", "����", "�λ�", "����", "�뱸", "����", "���");
		
		//city.stream().distinct().forEach(c -> System.out.println(c));
		//city.parallelStream().filter(c -> c.startsWith("��")).forEach(c -> System.out.println(c));
		city.parallelStream().distinct().filter(c -> c.startsWith("��")).forEach(c -> System.out.println(c));
	}
}