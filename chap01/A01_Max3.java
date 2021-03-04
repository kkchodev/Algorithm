package doitAlgorithm.chap01;

import java.util.Scanner;

public class A01_Max3 {
//3개의 정수값을 입력하고 최대값 구하기 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최대값을 구합니다.");
		System.out.println("a의 값 :"); 
		int a = stdIn.nextInt();
		System.out.println("b의 값 :"); 		
		int b = stdIn.nextInt();
		System.out.println("c의 값 :"); 		
		int c = stdIn.nextInt(); 
		int max = a; // max에 a값 대입
		if(b>max) max=b; // 만약 b가 max값보다 크면 max에 b 대입
		if(c>max) max=c;
		
		System.out.println("최댓값은 " + max +"입니다.");
		
	}

}
