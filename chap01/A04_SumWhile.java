package DoItAlgorithm.chap01;

import java.util.Scanner;

public class A04_SumWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1���� n���� ���� ���մϴ�.");
		System.out.println("n�� ��: ");
		int n = stdIn.nextInt(); 
		
		int sum = 0; //��
		int i = 1 ; 
		
		while(i<=n) { // i �� n ���ϸ� �ݺ��մϴ�.
			sum += i; // sum�� i�� ���մϴ�. 
			i++; // i ���� ��ŭ ������ŵ�ϴ�.	
		}
		System.out.println("1���� "+n+"������ ���� "+ sum );
	}
}
