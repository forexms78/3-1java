package third;

public class TestMethod {
	static class Tests{
		public static <T> void showArray(T[] k) {
			for(T t : k)
				System.out.println(t + "");
			System.out.println();
		}
		public static <T> T getLast(T[] k) {
			return k[k.length-1];
		}
	}
	public static void main(String[] args) {
		Integer[] ik = {1, 3, 5, 6, 99};
		String[] sk = {"java", "python"};
				Tests.showArray(sk);
				
		
//		System.out.println(Tests.get
//				Last(ik));

		
	}

}
