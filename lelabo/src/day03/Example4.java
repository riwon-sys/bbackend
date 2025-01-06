package day03; // 폴더

import java.util.Scanner;

public class Example4 { // 시작

	public static void main(String[] args) {// 메인 시작
//		 [ 구현 문제 , FOR문 없이 풀이 ] 
//문제1 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 '합격' 아니면 '불합격' 출력 하시오.

/*int score = 78; // 점수
String grade; // 합격 불합격

if( score >= 90 ) {
	grade = "합격";
}else {
	grade= "불합격";
}

System.out.println( score );
System.out.println( grade );
*/
/*		
		Scanner scan = new Scanner(System.in); // 입력 객체 , 입력 객체 안에 입력관련 함수가 제공된다.
		System.out.println("[1] 점수 입력 하세요.");
		int score = scan.nextInt();
		if(score>=90) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}

//문제2 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 'A등급', 80점 이상이면 'B등급', 70점 이상이면 'C등급', 그외 '재시험' 으로 출력 하시오.
/*int score1 = 55;

String grade1;
if ( score1 >= 90 ) {
	grade1 = "a";
}else if ( score1 >=80 ) {
	grade1 = "b";
}else if ( score1 >=70 ) {
	grade1 = "c";
}else  {
	grade1 = "재시험";
}

System.out.println( score1 );
System.out.println( grade1 );
*/
		
/*
		System.out.println("[2] 점수를 입력 하세요.");
		int score2 = scan.nextInt();
		if(score2 >=90) {
			System.out.println("A");
		}else if(score2 >=80) {
			System.out.println("B");
		}else if(score2 >=70) {
			System.out.println("C");
		}else {
			System.out.println("retest");
		}

//문제3 : 각 3개의 정수형으로 수를 입력받아 가장 큰 수를 출력 하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
	
		int il1 = scan.nextInt(); int il2 = scan.nextInt(); int il3 = scan.nextInt();  //입력
		
		int max = il1;                                                                 //처리
		if (max < il2 ){max =il2;}
		if (max < il3 ){max =il3;}
		
		System.out.println( max );                                                     //결과
	
	
		






//문제4 : 각 3개의 정수형으로 수를 입력받아 오름차순 순서대로 출력하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
		int value1 = scan.nextInt(); int value2 = scan.nextInt(); int value3 = scan.nextInt(); //입력
		
		if( value1 > value2 ) // 
			{int temp = value1; value1 = value2; value2 = temp;}
		if( value1 > value3 ) // 
			{int temp = value1; value1 = value3; value3 = temp;}
		if( value2 > value3 ) //
			{int temp = value2; value2 = value3; value3 = temp;}
			
		System.out.println( value1 );
		System.out.println( value2 );
		System.out.println( value3 );


				
//문제5 : 가위바위보 게임 구현하기.
//     - 가위가 '0' 이고 바위가 '1' 이고 보가 '2' 일때 플레이어1와 플레이어2 가 있습니다.
//     - 승리자 판단과 무승부 경우의수를 출력하시오.
//     [입력 조건] 플레이어1 과 플레이어2 에게 각각 입력을 받습니다.
//     [출력 조건] 플레이어1 이기면 ' 플레이어1 승리 ', 플레이어2 이기면 ' 플레이어2 승리 ' 무승부 이면 '무승부' 출력 하시오.
		System.out.println("[5] 가위 바위 보 !");
		
		int p1 =scan.nextInt(); int p2 =scan.nextInt(); // 매개변수는 넣으면 안됨
	
		
		
		
		System.out.println( p1 );
		System.out.println( p2 );
	
*/

//문제6 : 윤년/평년 판단하기
//   [ 입력조건 ] 하나의 연도를 입력 받습니다.
//   [ 윤년/평년 조건 ]
//   -연수가 4로 나누어 떨어지는 해는 윤년으로 한다.
//   -연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다.
//   -연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다.
//   [ 출력조건] '입력한OOOO년 은' 윤년 입니다.  혹은 평년 입니다 로 출력하시오.

//문제7 : 주차 사용요금 계산하기
//   [ 선언 변수 조건 ] 입차시간이 9시30분 입니다. 
//   - int 시 = 9;  int 분 = 30; 이와 같이 변수를 먼저 선언해주세요.
//   [ 출차시간 입력 조건 ] 출차시간의 시 와 분을 각 입력받아 각 변수에 저장하시오. 
//   [ 처리출력 조건 ] 1분당 1000원으로 계산하여 사용요금' 0000원' 을 출력하시오,
//   - 단 입차 시간 이전 으로 입력 할 경우에는 '출차시간 오류' 출력하시오.

//문제8 : 로그인 처리
//   [입력 조건] 아이디[문자열] 와 비밀번호[문자열] 를 입력받기
//   [처리출력 조건]
//   1. 아이디가 'admin' 이고 비밀번호가 '1234' 모두 동일하면 '로그인성공'
//   2. 아이디가 다르면 '아이디 정보가 일치하지 않습니다.'
//   3. 아이디는 일치하고 비밀번호가 다르면 '비밀번호 정보가 일치하지 않습니다'
//   [ 참고 ]
//   1. 문자열 비교시에는 == 같다 연산자 대신에 .equals() 함수를 이용해주세요.
//   예] 
//      String name = scan.next();
//      name =="admin" 대신에 name.equals( "admin" ) 사용.

//문제9 : 당첨번호 개수  찾기
//   [ 선언 변수 조건 ] int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9; 이와 같이 변수를 먼저 선언해주세요.
//   [ 입력 조건 ] 세개의 정수를 입력받아 각 변수에 저장하시오.
//   [ 출력 조건 ] 입력받은 세 정수 중에서 공1~공3 까지 동일한 번호 가 몇개 인지 출력하시오.
		 

		
// https://www.acmicpc.net/problem/2884
/*
 * 문제
상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.

상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.

이런 상근이를 불쌍하게 보던 창영이는 자신이 사용하는 방법을 추천해 주었다.

바로 "45분 일찍 알람 설정하기"이다.

이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다. 이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.

현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 알람 시간 H시 M분을 의미한다.

입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.

출력
첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)

예제 입력 1 
10 10
예제 출력 1 
9 25
예제 입력 2 
0 30
예제 출력 2 
23 45
예제 입력 3 
23 40
예제 출력 3 
22 55
출처*/		
	
			
				
	} // 메인 끝

} // 끝
