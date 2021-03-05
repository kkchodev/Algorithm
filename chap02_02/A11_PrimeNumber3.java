package DoItAlgorithm.chap02_02;
// 1000 ������ �Ҽ��� ���� (ver3)
public class A11_PrimeNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0; // ������ �������� ȸ��
		int ptr=0; // ã�� �Ҽ��� ���� 
		int[] prime = new int[500]; // �Ҽ��� �����ϴ� �迭 
		
		prime[ptr++] = 2; // 2�� �Ҽ���
		prime[ptr++] = 3; // 3�� �Ҽ���
		
		for(int n =5; n<=1000; n+=2) { // ����� Ȧ����
			boolean flag = false; 
			for(int i = 1; prime[i]*prime[i]<=n; i++) {
				counter +=2; 
				if(n % prime[i]==0) { //������ �������� �Ҽ��� �ƴ� 
					flag=true;
					break; // ���̻� �ݺ��� ���ʿ�
				}
			}
				if(!flag) {
					prime[ptr++] = n;
					counter ++;
				}
			}
		for(int i=0; i<ptr; i++) // ã�� ptr ���� �Ҽ��� ���
			System.out.println(prime[i]);
		
		System.out.println("������ �������� ������ Ƚ��: "+ counter);
		}
	}


