package fourth;

import java.util.function.IntSupplier;

public class TestSupplier {
	// ǥ�� �Լ��� �������̽� Supplier
	public static void main(String[] args) {
		// �Ű����� X, ���� O
		IntSupplier dice = () -> {
			int result = (int)(Math.random()*6)+1;
			return result;
		};

		System.out.println(dice.getAsInt()); // �ֻ��� ���
	}
}