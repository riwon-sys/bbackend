package day17;

public interface InterfaceTest {
	// 인터페이스 멤버
	// 1.상수
	        
	// int value1; // 오류 발생 // 인터페이스는 변수를 갖지 못한다.
	// (1) 상수만들기1
	int value2=10; // 오류 발생 없음 // 변수가 아닌 상수로 자동 초기화
	// (2) 상수만들기2
	public static final int value3 =20; // 오류 발생 없음 // public static final 키워드를 이용한 상수 만들기
	
	// 2. 추상 메소드
	
	// int method1(int a) {} // 오류 발생 // 일반 메소드는 인터페이스를 갖지 못한다.
	// (1) 추상메소드 만들기1
	int method1(int a);
	// (2) 추상메소드 만들기2
	abstract int method3(int a);

}
