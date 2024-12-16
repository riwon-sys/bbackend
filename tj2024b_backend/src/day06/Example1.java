package day06; // 폴더

import java.util.Scanner;

public class Example1 { // 시작
   public static void main(String[] args) { // 메인 시작
		// 실습 1: 게시판 프로그램
		/* - 제목 , 내용 , 작성자를 입력받아서 저장,출력,삭제,수정 
		   - 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문,반복문)
		   - 순서 : 반복 - 출력(화면)-입력-조건문
		   - 게시물 3개 저장하기 위해서 필요한 것 : 게시물 1개당 제목,내용,작성자 의 저장소3개 필요 -> 총 9개 필요
		 */
	   // [6] 변수 
	         // [6-2] 변수 선언 ;	타입{논리(boolean) 문자(char) 정수(int) 실수(double)}
	    String 제목1 = null; String 내용1 = null; String 작성자1 = null; // null 이란? 참조값이 없다. 문자열이 없다
		String 제목2 = null; String 내용2 = null; String 작성자2 = null;
		String 제목3 = null; String 내용3 = null; String 작성자3 = null;
		// [1]
		while(true) { // 무한루프 ; 무한 반복 문
		// [2]	
			System.out.println("===게시판 프로그램==="); // 출력함수 syso(c+s)
			System.out.println("1.등록 2.출력 3.수정 4.삭제 : ");
		// [3] 	
			Scanner scan =new Scanner( System.in ); // 입력함수 // 입력 객체 :Scanner 변수명 = new Scanner ( System.in );
		int 선택메뉴 = scan.nextInt(); // 입력 객체 : 변수명.nextXXX(); // 정의한 메뉴번호 선택받기 // 입력 받은 저장 값
		// [4] 	연산자 , ==같다
		// [5]  조건문
		
		if(선택메뉴 == 1) {System.out.println("===1.등록 선택===");
		   System.out.println("> 제목 : ");  String title = scan.next(); // > 입력받고 저장
		   System.out.println("> 내용 : ");  String content = scan.next(); // > 입력받고 저장
		   System.out.println("> 작성자 : "); String writer = scan.next(); // > 입력받고 저장
		   if(제목1 == null) { 제목1 = title; 내용1 = content; 작성자1 = writer; }// - while 밖에 변수에 입력받은 3개의 문자열을 각 각 저장
		   else if(제목2== null) { 제목1 = title; 내용1 = content; 작성자1 = writer; } // 비어 있으면 2
		   else if(제목3== null) { 제목2 = title; 내용2 = content; 작성자2 = writer; } // 비어 있으면 3
		   else {System.out.println("==실패==");} 
		}
		
		else if ( 선택메뉴 == 2 ) { System.out.println("==성공==");
			System.out.println("===2.출력 선택===");
			System.out.println("> 제목 : " + 제목1 + "> 내용 : " + 내용1 + "> 작성자 : " + 작성자1 ); // 오류 이유 : 변수의 초기값(처음에 변수 만들 때 값을 넣는 행위;초기화)이 없음  
			// 초기값이 없다는 의미(쓰레기값;변수를 유지하기 위한 컴퓨터가 만든 임의값)
		if ( 제목1 != null )	{System.out.println("> 제목 : " + 제목1 + "> 내용 : " + 내용1 + "> 작성자 : " + 작성자1 );}
		if ( 제목2 != null )	{System.out.println("> 제목 : " + 제목2 + "> 내용 : " + 내용2 + "> 작성자 : " + 작성자2 );}
		if ( 제목3 != null )	{System.out.println("> 제목 : " + 제목3 + "> 내용 : " + 내용3 + "> 작성자 : " + 작성자3 );}
		}
          		
		
	//	else if ( 선택메뉴 == 3 ) {System.out.println("===1.수정 선택===");}
	//	else if ( 선택메뉴 == 4 ) {System.out.println("===1.삭제 선택===");}
		}	
	} // 메인 끝
} // 끝
