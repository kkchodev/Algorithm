package doitAlgorithm.chap01;

import java.util.Scanner;

public class A01_Max3 {
//3���� �������� �Է��ϰ� �ִ밪 ���ϱ� 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ밪�� ���մϴ�.");
		System.out.println("a�� �� :"); 
		int a = stdIn.nextInt();
		System.out.println("b�� �� :"); 		
		int b = stdIn.nextInt();
		System.out.println("c�� �� :"); 		
		int c = stdIn.nextInt(); 
		int max = a; // max�� a�� ����
		if(b>max) max=b; // ���� b�� max������ ũ�� max�� b ����
		if(c>max) max=c;
		
		System.out.println("�ִ��� " + max +"�Դϴ�.");
		
	}

}
