package day01;

public class Example2 {

	public static void main(String[] args) {
		
		// 자료형 / 타입 / 분류 : 데이터를 나누는 방법
		/*
		 * 자바의 기본 타입 (기본자료형)
		          [키 워 드        용  량       저 장 범 위]
		   [논리]  boolean 1바이트 true 혹은 false
		   
		   [문자]   char    2바이트 유니코드 , 작은 따옴표를 이용한 문자 -> 'A'
		         String N바이트 문자열클래스 , 큰따옴표를 이용한 감싼 문자열 -> "ABC"
		        
		   [정수]   byte    1바이트  - 128 ~ + 127 표현값 저장
		           short   2바이트  + - 32768 저장
		           int     4바이트  + - 21억 정도까지 저장 ,리터럴정수(키보드로 입력한 값은 정수) , 정수 기본타입
		           long    8바이트  + - 21억 그 이상 저장 , 리터럴 뒤에 L / l 븉아기.
		           
		   [실수]   float    4바이트  소수점 8자리까지 표현
		          double   8바이트  소수점 17자리까지 표현
		          
		          * 왜[타입목적] ?  타입을 여러가지 구분해서 범위에 맞게 사용 - > 메모리를 효율적으로 적절하게 선택하여 사용하자.[ 설 계 ]
		 */
	
	    //1.boolean 타입은 true 와 false 만 저장 할 수 있다.
		boolean bool1 = true;
		System.out.println("bool1 : + bool1"); // 기본틀 연결 연산자 ("문자열 : + 변수호출값 ");
		// boolean bool2 = 3; // 틀린 이유 : boolean 타입에는 3을 대입 할 수 없다.
		boolean bool3 = false;
		System.out.println("bool3 : + bool3");
		
		//2. char 타입은 작은따옴표를 이용하여 문자 1개만을 저장 할 수 있다.
		char ch1 ='A';
		System.out.println("ch1 : + ch1");
		// char ch2 = 'ABC'; // 틀린 이유 : char 타입에는 문자1개만 저장가능하므로 틀렸다.
	    // char ch3 = "ABC"; // 틀린 이유 : char 타입에는 큰 따옴표("")를 사용 할 수 없어 틀렸다.
		
		//3. String 클래스 타입은 큰따옴표를 이용하여 문자여러개를 저장 할 수 있다(단 ,기본 타입이 아니니 주의)
		String str1 = "ABC"; System.out.println("str1 : + str1");
		// String str2 = 'ABC'; // 틀린 이유 : String 클래스는 문자열 입력 후 큰 따옴표("")를 사용해야 한다.
		
		//4. byte 타입은 -128 부터 +127 까지 저장이 가능하다.
		byte b1 = 100; System.out.println("b1 : + b1");
		// byte b2 = 130; // 틀린 이유 : byte 타입의 저장 허용 범위를 벗어났기 때문에 틀렸다.
		
		//5. short 타입은 대략 +- 3만 정도까지 저장이 가능하다.
		short s1 = 32000; System.out.println("s1 : + s1");
		// short s2 = 40000; // 틀린 이유 : short 타입의 저장 허용 범위를 벗어났기 때문에 틀렸다.
		
		//6. int 타입은 대략 +- 21억 정도까지 저장이 가능하다.
		int i1 = 2100000000; System.out.println("i1 : + i1");
		// int i2 = 3000000000; // 틀린 이유 : int 타입의 저장 허용 범위를 벗어났기 때문에 틀렸다.
		
		//7. long 타입은 대략 +-21억 이상까지  저장이 가능하다 , 정수 리터럴 값 뒤에 L 또는 l 을 붙인다.
		long lo1 = 3000000000L; System.out.println("lo1 : + lo1");
		// long lo2 = 4000000000; // 틀린 이유 : 정수 리터럴의 기본 값은 int 타입이므로 원칙적으로 long 타입에 대입할 수 없다.
		// (단, 리터럴 값 뒤에 L 또는 l을 붙일 경우에는 사용할 수 있다.)
		
		//8. float 타입은 소수점 8자리 까지 표현 가능하다 , 실수 리터럴 값 뒤에 F 또는 f 를 붙인다.
		float f1 = 0.12345678F; System.out.println("f1 : + f1");
		// float f2 = 0.12345678; // 틀린 이유 : 실수 리터럴의 기본 값은 double 타입이므로 원칙적으로 float 타입에 대입 할 수 없다.
		// (단, 실수 리터럴 값 뒤에 F 또는 f를 붙일 경우에는 사용할 수 있다.)
		
		//9. double 타입은 소수점 17자리 까지 표현 가능하다 , 실수 리터럴 값의 기본 타입
		double d1 =0.123456789; System.out.println("d1 : + d1");
	
	}		

}
