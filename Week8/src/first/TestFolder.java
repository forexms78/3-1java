package first;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestFolder {
	// 폴더로 부터 스트림 객체 생성
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("D:\\work_java");
		Stream<Path> sp = Files.list(p);
		sp.forEach(x -> System.out.println(x.getFileName()));
	}
}