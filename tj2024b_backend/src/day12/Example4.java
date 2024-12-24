package day12;

class Member{
	String name;
	static int age;
	
	boolean getAge() {return true;}
	
	static int getName() {return 10;}

}


public class Example4 {
	// 함수 호출 판단 : 
	//ㄴ1. 호출 하고자하는 클래스가 같은 클래스인지? 다른 클래스인지? 판단
	//ㄴ2. 호출 하고자하는 메소드가 정적 static 인지? 아닌지? 판단
	//ㄴ3. 호출 하고자하는 위치의 메소드가 정적 static 인지? 아닌지? 판단
	     
	     //ㄴ. static이 없는 메소드는 객체를 통해 호출 , 변수명.메소드명() 
	     //ㄴ. static이 있는 메소드는 클래스를 통해 호출 , 클래스명.메소드명()

public static void main(String[] args) {
	// [1] main 함수는 static 함수
	// signup(); // main 함수가 우선 할당 되므로 sign up 이라는 함수를 모른다.
	//ㄴ 해결방안
	Example4 example4 = new Example4();
	example4.signup();
	
	// [2] 정적 main 메소드 안에서 동일한 클래스 내부 static 메소드 호출하기
	login(); // main 함수가 우선 할당되고 login 함수도 우선 할당 이므로 호출 가능하다.
	// ㄴ 다른 클래스 static 메소드이면, 클래스명.static메소드명();
	Member.getName();
	// [3] 일반메소드 안에서 동일한 클래스 내부 메소드 호출하기
	// 함수명();
	
	// [4] 일반메소드 안에서 서로 다른 클래스 내부 메소드 호출하기
	// ㄴ1. 클래스명 변수명  = new 객체생성자()
	// ㄴ2. 변수명.함수명();
	// ㄴ3. 같은 클래스인지? 다른클래스인지? / static함수인지? static 함수가 아닌지?
   } // m.e

void signup() { // 메소드 // 멤버함수
     myInfo(); // 같은 클래스의 메소드
     Member member = new Member();
     member.getAge(); // 서로 다른 클래스이면 객체가 필요하다.
}
void myInfo() {  }
// 정적 메소드
static void login() { }

}// c.e
