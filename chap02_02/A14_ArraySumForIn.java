package DoItAlgorithm.chap02_02;

//배열의 모든 요소의 합을 구하여 출력함(확장for문)

class A14_ArraySumForIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0}; 
		
		for (int i=0; i<a.length; i++)
			System.out.println("a["+ i + "]=" + a[i]);
		
		double sum=0; // 합계 
		
		for (double i:a)
			sum += i; 
		System.out.println("모든 요소의 합은 "+ sum +"입니다.");
	}

}