package doitAlgorithm.chap02_01;

public class A01_IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a =new int[5]; //배열의 선언 
		
		a[1]=37; //배열 a[1]에 37 대입
		a[2]=51; //           51 대입
		a[4]=a[1]*2; // a[4]에 37*2=74 대입 
		
		for(int i=0; i<a.length; i++)// 각 요소들의 값을 나타냄
			System.out.println("a[" + i + "]=" + a[i]);
		//배열 1,2,4에만 수를 대입했으니 배열 0과 3은 값이 0 
	}

}
