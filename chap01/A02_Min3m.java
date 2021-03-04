package doitAlgorithm.chap01;

public class A02_Min3m {
//3개의 정숫값 가운데 최댓값을 구하여 출력 
	// a,b,c의 최댓값을 구하여 반환합니다. 
	static int max3(int a, int b, int c) {
		int max=a; 
		if(b>max) max =b; 
		if(c>max) max =c;
		
		return max; //구한 최댓값을 호출한 곳으로 반환 
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
	//최댓값을 여러 번 반복해서 구하는 경우, 메서드로 처리하면 편하다 ! 
		
	}

}
