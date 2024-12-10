package day02;

public class Example2 { // 클래스 시작

	public static void main(String[] args) { // 메인 시작
		
		// 1. 자동(자료/타입) 형 변환 , 묵시적 형 변환
		      // - 1. 메모리 크기가 작은 것 부터 큰 순으로 변환
		      // - 2. 데이터의 손실이 없다.
		      // - 3. 연산(계산) 중에 큰 값으로 변환된다. ( 메모리의 손실방지의 최소화 )
		      // byte - > short / char - > int - > long - > float - > double
		byte byteValue = 10;            // byte 타입으로 '; 'byteValue' 변수에 10 대입
		short shortValue = byteValue;   // short 타입으로 '; 'shortValue' 변수에 byte 10 대입
		int intValue = shortValue;      // int 타입으로 'intValue' 변수에 short 10 대입
		long longValue = intValue;      // long 타입으로 'longValue 변수에 int 10 대입
		float floatValue = longValue;    // float 타입으로 'floatValue 변수에 long 10 대입
		double doubleValue = floatValue; // double 타입으로 'doubleValue 변수에 float 10 대입
		
System.out.println("double value : + double value"); // byte 에서 double 까지 자동형변환
      // + 연산 중에 묵시적 형 변환 , 연산시 피연산자중에 더 큰 타입으로 결과를 반환한다.
           // byte + byte 끼리 계산 할 경우 => int , int 이하 byte 와 short 는 연산 결과는 무조건 int 로 반환된다.
           // byte + short => int
           // int + int => int
           // int + long => long
           // int + float => float

     byte b1 = 10; byte b2 = 20; short s1 = 30; int i1 = 40; float f1 = 3.14f; double d1 = 41.25;
     int result1 = b1 + b2;
     int result2 = b1 + s1;
     float result3 = i1 +  f1;
     // int result3 = i1 + f1;	// 틀린 이유 : 
     double result4 = f1 + d1;

      // 2. 자동 (자료/타입) 형 변환 , 명시적 (자료/타입)형 변환 , 캐스팅
            // - 1. 메모리의 크기가 큰것 부터 작은것 으로 변환
            // - 2. 데이터의 허용범위 외 손실이 발생 할 수 있다.
            // - 3. (변환 할 타입명) 변수명
            // - 4. double -> float -> long -> int ->short / char -> byte
     double value1 = 3.14;
     float value2 = (float)value1;
     long value3 = (long)value2;
     int value4 = (int)value3;
     short value5 = (short)value4;
     byte value6 = (byte)value5;
     System.out.println("byte value : + value6"); // 3.14 ---> 3 , .14(손실됨 ; 정수형 타입은 .14를 표현 할 수 없다)
     
     // +++ 자바의 특징 중에 다형성( 다양한 형식 / 타입을 가지는 성질 )은 형 변환으로부터 표현할 수 있다.
     
     //p67 1분 복습
     char ch1 = 'A';
     int int1 = ch1;
     System.out.println( int1 ); // 65 : A , 66 : B , 67 : C... < --- 아스키 코드에서 확인
     System.out.println( (int)ch1 );
     int ch2 = 67;
     System.out.println( (char)ch2 ); // 'C'
     
     // + 연산중 강제타입 변환
     int result5 = (int)381.01 + 3;
     
     //p69 q4. 변수 두개를 선언해서 10과 2.0을 대입하고 두 변수의 사칙 연산 결과를 정수로 출력해 보세요.
     int 정수1 = 10;
     double 정수2 = 2.0;
     double 결과1 = 정수1+정수2; // 정수1 + 정수2 (int + double = double)
     System.out.println("결과1 :" + 결과1);
     
     //p69 q5. '글'이라는 한글 문자의 유니코드 값을 찾아서 char형으로 선언한 변수에 저장한 뒤 그 변수를 출력하여 확인해 보세요.
     char 문자1 = '글'; // 문자열" " , 문자 ' '
     int 문자정수1 = 문자1;
     System.out.println("글 정수 :" + 문자정수1);
     
   // String 문자2 ="JAVA"; / int 문자정수2 = 문자2; / System.out.println("글 정수:" + 문자정수2); // 틀린 이유 : 
     
     
	} // 메인 끝

} // 클래스 끝
