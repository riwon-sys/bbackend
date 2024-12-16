package day04; // 폴더

public class Example2 { // 시작

	public static void main(String[] args) { // 메인 시작
		
		// [1]while 문
		/*
		   while(조건식) {
		      실행문
		  }
		  -> 조건식이 t면 {}안에 있는 실행문 실행한다.    
		 */
		
		// while문 예제1
		int num =1;  // 1.초기값
		int sum =0;  // 0 이 없으면 : 문제발생
		// int sum; 변수가 참조 또는 가지고 있는 값이 없다; 쓰레기값 또는 임의값
		// 쓰레기값 또는 임의값 vs 0(정수타입) vs null(참조타입) vs ''(char타입;공백1) vs ""(String타입;공백2)
		// 결론 : 변수에 0을 대입하지 않으면 초깃값이 없으므로 임의 값(쓰레기 값)은 연산을 할 수 없다.
		
		while(num<=10) { // 만약에 num 이 10 이하이면 반복처리 2.조건문
			sum = sum + sum; // sum+= num
			num++;           // num = num +1  // num 1증가 3.증감식
		} // w 끝
		System.out.println("[while]1부터 10까지의 합은" + sum );
		
		// for문으로 표현하기 예제2
		int sum2 =0;
		for( int num2 = 1; num2 <= 10; num2++ ) {
		 // 1. 초기값      ; 2. 조건문  ; 3. 증감식	
			sum += num2;
		} // f 끝
		System.out.println("[for]1부터 10까지의 합은" + sum2 );
		
		// [2] 무한반복
		  //while 문
	/*	while(true) {
			System.out.println("24시간 실행중!!!");
		}
		  //for 문
		for( ;; ) {
			System.out.println("24시간 실행중!!!");
		}
	*/
		// [3] do-while문 , 1~10까지 더하는 프로그램
		int num3 =1;
		int sum3 =0;
		
		do { // 먼저 실행 후                     , 선처리
			sum3 += num3;
			num3++;
		}while( num3 <= 10); // 실행 후 조건 검사 , 후 조건 검사
		System.out.println("1부터 10까지의 합 : " + sum3);
		
		// [4] 구구단 중 2단만 출력하시오. while과 do-while 문으로 구현하기
		//1. 일반 출력
		System.out.println("2 x 1 = " +(2*1));
		System.out.println("2 x 2 = " +(2*2));
		System.out.println("2 x 3 = " +(2*3));
		System.out.println("2 x 4 = " +(2*4));
		System.out.println("2 x 5 = " +(2*5));
		System.out.println("2 x 6 = " +(2*6));
		System.out.println("2 x 7 = " +(2*7));
		System.out.println("2 x 8 = " +(2*8));
		System.out.println("2 x 9 = " +(2*9));
		// 반복되는 코드와 System.out.println("2 x ? = " +(2*?));
		// 반복되지 않는 코드 찾기 1,2,3,4,5,6,7,8,9 -> 1부터 9까지 1씩 증가
		
		//2. while 출력
		int index = 1; // 초기값
		while( index <=9) { // 조건식
			// System.out.println("2 x"+index+" = " +(2*index));
			System.out.printf(" 2x %d = %d \n , index , (2*index)");
			index++;
		} // w 끝
		
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

		
		
		//3. do-while 출력
		int index2 =1;
		do {
			System.out.printf(" 2x %d = %d \n , index2 , (2*index2)");
			index2++;
		}while(index2<=9);
		
		//4. for 출력
		for (int index3 =1; index3 <=9; index3++ ) {
			System.out.printf(" 2x %d = %d \n , index3 , (2*index3)");
		}
		
	} // 메인 끝

} // 끝
