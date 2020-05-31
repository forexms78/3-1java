package third;
import java.util.ArrayList;
import java.util.List;

public class third {
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<Integer>();
		box1.set(77); //boxing
		System.out.println(box1.get());	// unboxing
		
		Box<String> box2 = new Box<String>();
		box2.set("ÀÚ¹Ù"); // boxing
		System.out.println(box2.get());  //unboxing
		
		
		
//		List a = new ArrayList();
//		List<String> b = new ArrayList<String>();
//	
//		a.add("test");
//		a.add(55);
//		String sa = a.get(0);
//		
//		b.add("test");
//		String sb = b.get(0);
	}

}
