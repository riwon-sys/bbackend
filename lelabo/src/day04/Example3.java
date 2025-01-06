package day04; // 폴더

public class Example3 { // 시작

	public static void main(String[] args) { // 메인 시작
		// p113 for(int num =1; num<=10; num++ )
		
		// [1] for, 1부터 10까지 더하는 과정
		int sum =0;
		sum+=1; sum+=2; sum+=3; sum+=4; sum+=5; sum+=6; sum+=7; sum+=8; sum+=9; sum+=10;
		
		// 반복되는 것 : sum+=
		// 반복되지 않는 것 : int sum = 0; 1 2 3 4 5 6 7 8 9 10
		// 패턴 및 규칙 : 1부터 10까지 증가
		
		// 풀이
		int sum2 = 0;
		for(int i = 1; i<=10; i++) { // i는 1부터 10까지 1씩 증가 반복한다.
			sum2+=i;
		} // f 끝
		System.out.println("1부터 10까지의 합: " + sum2 );
		// 문법 문제 : 반복문 사용하는 
		// 실무 : 상황에 따른 규칙 및 패턴 반복 , 구구단
		
		// [2] for ,안녕하세요1부터 안녕하세요10까지 차례로 출력
		// 생각나지 않을 경우에는 단순 출력 필요
		// System.out.println("안녕하세요.1");
		
	    System.out.println("안녕하세요.1");  // 반복되는것 : System.out.println("안녕하세요.?");
		System.out.println("안녕하세요.2");
		System.out.println("안녕하세요.3");  
		System.out.println("안녕하세요.4");  // 반복되지 않는 것 : 1 2 3 4 5 6 7 8 9 10
		System.out.println("안녕하세요.5");
		System.out.println("안녕하세요.6");  // 패턴 및 규칙 : 안녕하세요1부터 안녕하세요10까지 차례로 출력
		System.out.println("안녕하세요.7");
		System.out.println("안녕하세요.8");
		System.out.println("안녕하세요.9");
		System.out.println("안녕하세요.10");
		
		
		for (int value =1 ; value<=10; value++) { //value 는 1부터 10까지 증가 반복한다.
			System.out.println("안녕하세요1"+value);
		}
		
		// [3] 구구단 , 중첩의 기본 , 단 마다 곱 계산(단 for 안에 곱for 포함)
		int dan;
		int times;
		
		for( dan=2; dan<=9; dan++ ) {
			
			for (times =1; times <=9; times++) {
				System.out.println(dan + "x" + times + "=" + dan * times);
			}
		System.out.println();
		}
	
		// p118 1분복습 중첩 반복문 예제를 수정하여 3단부터 7단만 출력해보세요.
		// int dan;
		// int times;
		// for (dan 3; dan<=7; dan++){
		//   for (times = 1; time<=9; times++){
		//       System.out.println(dan + "x" + times + "=" + dan * times);
		// }
		// System.out.println();
		// }
		
	    // [4] continue , 이후의 문장은 수행하지 않고 for의 증감식으로 이동한다.
		// 1부터 100까지의 홀수 값들의 누적 합계 계산
		int total = 0;
		for( int num =1; num<=100; num ++) {
			if(num % 2 == 0) {
				// 만약에 현재 반복되고 있는 num변수값이 나누기 2했을때 0이면 [짝수]
				continue;
			}
		    total += num;
		}
		System.out.println("1부터 100까지의 홀수 값들의 누적 합계 : " + total);
		// p120 예제1 1부터 100까지 수 중 3의 배수만을 출력하는 코드를 완성해보세요.
		int num;
		for(num=1; num<=100; num++) {
			if(num % 3 != 0)
				continue;
			System.out.println(num);
		}
		
		// [5] break , 가장 가까운 for/switch 문{} 을 탈출 및 종료 한다.
		int sum3 = 0;
		for ( int num2 = 0; ; num2++ ) {
			sum3 += num2;
			if(sum3>=100) {
				break; // sum3 이 100보다 크면 반복문은 탈출 및 종료 한다.
			}
		}
		
		// p122 예제2 1부터 더했을 때 그 합이 500이 넘는 자연수는 얼마인가요?
		int sum4 =0;
		int num3;
		for (num3 =1; ; num3++) {
			sum4+=num3;
			if(sum4 >= 500) {
				break;
			}
		}
		System.out.println(sum4);
		System.out.println(num3);
		
		// p123 연습문제
		// q1 
		int num5=10;
		int num6=2;
		char operator = '+';
		
		// q2 , 구구단을 짝수 단만 출력 하는 코드 구현
		
		
		
	} // 메인 끝

} // 끝
