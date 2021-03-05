package DoItAlgorithm.chap01;


//곱셈표를 출력합니다. 

public class A07_Multi99Table {

	public static void main(String[] args) {

		
		System.out.println("곱셈표");
		
		for(int i=1; i<=9; i++) { //바깥 for: 변수 i 값을 1부터 9까지 증가.. 세로(행) 방향 반복
			for(int j=1; j<=9; j++) // 안쪽 for : 변수 j의 값을 1부터 9까지..가로(열) 방향 반복
				System.out.printf("%3d",i*j); // i*j를 3자리로 출력
			System.out.println(); // 1부터 9까지 출력 완료한 행에서 줄을 바꾸기 위해 
		}

	}
}
