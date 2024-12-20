package day09;

public class Example3 {
	public static void main(String[] args) { // ps // m함수 있음
		//[1] 객체(인스턴스) 생성하기
		     // (1) new 연산자와 생성자 이용한 인스턴스 생성
		new Person();
		    // (2) 주로 생성된 인스턴스의 참조/주소/메모리위치 값을 변수에 대입한다
		              // 1. 디폴트 생성자 사용
		Person personLee = new Person();// < 생성자 >> person(){} >>>단순.name 추가하면 null >>>세부.name 추가하고 하단 personLee.name = "이순신"; 추가하면 이순신
		personLee.name = "이순신";              
		
		             // 2. 매개변수 1개 생성자 사용
		Person personYou = new Person("유재석"); // >>person (String pname ) {name = pname;} >>>.name 추가하면 유재석
		
		System.out.println(personLee.name);
		System.out.println(personYou.name);
		
		             // 3. 매개변수 3개 생성자 사용
		Person personYou2 = new Person ("유재석" , 182.1f , 65.7f); // float 사용시 f 사용해야함
		System.out.println( personYou2.name );
		System.out.println( personYou2.height );
		System.out.println( personYou2.weight );
	}

}
