package day06; // 폴더

import java.util.Scanner;

public class Example2 { // c s

	public static void main(String[] args) { // m s
		// 과제3. 대기번호 발행 프로그램
		/*
		 * 문법 : 변수,입출력함수,연산자.제어문(조건문,반복문)
		 * 전화번호,인원수 를 입력받아서 저장 및 출력 구현
		 * 총 대기명단은 3개까지 가능 , 대기명단 1개당 전화번호,인원수 저장소(변수)2개필요 , 대기명단3개-->변수6개 필요
		 * 제출 : 깃주소 제출
		*/
		String 대기명단1= null; String 전화번호1 = null; int 인원수1 = 0; // null 이란? 참조값이 없다. 문자열이 없다.
		String 대기명단2= null; String 전화번호2 = null; int 인원수2 = 0; // 0 이란? 참조값이 없다. 숫자열이 없다.
		String 대기명단3= null; String 전화번호3 = null; int 인원수3 = 0;
		while(true) {
			System.out.println("===대기번호 발행 프로그램==="); // 출력함수 syso(c+s)
			System.out.println("1.대기등록 2.대기출력 3.대기수정 4.대기삭제 : ");
			
			Scanner scan =new Scanner( System.in ); // 입력함수 // 입력 객체 :Scanner 변수명 = new Scanner ( System.in );
			int 선택 = scan.nextInt(); // 입력 객체 : 변수명.nextXXX(); // 정의한 메뉴번호 선택받기 // 입력 받은 저장 값
			
			if( 선택 == 1) {System.out.println("===1.등록 선택===");
			   System.out.println("> 대기명단 : "); String wait = scan.next(); // > 입력받고 저장
			   System.out.println("> 전화번호 : "); String number = scan.next(); // > 입력받고 저장
			   System.out.println("> 인원수 : "); int waiter = scan.nextInt(); // > 입력받고 저장
			   if(대기명단1 == null) { 대기명단1 = wait; 전화번호1 = number; 인원수1 = waiter; }// - while 밖에 변수에 입력받은 3개의 문자열을 각 각 저장
			   else if(대기명단2== null) { 대기명단2 = wait; 전화번호2 = number; 인원수2 = waiter; } // 비어 있으면 2
			   else if(대기명단3== null) { 대기명단3 = wait; 전화번호3 = number; 인원수3 = waiter; } // 비어 있으면 3
			   else {System.out.println("==등록실패==");} 
			}
			
			else if ( 선택 == 2 ) { System.out.println("==등록성공==");
				System.out.println("===2.출력 선택===");
				System.out.println("> 대기명단 : " + 대기명단1 + "> 전화번호 : " + 전화번호1 + "> 인원수 : " + 인원수1 ); // 오류 이유 : 변수의 초기값(처음에 변수 만들 때 값을 넣는 행위;초기화)이 없음  
				// 초기값이 없다는 의미(쓰레기값;변수를 유지하기 위한 컴퓨터가 만든 임의값)
			if ( 대기명단1 != null )	{System.out.println("> 대기명단 : " + 대기명단1 + "> 전화번호 : " + 전화번호1 + "> 인원수 : " + 인원수1 );}
			if ( 대기명단2 != null )	{System.out.println("> 대기명단 : " + 대기명단2 + "> 전화번호 : " + 전화번호2 + "> 인원수 : " + 인원수2 );}
			if ( 대기명단3 != null )	{System.out.println("> 대기명단 : " + 대기명단3 + "> 전화번호 : " + 전화번호3 + "> 인원수 : " + 인원수3 );}
			}
	          		
			
		//	else if ( 선택메뉴 == 3 ) {System.out.println("===1.수정 선택===");}
		//	else if ( 선택메뉴 == 4 ) {System.out.println("===1.삭제 선택===");}
		}
	} // m e

} // c e
