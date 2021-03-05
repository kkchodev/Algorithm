package DoItAlgorithm.chap02_01;

import java.util.Scanner;

class A06_ReverseArray {
	 // �迭 ��� a[idx]�� a[idx2] ���� �ٲ۴�. 
	static void swap(int[] a, int idx1, int idx2) {
		int t =a[idx1]; a[idx1]=a[idx2]; a[idx2]=t; 
	}
	// �迭 a�� ��Ҹ� �������� ���� 
	static void reverse(int[] a) {
		for(int i=0; i <a.length/2; i++)
			swap(a, i, a.length-i-1); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��ڼ�: ");
		int num = scan.nextInt(); // �̰� ��ڼ�
		
		int[] x = new int[num]; // ��ڼ��� num�� �迭 
		
		for(int i=0; i<num; i++) {
			System.out.println("x["+i+"] : ");
			x[i] = scan.nextInt();
		}
		reverse(x); // �迭 a�� ��Ҹ� �������� ���� 
		
		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		for(int i=0; i<num; i++)
			System.out.println("x[" +i +"]= " + x[i]);
	}
}


