package doitAlgorithm.chap01;

import java.util.Scanner;

public class C02_Digits {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int no; 
		
		System.out.println("2�ڸ��� ������ �Է��ϼ���");
		
		do {
			System.out.println("�Է�: ");
			no = stdIn.nextInt(); 
		}while(no<10||no>99); // or (��� �ϳ��� true�� true) 
		// !(no>=10 && no<=99) ǥ���� ����. ��𸣰��� ��Ģ 
			System.out.println("���� no�� ���� " + no +"�� �Ǿ����ϴ�.");
		}

	}
	

