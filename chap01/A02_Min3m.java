package doitAlgorithm.chap01;

public class A02_Min3m {
//3���� ������ ��� �ִ��� ���Ͽ� ��� 
	// a,b,c�� �ִ��� ���Ͽ� ��ȯ�մϴ�. 
	static int max3(int a, int b, int c) {
		int max=a; 
		if(b>max) max =b; 
		if(c>max) max =c;
		
		return max; //���� �ִ��� ȣ���� ������ ��ȯ 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("max(3,2,1) = " + max3(3,2,1)); // [A] a>b>c
		System.out.println("max(3,2,2) = " + max3(3,2,2)); // [B] a>b=c
		System.out.println("max(3,2,3) = " + max3(3,2,3));
		System.out.println("max(2,1,3) = " + max3(2,1,3));
		System.out.println("max(3,3,2) = " + max3(3,3,2));
		System.out.println("max(1,2,3) = " + max3(1,2,3));
		System.out.println("max(2,3,3) = " + max3(2,3,3));
		System.out.println("max(10,2,5) = " + max3(10,2,5));
	//�ִ��� ���� �� �ݺ��ؼ� ���ϴ� ���, �޼���� ó���ϸ� ���ϴ� ! 
		
	}

}
