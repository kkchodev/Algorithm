package DoItAlgorithm.chap02_02;
//1000 ������ �Ҽ��� ���� (ver1) 
public class A09_PrimeNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0; 
		
		for(int n =2; n <= 1000; n++) {
			int i;
			for(i=2; i<n; i++) {
				counter++;
				if( n % i==0) // ������ �������� �Ҽ��� �ƴ�
					break; // �׷��ϱ� �� �̻��� �ݺ��� ���ʿ�
			}
			if(n==i) // ���������� ������ �������� ���� 
				System.out.println(n);
		}
		System.out.println("�������� ������ Ƚ�� "  + counter );
	}

}
