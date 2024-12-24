package day12;

//_(2) 객체 (인스턴스)를 생성하기 위한 객체 설계도 클래스
class Birthday{ //c.s1
	//  + 클래스 멤버 / * 모든 인스턴스 들이 각각 사용하는 변수 = 힙메모리 */
	// 1. 멤버변수
	int day; int month; int year;
	// 2. 생성자
	// 3. 메소드 / 멤버변수 / * 모든 객체(인스턴스)들이 공통으로 사용하는 함수 = 정적메모리 * /
	public void setYear(int year) { this.year =year;} // this 란? 해당 메소드를 호출하는 인스턴스를 가리킨다.
	public void printThis() {System.out.println(this);}
} // c.e1

//_ 하나의 .java 파일에 1개 이상의 클래스를 생성 할 수 있다.

//_(1) main 함수를 갖는 실행 클래스
public class Example1 { // c.s2
public static void main(String[] args) { // m.s
      // 1. 인스턴스 의 생성이란 ? 객체를 구현하기 위해 설계도(클래스)를 메모리 할당해서 실체물	
	BirthDay dDay = new BirthDay(); // ?
	  // 2. 인스턴스가 메소드를 호출
	dDAY.printThis(); // day12.BirthDay@5305068a
	  // 3. 인스턴스의 멤버변수 값 대입
	dDAY.setYear(2000);
	System.out.println(dDAY.year); // 
	 // *
	BirthDay dDay = new BirthDay(); // ?
	dDAY2.printThis(); // day12.BirthDay@1f32e575
	dDAY2.setYear(2024);
	
	System.out.println(dDAY2.year); // 
	
	// 클래스 6개
	// 인스턴스 2개
	// 할당된 멤버변수 6개 / 저장
	// 메소드 2개 / 행위
	
	
} // m.e
} // c.e2
