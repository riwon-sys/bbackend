
package day17.step5;

interface InterFaceTest2{
	// 인터페이스의 구성멤버
	// 1. 상수 : 수정이 불가능한 변수.
	public static final int value =10;
	// 2. 추상메소드 : 선언부 ( 접근제한자 반환타입 메소드명 매개변수) 만 작성
	public abstract void method(); // {} 중괄호 없음
	
	// + 추가된 메소드
	// 3. 디폴트 메소드
	public default void method2(){} // 인터페이스에 구현한 메소드 생성
	// 4. 정적 메소드
	public static void method3(){} // 인터페이스에 정적 구현 메소드 생성
	
	// 5. private 메소드
	private void method4() {} // 현재 인터페이스에서 사용 가능한 구현 메소드 생성
	// 6. private 정적 메소드
	private static void method5() {}
	
	// + : 인터페이스는 클래스와 다르게 생성자가 없다. // 인터페이스 new 인터페이스명(); , 인터페이스는 인스턴스를 만들 수 없다.
	   // 생성자란? 클래스의 구성멤버이자, 인스턴스를 만들때 인스턴스의 초기화를 담당하는 메소드
	// + : static 이란? 프로그램 시작될 떄 메모리가 할당되고 프ㅗ그래밍이 끝날때 메모리가 초기화
} // i.e






