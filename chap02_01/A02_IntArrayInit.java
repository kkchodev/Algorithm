package DoItAlgorithm.chap02_01;

public class A02_IntArrayInit {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5}; // �迭 �ʱ��ڿ� ���� ���� 
		// new �����ڸ� ����Ͽ� �� �� ��Ȯ�ϰ� ������ �� �ִ�. 
		for(int i=0; i<a.length; i++)
			System.out.println("a["+ i +"] =" +a[i]);
	}

}
