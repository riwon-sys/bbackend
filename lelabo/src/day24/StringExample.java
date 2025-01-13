package day24;

public class StringExample {
public static void main(String[] args) {
	
	// [1] 변수 몇개 ? 2개 / 자료 몇개 ? 1개
	      // 리터럴이란? 키보드로부터 입력받은 자료,상수풀이라는 곳에 이미 저장된 값
	int a = 3;
	int b = 3;
	System.out.println(a==b); // t
	// > 즉 서로 다른 두 변수는 같은 자료를 참조한다.
	
	// [1] 변수 몇개 ? 2개 / 자료 몇개 ? 1개
	int c= 5;
	int d = c;
	System.out.println(c==d); // t
	// > 즉 c가 참조하는 5를 d에 대입했다. 그러므로 c와d는 같은 자료를 참조한다.
	
	// [3] 변수 몇개 ? 2개 / 자료 몇개 ? 2개 (순수한 자료 3, 포장된 new Integer(인스턴스))
	Integer value1 =3;
	Integer value2 = new Integer(3); // 취소선 : 권장하지 않음.
	System.out.println(value1==value2); // f       // 단순 리터럴을 비교     // 스텍 값 비교
	System.out.println(value1.equals(value2)); // true // 인스턴스 안에 값을 비교 // 힙 값 비교
	
	
} // m.e
} // c.e
