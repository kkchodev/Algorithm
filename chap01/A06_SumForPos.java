package doitAlgorithm.chap01;

import java.util.Scanner;
//1,2, ... n�� ���� ���մϴ�(����� �Է�)

public class A06_SumForPos {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1���� n������ ���� ���մϴ�");
		
		do { //do : ���� �Ǵ� �ݺ���(�ϴ� ���� ������ �� �� ������ ������ ��� �ݺ��� ������ �Ǵ�)
			System.out.println("n�� �� : ");
			n = stdIn.nextInt(); 
		} while (n<=0);  // n�� 0���� Ŭ ������ �ݺ�!
		
		int sum = 0; //��
		
		for(int i=1; i<=n; i++) 
			sum+=1; // sum�� 1���ذ���
		
		System.out.println("1���� "+ n +"������ ����" + sum +"�Դϴ�.");
		
	}
}
