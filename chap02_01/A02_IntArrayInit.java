package DoItAlgorithm.chap02_01;

public class A02_IntArrayInit {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5}; // 배열 초기자에 의해 생성 
		// new 연산자를 사용하여 좀 더 명확하게 선언할 수 있다. 
		for(int i=0; i<a.length; i++)
			System.out.println("a["+ i +"] =" +a[i]);
	}

}
