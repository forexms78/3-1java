package fourth;

import java.util.function.IntSupplier;

public class TestSupplier {
	// 표준 함수적 인터페이스 Supplier
	public static void main(String[] args) {
		// 매개변수 X, 리턴 O
		IntSupplier dice = () -> {
			int result = (int)(Math.random()*6)+1;
			return result;
		};

		System.out.println(dice.getAsInt()); // 주사위 출력
	}
}