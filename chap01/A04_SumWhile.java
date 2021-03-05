package DoItAlgorithm.chap01;

import java.util.Scanner;

public class A04_SumWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터 n까지 합을 구합니다.");
		System.out.println("n의 값: ");
		int n = stdIn.nextInt(); 
		
		int sum = 0; //합
		int i = 1 ; 
		
		while(i<=n) { // i 가 n 이하면 반복합니다.
			sum += i; // sum에 i를 더합니다. 
			i++; // i 값을 만큼 증가시킵니다.	
		}
		System.out.println("1부터 "+n+"까지의 합은 "+ sum );
	}
}
