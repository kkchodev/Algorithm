package doitAlgorithm.chap01;

import java.util.Scanner;

// 1,2,3...n�� ���� ���մϴ�. 
public class A05_SumFor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.println("n�� ��: ");
		int n = stdIn.nextInt();
		
		int sum = 0; //��
		for(int i=1; i<=n; i++)
			sum+= i; // sum�� i�� ���Ѵ�
		System.out.println("1���� "+n+"������ ����" + sum);
	} 

}
