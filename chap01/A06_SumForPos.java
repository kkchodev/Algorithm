package doitAlgorithm.chap01;

import java.util.Scanner;
//1,2, ... n의 합을 구합니다(양수만 입력)

public class A06_SumForPos {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다");
		
		do { //do : 사후 판단 반복문(일단 루프 본문을 한 번 실행한 다음에 계속 반복할 것인지 판단)
			System.out.println("n의 값 : ");
			n = stdIn.nextInt(); 
		} while (n<=0);  // n이 0보다 클 때까지 반복!
		
		int sum = 0; //합
		
		for(int i=1; i<=n; i++) 
			sum+=1; // sum에 1더해가기
		
		System.out.println("1부터 "+ n +"까지의 합은" + sum +"입니다.");
		
	}
}
