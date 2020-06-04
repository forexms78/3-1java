package first;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestArrayStream {
	public static int hap;
	
	public static void main(String[] args) {
		// ������ ���� ��Ʈ�� ��ü ���� rangeClosed(���۰�, ����)
		IntStream ir = IntStream.rangeClosed(1, 10);
		ir.forEach(i -> hap = hap + i);
		System.out.println(hap);
		
		
		// �迭�� ���� ��Ʈ�� ��ü ����
		int[] numbers = {100, 99, 89, 95, 81};
		IntStream istr = Arrays.stream(numbers);
		istr.forEach(n -> System.out.println(n + " "));
		
		String[] texts = {"��", "��", "��", "��", "��"};
		Stream<String> sstr = Arrays.stream(texts);
		sstr.forEach(s -> System.out.println(s + " "));
	}
}