package doitAlgorithm.chap02_01;
//�迭�� �����մϴ�.
public class A03_CloneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a= {1,2,3,4,5};
		int[]b = a.clone(); // b�� a�� ������ ���� 
		
		b[3]=0; // �� ��ҿ��� 0�� ����
		
		System.out.println("a = ");
		for(int i=0; i<a.length; i++)
			System.out.print(" " + a[i]);
		
		System.out.println("\nb =");
		for(int i=0; i<b.length; i++)
			System.out.print(" " + b[i]);
		
	}

}
