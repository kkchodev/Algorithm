package doitAlgorithm.chap02_01;

public class A01_IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a =new int[5]; //�迭�� ���� 
		
		a[1]=37; //�迭 a[1]�� 37 ����
		a[2]=51; //           51 ����
		a[4]=a[1]*2; // a[4]�� 37*2=74 ���� 
		
		for(int i=0; i<a.length; i++)// �� ��ҵ��� ���� ��Ÿ��
			System.out.println("a[" + i + "]=" + a[i]);
		//�迭 1,2,4���� ���� ���������� �迭 0�� 3�� ���� 0 
	}

}
