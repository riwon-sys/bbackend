package day02;

import java.util.Scanner; // Scanner 클래스 입력시 코드파일 최상단에 import java.util.Scanner;
                               // import 란 ? 다른 패키지/폴더의 클래스를 가져온다는 의미 
                               // 예외 : java.lang패키지(기본 클래스 모임) ; 

public class Example4 { // 시작

	public static void main(String[] args) { // 메인 시작
		
		// [팁] 키워드 입력할 때 주의 사항 : 입력 시 두 번째 글자까지 입력 내지 세 번째 글자까지 입력 후 컨트롤 키와 스페이스바 키를 동시에 누르면 자동완성이 된다.
		// [ 콘솔입력 ]
		// js : prompt , document querySelector().value
		// JAVA : Scanner 
		
		// 1. 입력 객체 만들기 , 객체 생성 방법 ( new 클래스명() ) , new Date() , Java에선 클래스명의 첫글자는 무조건 대문자로 시작
		   // new Scanner(); // Scanner 클래스 , Scanner 클래스를 이용한 Scanner 객체 생성
		   // Scanner( System.in ); // System.in 입력객체 , Scanner 객체 생성시 입력객체를 인수로 전달한다.
		   // -
		        // Scanner scan; // Scanner 타입으로 'scan' 변수로 선언 // 기본타입(8가지)외 참조(클래스)타입
		        // scan = new Scanner(System.in); // 'scan' 변수에 Scanner 객체(주소) 대입 했다.
		Scanner scan =  new Scanner(System.in);

		
		// 2. 입력 객체로 콘솔에서 키보드로부터 입력받은 데이터 가져오기 함수 제공한다.
           // - 객체란 ? 고유한 속성과 이벤트 및 이벤트 함수를 가지는 실체물
		   // 입력객체.nextXXX(); , 엔터 기준으로 입력 마침 처리 -> 엔터 기준으로 하나의 (next) 입력 마침 처리한다.
		           
		             // [1] 변수명.next() , 문자열 입력받기 , 키보드로부터 입력받은 데이터를 String 타입으로 반환 함수 , 띄어쓰기 불가
		System.out.println(".next() 문자열 입력 : "); // 안내 문구 출력
		String str1 = scan.next(); // 콘솔에서 키보드로부터 입력받은 데이터를 String 타입으로 반환
		System.out.println("[1].next() 입력 결과 :" + str1 );
		    
		             // [2] 변수명.nextLine() , 키보드로부터 입력받은 데이터를 String 타입으로 반환 함수 , 띄어쓰기 가능
		                   // 주의할 점 : nextLine()은 다른 nextXXX()코드와 사용시 앞전 nextXXX()의 엔터를 포함하여 하나로 인식하는 특징이 있음
		                   // ㄴ > 해결 방안 : 의미없는 scan.nextLine() 사용하므로 실 사용할 nextLine() 구분하기
		System.out.println(".nextLine() 문자열 입력 : "); // 안내 문구 출력
		
		scan.nextLine(); // 의미 없는 단순 nextLine() 생성
		String str2 = scan.nextLine();
		System.out.println("[2].nextLine() 문자열 결과 :" + str2 );
		
		            // [3] 변수명.nextInt() , 키보드로부터 입력받은 데이터를 Int 타입으로 반환 함수 , 허용 범위 초과시 오류 발생
	    System.out.println("[3].nextInt() 정수Int 입력 :");
		int value1 = scan.nextInt();
		System.out.println("[3].nextInt() 정수Int 결과 :" + value1 );
		
		            // [4] 변수명.nextByte() , byte 타입으로 반환 함수
		byte value2 = scan.nextByte();
	    System.out.println("[4].nextByte() 정수Byte 결과 :" + value2 );
		
		            // [5] 변수명.nextshort() , short 타입으로 반환 함수
		short value3 = scan.nextShort();
	    System.out.println("[5].nextShort() 결과 :" + value3 );
		
                    // [6] 변수명.nextLong() , Long 타입으로 반환 함수
        long value4 = scan.nextLong();
        System.out.println("[6].nextLong() 결과 :" + value4 );
        
                    // [7] 변수명.nextFloat() , nextFloat 타입으로 반환 함수
        float value5 = scan.nextFloat();
        System.out.println("[7].nextFloat() 결과 :" + value5 );
        
                    // [8] 변수명.nextDouble() , Double 타입으로 반환 함수
        double value6 = scan.nextDouble();
        System.out.println("[8].nextDouble() 결과 :" + value6 );

                    // [9] 변수명.nextBoolean() , Boolean 타입으로 반환 함수
        boolean value7 = scan.nextBoolean();
        System.out.println("[9].nextBoolean() 결과 :" + value7 );
        // 오류 발생 : 지정한 함수의 반환타입과 입력한 데이터의 허용범위를 초과하면 InputMismatchException 발생
        // ㄴ > 해결 방안 : 코드에 입력한 입력함수 반환타입에 맞게 키보드로부터 데이터를 잘 입력한다.

		
		
	} // 메인 끝

} // 끝
