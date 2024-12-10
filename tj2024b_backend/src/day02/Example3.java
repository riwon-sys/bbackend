package day02;

public class Example3 { // 시작

	public static void main(String[] args) { // 메인 시작
		
		// [콘솔 출력]
		System.out.println();
		     // System : 시스템 관련 기능 제공하는 클래스 / 설계도
		               // out : 출력 관련 객체 반환 // vs in : 입력 관련 객체 반환
		                      // print () : 출력 함수 
		     
		     // .(접근/도트) : 객체 또는 클래스 내 속성/필드 접근하는 연산자
		                   // 유재석 집 안에 있는. 강아지. 산책시키기();
		
		     // - 형식문자 : printf() 함수에서 사용되는 의미가 담긴 문자
		                 // %s : 문자열 ,  %c : 문자
		                 // %d : 정수  , %f : 실수
		                 
		                 // [ 자릿수 맞추기 ]
		                 // %자릿수d : 자릿수 만큼 자릿수를 차지 , 만일 비어 있으면 공백처리 , 오른쪽 정렬
		                 // %-자릿수d : 자릿수 만큼 자릿수를 차지 , 만일 비어 있으면 공백처리 , 왼쪽 정렬
		                 // %0자릿수d : 자릿수 만큼 자릿수 차지 , 만일 비어 있으면 '0'으로 처리 
		
		                 // [ 소수점 자리수 맞추기]
		                 // %자릿수.소수점자릿수f : 여기서 말하는 자릿수는 소수점 포함 전체만큼 자릿수 차지하고, 소수점은 소수점 자릿수까지만 표현된다.
		
		    
		     // -  제어문자  : 이스케이프 문자 , 의미/기능이 내장된 문자 , 원화모형 버튼
		                   // \n : 줄바꿈 , \t : 들여쓰기 , \" : "한개출력 , \ ': '한개출력 , \\ : \한개출력
		
		//1. println( 인수 ) : 인수 값을 CONSOLE 에 출력 후 줄바꿈 처리하는 함수
		System.out.println("JAVA1");
		System.out.println("JAVA2");
		
		//2.print( 인수 ) : 인수 값을 CONSOLE 에 출력 함수
		System.out.print("JAVA3");
		System.out.print("JAVA4");

		//3.printf( "형식문자" , 형식대입값1  ) : 인수 값에 형식문자를 이용하여 수식을 출력하는 함수
		System.out.printf( "%s" , "JAVA5" );
		
		String name ="유재석"; int age = 40-5;
		System.out.printf( "저는 %s 이고 나이는 %d 입니다." , name , age );
		
		System.out.printf( "저는 "+name+" 이고 나이는"+age+" 입니다." );
		
		System.out.printf( "저는 %s 이고 나이는 %6d 입니다. \n" , name , age );
		System.out.printf( "저는 %s 이고 나이는 %-6d 입니다. \n" , name , age );
		System.out.printf( "저는 %s 이고 나이는 %06d 입니다. \n" , name , age );
		
		System.out.printf( "저는 %s 이고 신장은 %5.2f 입니다. \n" , name , 182.257 );
		
		// 실습1 :  아래와 같이 이스케이프 문자를 이용하여 콘솔에 출력하시오.
		System.out.printf( "｜＼＿／｜ \n"  );
		System.out.printf( "｜q  p｜  /} \n");
		System.out.printf( "(  0  ) \"\"\"\\ \n");
		System.out.printf( "｜\"^\"` \t   ｜ \n");
		System.out.printf( "｜｜_/=\\\\_   ｜ \n");
				
	} // 메인 끝

} // 끝
