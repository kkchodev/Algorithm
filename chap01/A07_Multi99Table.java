package DoItAlgorithm.chap01;

//����ǥ�� ����մϴ�. 

public class A07_Multi99Table {

	public static void main(String[] args) {

		
		System.out.println("����ǥ");
		
		for(int i=1; i<=9; i++) { //�ٱ� for: ���� i ���� 1���� 9���� ����.. ����(��) ���� �ݺ�
			for(int j=1; j<=9; j++) // ���� for : ���� j�� ���� 1���� 9����..����(��) ���� �ݺ�
				System.out.printf("%3d",i*j); // i*j�� 3�ڸ��� ���
			System.out.println(); // 1���� 9���� ��� �Ϸ��� �࿡�� ���� �ٲٱ� ���� 
		}

	}
}
