package DoItAlgorithm.chap02_01;

import java.util.Random;
import java.util.Scanner;

class A05_MaxOfArrayRand {
// �迭 ����� �ִ��� ��Ÿ���ϴ�. ���� ������ ����
	
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++)
			if(a[i] >max)
				max=a[i];
		return max; 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ밪�� ���մϴ�. \n ����� ��: ");
		int num= scan.nextInt();// �迭�� ��ڼ��� �Է� ����
		
		int[] heigth = new int [num];
		
		System.out.println("Ű ���� �Ʒ��� �����ϴ�. ");
		for (int i=0; i<num; i++) {
			heigth[i] = 100 + rand.nextInt(90); // ��ڰ��� ������ ����
			System.out.println("heigth["+i + "]: " +heigth[i]);
		}
		System.out.println("�ִ��� " + maxOf(heigth)+"�Դϴ�.");
	}

}
