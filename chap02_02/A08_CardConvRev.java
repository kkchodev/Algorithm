package doitAlgorithm.chap02_02;

import java.util.Scanner;

// �Է� ���� 10������ 2����~36������ ��� ��ȯ�Ͽ� ��Ÿ�� 

class A08_CardConvRev {
	//������ x�� r ������ ��ȯ�Ͽ� �迭 d �� �Ʒ��ڸ����� �־�ΰ� �ڸ��� ��ȯ 
	static int cardConvR(int x, int r, char[] d) {
 		int digits =0; //��ȯ ���� �ڸ���
		String dchar =" 0123456789ABCDEFGHIKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r); // r�� ���� ������ ����
			x /= r; 
		}while (x != 0); // r�� ���� �������� 0�� �� ������ �迭 d�� ����  
		return digits;
		}
	
// �̴�� �θ� ���ڰ� �������� ��ġ�� �Ǿ� ������ �ٽ� ���������?
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int no; // ��ȯ�ϴ� ����
		int cd; // ��� 
		int dno; // ��ȯ ��  �ڸ���
		int retry; // �ٽ� �� ��? 
		char[] cno = new char[32]; // ��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ������ �迭
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.println("��ȯ�ϴ� ���� �ƴ� ����: ");
				no = stdIn.nextInt();
			} while(no<0);
			
			do {
				System.out.println("� ������ ��ȯ�ұ��?(2~36): ");
				cd = stdIn.nextInt();
			} while(cd<2 || cd>36); 
			
			dno =cardConvR(no, cd, cno); // no�� cd������ ��ȯ 
			
			System.out.print(cd +" �����δ� ");
			for(int i = dno-1; i>=0; i--)// ���ڸ����� ���ʷ� ä���� 
			System.out.print(cno[i]);//cno���� �迭 
			System.out.print(" �Դϴ�.");
			
			System.out.println(" �ѹ� �� �ұ��? (1.�� 2.�ƴϿ�)");
			retry=stdIn.nextInt();
		}while (retry==1);
			
		}
	}

	
