package day09;

import java.util.Scanner;

/*  자바 조별과제1 ,
    주제 : 회원 서비스 구현하기 
       - 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체
       - 회원은 최대 3명 까지 저장할수 있다.
       - 회원정보는 아이디 , 비밀번호 , 닉네임을 갖습니다.
       - 회원클래스를 정의하고 회원객체 활용하여 구현한다.
       - 프로그램 초기 메뉴 : 1.회원가입 2.로그인 : 
          1 선택시 : 아이디,비밀번호,닉네임 3개의 각 정보를 입력받아 저장하기.
          2 선택시 : 아이디,비밀번호를 입력받아 기존의 저장된 정보와 일치한 정보가 있으면 '로그인성공' 아니면 '로그인실패' 출력한다.
   
   1. 코드 구현 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 
   2. 구현 된 코드에서 문법찾기 : 아래 링크의 각 슬라이드에서 조별 작성 , 카톡방 링크 참고
   
   
https://docs.google.com/presentation/d/1k7xc6I3MwnBI57zr1WTGm0mVgzQ5CXkmrEro2PFc9UI/edit?usp=sharing
 */

	
      public class Example2 { // cs
		// login Program
	      public static void main(String[] args) { //ps
	    	  
	    	  
	    	// (1) 예약 기능(함수) 을 제공하는 서비스 객체 생성 
	    	  LoginService ls = new LoginService();
	    	// (2) 게시물 객체 여러개를 저장하는 배열 생성 
	  		  Login[] loginArray = new Login[100]; // 로그인어레이 변수에 로그인 배열 100개 생성
	  		
	  		while(true) { // w s 무 한 루 프 // ws
				System.out.print("1.회원가입하기 2.로그인하기 : ");
				Scanner scan = new Scanner(System.in);
				int choose = scan.nextInt();
				if( choose == 1 ) {
					ls.loginAdd( scan , loginArray ); // (1) 객체를 통한 메소드 호출 
				}else if( choose == 2 ) {
					ls.waitingPrint( scan , loginArray  ); // (1) 객체를 통한 메소드 호출 
				}
			} // we
	} // pe
	} // ce