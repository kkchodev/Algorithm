package doitAlgorithm.chap01;

import java.util.Scanner;

// 1,2,3...n의 합을 구합니다. 
public class A05_SumFor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값: ");
		int n = stdIn.nextInt();
		
		int sum = 0; //합
		for(int i=1; i<=n; i++)
			sum+= i; // sum에 i를 더한다
		System.out.println("1부터 "+n+"까지의 합은" + sum);
	} 

}
