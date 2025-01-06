package day11;

import java.util.Scanner;

/*
 * // 순서 메인 보드프로그램 While 생성 > DTO 생성 Get 및 Setter 생성 ;  > 다시 while 상단으로 돌아와 DTO ARR 생성 > 
// Service 클래스 생성 > while 상단 Service 작성 후 하단 if choose 아래에 Add 작성 및 else if 아래 Print
 * 
 * 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수/메소드)/객체 , 배열 , 접근제한자를 이용(get,set)
 * 회원제 게시판
 * 
 * 초기메뉴 로그인 과 회원가입 제공
 * 로긴성공 > 게시물 등록과 게시물 출력제공
 * 단, 게시물 등록시 작성자를 현재 로그인된 회원아이디로 자동 등록
 * 
 * 화면 프린트 > 메모리 클래스 > 함수 설꼐.(서비스).....

// 참고자 :hanu1229 

// 순서
 * 화면 프린트 > 메모리 클래스 > 함수 설꼐.(서비스).....
// 1. 구현하고자하는 초기 화면 구성 
// 2. (객체)클래스 설계 , 메모리 설계 : Member클래스 , id/pw/name
// 3. 메소드 구성 : MemberService클래스 , signup() , login()
 
 */
public class Example1 { // c.s
	public static void main(String[] args) { // m.s
		
		MemberDto[] memberArray = new MemberDto[100];// 로그인 관련 배열 기능을 선언합니다. 
	    MemberService ms = new MemberService();// 로그인 관련 배열 기능을 제공하는 객체를 생성합니다.
	    
	    BoardDto[] boardArray = new BoardDto[100]; // 게시판 관련 배열 기능을 선언합니다.
	    BoardService bs = new BoardService(); // 게시판 관련 배열 기능을 제공하는 객체를 생성합니다.
	    
	    
		
	    while (true) { // 무 한 루 프 를 실행합니다.
	    	System.out.print("1.회원가입 2.로그인 : ");  // 입력기능을 준비합니다.
			Scanner scan = new Scanner(System.in);  // 입력기능을 준비합니다.
	    	int choose =scan.nextInt();
	    	if( choose ==1 ) {
	    		
	    	}else if ( choose==2 ) {
	    		
	    	}
	    }
		
	} // m.e

}// c.e
