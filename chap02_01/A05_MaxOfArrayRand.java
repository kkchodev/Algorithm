package DoItAlgorithm.chap02_01;

import java.util.Random;
import java.util.Scanner;

class A05_MaxOfArrayRand {
// 배열 요소의 최댓값을 나타냅니다. 값을 난수로 생성
	
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++)
			if(a[i] >max)
				max=a[i];
		return max; 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다. \n 사람의 수: ");
		int num= scan.nextInt();// 배열의 요솟수를 입력 받음
		
		int[] heigth = new int [num];
		
		System.out.println("키 값은 아래와 같습니다. ");
		for (int i=0; i<num; i++) {
			heigth[i] = 100 + rand.nextInt(90); // 요솟값을 난수로 결정
			System.out.println("heigth["+i + "]: " +heigth[i]);
		}
		System.out.println("최댓값은 " + maxOf(heigth)+"입니다.");
	}

}