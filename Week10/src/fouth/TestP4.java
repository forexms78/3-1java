package fouth;

import java.util.Arrays;
import java.util.List;

public class TestP4 {
	// Performance of Parallel Operation
	// 1) ������Ʈ�� ���� ������Ʈ�� ó�� �ð� : ����ó���� ��� ������Ǯ�� �����ϰ� �����带 �����ϴ� �߰����� ����� �߻��Ѵ�.
	// 2) ��Ʈ�� �ҽ��� ���� : ����ó���� ��� �迭�̳� ArrayList�� �ƴ� LinkedList �Ǵ� Set �迭�� ��Ʈ�� �ҽ��� ��� ��������� ó���ӵ��� �ʴ�.
	// 3) Core�� ���� : CPU�� �̱��ھ� �� ��� ��Ʈ�� ����ó���� ������. ����ó���� �ϰ� �Ǹ� �������� ���� �����ϰ� ���ü� �۾����� ó���Ǳ� ������ �ӵ��� �ʴ�.
	
	// ó��
	public static void work(int v) {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	// ����
	public static long timeParallel(List<Integer> p) {
		long start = System.nanoTime();
		p.stream().parallel().forEach((a)->work(a));
		long end = System.nanoTime();
		return end - start;
	}
	// ����
	public static long timeSequencial(List<Integer> p) {
		long start = System.nanoTime();
		p.stream().forEach((a)->work(a));
		long end = System.nanoTime();
		return end - start;		
	}
	public static void main(String[] args) {
		List<Integer> src = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		
		long timeS = timeSequencial(src);
		long timeP = timeParallel(src);
		
		System.out.println("����ó�� : " + timeS);
		System.out.println("����ó�� : " + timeP);
	}
}