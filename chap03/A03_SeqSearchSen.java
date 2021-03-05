package DoItAlgorithm.chap03;

import java.util.Scanner;

//선형 검색(보초법)

class A03_SeqSearchSen {

	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0; 
		
		a[n]=key; //보초를 추가 
		
		while(true) {
			if(a[i]==key) // 검색 성공 
				break; 
			i++ ; 
		}
		return i ==n ? -1: i; 
		// 변수 i값이 n이면 찾은 값이 보초이므로 검색 실패를 나타내는 -1 반환
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
		
		int idx = seqSearchSen(x,num,ky); // 배열 x 에서 키값이 ky인 요소를 검색
		
		if(idx==-1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x[" +idx+"]에 있습니다.");
	}

}

