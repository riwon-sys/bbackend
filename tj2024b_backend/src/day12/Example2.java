package day12;
class person{ // c.s
	// 1. 멤버변수가 있고
	String name; int age;
	// 2. 생성자가 있고
	person(){ // 디폴트 생성자 : 매개 변수가 없는 생성자
		// this.name ="이름 없음"; // this() 이전에 코드를 넣으면 오류발생
		 this("이름 없음" , 1); // 2번째 생성자에게 인수값을 전달
		 // this.멤버변수 : 인스턴스의 메버변수 가리킨다
		 // this () : 인스턴스의 생성자를 기리킨다
		 // this 메소드명() : 인스턴스의 메소드를 가리킨다. 
	} 
	          // 사용자정의 생성자 : 개발자가 매개변수를 임의로 해서 만든 생성자
	person(String name , int age){ // this 란 ? 현재 생성자를 호출한 인스턴스의 멤버변수를 가리킨다.
		this.name = name; // 인스턴스의 멤버변수를 가리킨다 // name; : 매개변수를 가리킨다.
		// 관례적으로 생성자의 매개변수와 클래스 멤버변수 명은 동일하게 한다.
		this.age = age; // 
	}
	// 3. 메소드가 있다.
} // c.e
public class Example2 { // cs
	public static void main(String[] args) { // ms
		Person noName = new Person(); // 디폴트 생성자 호출
		System.out.println(noName.name); // 이름 없음
		System.out.println(noName.age); // 1
		
		Person yesName = new Person("유재석" , 40);
		System.out.println( yesName.name ); // 유재석
		System.out.println( yesName.age ); // 40
		
		/* cf. 클래스 2개 person , example2
		 * 객체(인스턴스) : 2개 , new Person(); , new Person("유재석" , 40)
		 * 할당된 멤버변수 : 4개 ,
		 * (String name; int age;)
		 * (String name; int age;)
		 * this.멤버변수 : 인스턴스의 멤버변수 가리킨다
		 * this() : 인스턴스의 생성자를 가리킨다
		 * this : 인스턴스의 참조값을 호출된다.
		
		
		*/
	}

}
