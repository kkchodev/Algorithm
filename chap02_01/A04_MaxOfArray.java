package doitAlgorithm.chap02_01;
//배열 요소의 최댓값을 나타냅니다.(값을 입력 받음)

import java.util.Scanner;

class A04_MaxOfArray {
	// 배열 a의 최대값을 구하여 반환합니다. 
	 
	static int maxOf(int[] a) { //배열의 최댓값을 구하는 메서드 
		int max = a[0]; 
		for(int i=1; i <a.length; i++)
			if( a[i] > max)
				max = a[i]; 
				return max; 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다. ");
		System.out.println("사람 수 : ");
		int num = scan.nextInt(); // 배열의 요솟수를 입력받음
		
		int[] height = new int[num]; //요솟수가 num 인 배열을 생성
		
		for(int i = 0; i<num; i++) {
			System.out.println("height["+i+"]:");
			height[i]=scan.nextInt();
		}
		System.out.println("최댓값은 "+ maxOf(height) + "입니다."); // 배열 최댓값을 구하기 위한 메서드 호출 
	}
}
