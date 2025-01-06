package day03; // 폴더명
public class Example1 { // 시작 // 자바는 번역 단위(컴파일)를 클래스 단위로 시작함으로써 모든 코드는 클래스 안에 존재해야 한다.

	public static void main(String[] args) { // 메인시작 // 번역된(.class) 코드가 실행되기 위해서는 main 함수 안에 있어야 실행된다. // 자바에서 메인 함수는 필수 요소 무조건 있어야 한다.
		
		// 연산자
		
		// [1] 대입연산자 , 왼쪽 변수 = 오른쪽 변수( 또는 식 ) , 오른쪽 항 먼저 확인 및 계산
		int age = 24; // 나이를 의미하는 age 변수에 값 24를 대입
		
		int mathScore = 10;
		int engScore = 20;
		// 수학 점수와 영어 점수의 값을 더해서 총점을 의미하는 변수에 대입
		int totalScore = mathScore + engScore;
		// [2] 부호연산자 , + 양수 , - 음수
		int num = 10;
		System.out.println( +num ); // +10 --> 10
		System.out.println( -num ); // -10 --> -10 // 부호을 붙여서 출력만 함 , 수정 된 것은 아님
		System.out.println( num ); // +10 --> 10
		
		num = -num;
		// 변수 선언  : 타입 변수명 = 값; // 변수 호출 : 변수명 // 변수 수정 : 변수명 = 새로운 값 
		System.out.println( num ); // -10 --> -10
		
		// [3] 산술연산자 , +덧셈 , -뺄셈 , *곱셈 , /나누기 , %나머지
		System.out.println(5/3); // 1.xxxxxx -> 1(몫) // 몫이 1인 이유 : int/int->int // 정수 중에 기본값 int
		System.out.println(5.0/3.0); // 1.66666666667 - > 나누기 결과 //몫이 1.소수점으로 나오는 이유 : double/double->double // 실수 중에 기본값 double
		System.out.println( (int)(5.0 / 3.0) ); // 1.66666666667 - > 강제타입변환 -> 정수
		
		int math = 90;
		int eng = 70;
		int total= math + eng; // 총점구하기
		
		System.out.println(total); // 총점결과산출
		
		double avg = total / 2.0; // 평균구하기
		System.out.println(avg); // 평균결과산출
		
		// [4] 증감연산자 , ++  -- , 주의할점 ;(세미콜론/명령어단위) 기준으로 연산 우선순위를 정한다.
		
		int num2 = 10;
		int value2;
		
		value2 = ++num2; // num2 값이 1증가 한 후에 value2 변수에 대입한다.
		System.out.println( value2 ); //  num2 = 11 , value2 =11 
		
		value2 = num2++; // value2 변수에 기존 num2 값이 먼저 대입한 후에 num2 값이 1증가 한다.
		System.out.println( value2 ); // value2 =11 , num2 = 12
		
		value2 = --num2; // num2 값이 1감소 한 후에 value2 변수에 대입한다.
		System.out.println( value2 ); //  num2 = 11 , value2 =11
		
		value2 =  num2--; // value2 변수에 기존 num2 값이 먼저 대입한 후에 num2 값이 1감소 한다.
		System.out.println( value2 ); // value2 =11 , num2 = 10
		
		int gameScore = 150;
		int lastScore = ++gameScore; // 변수 앞에 ++가 있으므로 대입(=) 보다 1증가가 우선이다.
		System.out.println( lastScore ); // 151;
		
		int lastScore2 = ++gameScore; // 변수 앞에 --가 있으므로 대입(=) 보다 1감소가 우선이다.
		System.out.println( lastScore2 ); // 152;
		
		// * 사칙연산의 우선순위에 따라 *곱하기 후 +더하기 =>9
		int result1 = 3 + 3 * 2; System.out.println(result1);
		
		
		// * 예제
		int x = 10;
		int y = x-- +5 + --x; 
		// 1. x -- + 5 => 10 + 5 > 15 [ x는 +연산 후 1차감 ] x = 9 
		// 2. 15 + --x => 15 + 10/9/8 [ x는 +연산 전 1차감 ] x = 8
		System.out.println( x ); // 8
		System.out.println( y ); // 23
		
		// [5] 비교연산자 , >초과 <미만 >=이상 <=이하 ==같다 !=다르다 , 결과는 true 또는 false
		
		int myAge = 35;
		boolean value = (myAge > 30); 
		System.out.println(value);
              // ( ) 를 사용한 이유는 가독성(읽기좋게) 높이기 위해서 사용 
		
		// [6] 논리연산자 , &&논리곱(이면서) ||논리합 !부정
		
		int num5 = 10;
		int i = 2;
		
		boolean value7 = ((num5 = num5 + 10) < 10) && ((i = i + 2) < 10);
		             //[단락회로평가] ---여기에서 이미 false 이므로 , ---뒤에 조건은 볼 필요없으므로 코드가 실행되지 않음
		System.out.println(value7); // false
		System.out.println(num5); // 20 
		System.out.println(i); //  4-->2
		
		boolean value8 = ((num5 = num5 + 10) > 10) && ((i = i + 2) < 10);
		             //[단락회로평가] ---여기에서 이미 true 이므로 , ---뒤에 조건은 볼 필요없으므로 코드가 실행되지 않음
		System.out.println(value7); // true
		System.out.println(num5); // 30
		System.out.println(i); //  2
		
		// [7] 복합 대입 연산자 , += -= *= /= %= |
		
		// [8] 조건 연산자(삼항연산자) ,  조건식 ?참결과 : 거짓결과
		
		int num3 = 5 >3 ? 10 : 30 ; // 만일 5가 3보다 크다면 10을 대입하고 아닐경우에는 30을 대입
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = ( fatherAge > motherAge ) ? 'T' : 'F';// 만일 파가 마보다 크다면 T 결과값 산출 하고 아닐경우에는 F 결과값 산출
			System.out.println(ch);
			
		// 예제 p82
			int num9 =10; 
			boolean isEven;
			isEven =(num9%2) == 0 ? true : false; 
			System.out.println(isEven);
			// 10 이 짝수이면 t를 아닐경우에는 f // num % 2 == 0 (짝수를 구하는 공식)
			
		
	} // 메인끝

} // 끝
