package DoItAlgorithm.chap01;

import java.util.Scanner;
// �Է��� �������� ������� �������� 0���� �Ǵ��մϴ�. 

public class A03_JudgeSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���: ");
		int n = stdIn.nextInt();
		
		if(n>0)
			System.out.println("�� ���� ����Դϴ�.");
		else if(n<0)
			System.out.println("�� ���� �����Դϴ�.");
		else
			System.out.println("�� ���� 0�Դϴ�.");
	}

}
