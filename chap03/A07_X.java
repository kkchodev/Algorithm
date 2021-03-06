package DoItAlgorithm.chap03;

import java.util.Comparator;

//클래스 X의 내부에서 comparator를 정의
public class A07_X {
	// 필드, 메서드 등
	public static final Comparator<T> COMPARATOR = new Comp();
	
	private static class Comp implements Comparator<T>{
		public int compare(T d1, T d2) {
			// d1>d2 이면 양의 값 반환
			// d1<d2 이면 음의 값 반환
			// d1=d2 이면 0 반환
		}
	}
}