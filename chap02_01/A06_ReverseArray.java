package DoItAlgorithm.chap02_01;


import java.util.Scanner;

class A06_ReverseArray {
	 // 배열 요소 a[idx]와 a[idx2] 값을 바꾼다. 
	static void swap(int[] a, int idx1, int idx2) {
		int t =a[idx1]; a[idx1]=a[idx2]; a[idx2]=t; 
	}
	// 배열 a의 요소를 역순으로 정렬 
	static void reverse(int[] a) {
		for(int i=0; i <a.length/2; i++)
			swap(a, i, a.length-i-1); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("요솟수: ");
		int num = scan.nextInt(); // 이게 요솟수
		
		int[] x = new int[num]; // 요솟수가 num인 배열 
		
		for(int i=0; i<num; i++) {
			System.out.println("x["+i+"] : ");
			x[i] = scan.nextInt();
		}
		reverse(x); // 배열 a의 요소를 역순으로 정렬 
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i=0; i<num; i++)
			System.out.println("x[" +i +"]= " + x[i]);
	}
}

