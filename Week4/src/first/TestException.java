package first;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

// Runtime Exception
// 일반(compile-time) Exception
public class TestException {
	public static void main(String[] args) {
		// 산술 예외
//		int n = 100;
//		int r =0;
//		try {
//		for(int k = 0; k<10; k++) {
//			r = n / (int)(Math.random()*10);
//			System.out.println(r);
//		}
//		}catch(ArithmeticException e) {
//			System.out.println("분모에 0이 올수 없습니다.");
//			System.out.println(e.getMessage());
//		}
//		System.out.println(Math.random());

//	인덱스 범위 예외
		double[] arr = {3.14,2.71};
		String s = "Just java programming~";
		StringTokenizer st = new StringTokenizer(s);

		try {
			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken() + " ");
			}
			
		System.out.println(arr[1]);
		System.out.println(5/0);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위를 벗어 났습니다.");
		}catch(NoSuchElementException e) {
			System.out.println("더 이상 꺼낼 요소가 없습니다.");
		}catch(ArithmeticException e) {
			System.out.println("분모에 0이 올수 없습니다.");
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println("익셉션 예외 보험용");
		}
		finally {
		}
			System.out.println("항상 실행!!");
		}
	}
