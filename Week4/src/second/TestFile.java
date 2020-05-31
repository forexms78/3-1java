package second;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws IOException {
		
		try {
		FileOutputStream o = new FileOutputStream("ex.txt");
		String s = "java programming";
		byte[] bytes = s.getBytes();
		o.write(bytes);
		o.close();
		}catch(IOException e) {
			System.out.println("입출력 예외가 발생했습니다.");
		}
	}
}
