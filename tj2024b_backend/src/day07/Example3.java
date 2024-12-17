package day07;

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
public class Example3 { // p.s

	public static void main(String[] args) { //m.s
		// [5] 클래스 정의하기 , 샘플 객체 생성 , new연산자 : 객체 생성시 사용되는 연산자 
		Login p1 = new Login();	p1.Id="유저1"; 	p1.Password = 0; p1.Logsave = 1; p1.Ip = 1;
		Login p2 = new Login(); p2.Id="유저2";	p2.Password = 0; p2.Logsave = 2; p2.Ip = 1;
		Login p3 = new Login(); p3.Id="유저3";	p3.Password = 0; p3.Logsave = 3; p3.Ip = 1;
	
		 //String name = scan.next();
//	      name =="admin" 대신에 name.equals( "admin" ) 사용.
		
		
		while(true){ //w.s [1] 무한루프 
			System.out.print("아이디와 비밀번호를 입력해주세요. : "); 	// [2] 출력함수
			Scanner scan = new Scanner(System.in);				// [3] 입력객체 
			int choose = scan.nextInt();						// [4] 입력함수
			if( choose == 1 ) { // 유저 1 선택 
				if( p1.Logsave > 0 ) { // 로그인 할당량이 존재하면 로그인 성공
					p1.Logsave--;	p1.Ip++;
				}else { // 할당량이 존재하지 아니하면 로그인 실패
					System.out.println("로그인 실패.");
				}
			}else if( choose == 2 ) { // 유저 2 선택
				if( p2.Logsave > 0 ) { p2.Logsave--; p2.Ip++; } // 로그인 할당량이 존재하면 로그인 성공
				else { System.out.println("로그인 실패.");} // 할당량이 존재하지 아니하면 로그인 실패
				
			}else if( choose == 3 ) { // 유저 3 선택
				if( p3.Logsave > 0 ) { p3.Logsave--; p3.Ip++; } // 로그인 할당량이 존재하면 로그인 성공
				else { System.out.println("로그인 실패.");} // 할당량이 존재하지 아니하면 로그인 실패
				
		
				
			}
	} // w.e
		
	} // m.e
} // p.e
