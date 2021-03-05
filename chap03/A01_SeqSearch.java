package DoItAlgorithm.chap03;

import java.util.Scanner;

//선형 검색
class A01_SeqSearch {
//요소수가 n인 배열 a에서 key 와 같은 요소를 선형 검색합니다. 
	static int seqSearch(int[] a, int n, int key) {
		int i=0; 
		
		while(true) {
			if(i==n)
				return -1; // 검색 실패(-1 반환)
			if(a[i] == key)
				return i ; // 검색 성공(인덱스를 반환)
			i++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요소수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];  // 요소수가 num인 배열
		
		for (int i = 0 ; i< num; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("검색할 값 : "); // 키 값을 입력 
		int ky = stdIn.nextInt(); 
		
		int idx = seqSearch(x,num,ky); // 배열 x 에서 키값이 ky인 요소를 검색
		
		if(idx==-1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x[" +idx+"]에 있습니다.");
	}

}
