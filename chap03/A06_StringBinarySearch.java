package DoItAlgorithm.chap03;

import java.util.Arrays;
import java.util.Scanner;

class A06_StringBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
	
	//자바에서 사용하는 키워드
	String[] x = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for",
            "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new",
            "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch",
            "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while" };
	
	System.out.print("원하는 키워드를 입력하세요 ");
	String ky = sc.next();
	
	int idx = Arrays.binarySearch(x, ky); //배열 x에서 값이 ky인 요소 검색
	
	if(idx<0)
		System.out.println("해당 키워드가 없습니다.");
	else
		System.out.println("해당 키워드는 x["+idx+"]에 있습니다.");
	}
}
