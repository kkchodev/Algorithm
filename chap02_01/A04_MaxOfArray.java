package doitAlgorithm.chap02_01;
//�迭 ����� �ִ��� ��Ÿ���ϴ�.(���� �Է� ����)

import java.util.Scanner;

class A04_MaxOfArray {
	// �迭 a�� �ִ밪�� ���Ͽ� ��ȯ�մϴ�. 
	 
	static int maxOf(int[] a) { //�迭�� �ִ��� ���ϴ� �޼��� 
		int max = a[0]; 
		for(int i=1; i <a.length; i++)
			if( a[i] > max)
				max = a[i]; 
				return max; 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ��� ���մϴ�. ");
		System.out.println("��� �� : ");
		int num = scan.nextInt(); // �迭�� ��ڼ��� �Է¹���
		
		int[] height = new int[num]; //��ڼ��� num �� �迭�� ����
		
		for(int i = 0; i<num; i++) {
			System.out.println("height["+i+"]:");
			height[i]=scan.nextInt();
		}
		System.out.println("�ִ��� "+ maxOf(height) + "�Դϴ�."); // �迭 �ִ��� ���ϱ� ���� �޼��� ȣ�� 
	}
}
