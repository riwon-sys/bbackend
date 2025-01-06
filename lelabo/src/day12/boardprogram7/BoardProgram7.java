package day12.boardprogram7;

import java.util.Scanner;

/*

자바 과제11 : 회원제 게시판 boardprogram7;
	- 초기메뉴는 로그인 과 회원가입 를 제공한다. 
	- 로그인 성공하면 게시물등록과 게시물출력 를 제공합니다.
		- 단 게시물 등록시 작성자를 현재 로그인된 회원아이디로 자동 등록 됩니다.
		
1. 프런트적인 부분 즉 보이는 화면적인 것 을 시각화할 것 왜? 보이는 게 없으면 알 기 힘들기 때문에
- 시각화 요소 구성, console에 표현하고 싶은 내용물 vs html / css

2. 메모리(저장) 구성 
- 클래스 vs 엑셀 표
3. 함수 및 기능 설계
- 메소드 vs 함수 구성 

*/

public class BoardProgram7 {// cs

	public static void main(String[] args) {// ms

		// 공통으로 사용되는 저장소변수를 모아 두는 곳
		MemberDto[] members = new MemberDto[100]; // 고유한 것
		MemberService ms = new MemberService(); // 단순 서비스 제공 // 재사용 가능

		String loginId = null;
		// // 단순 서비스 제공 // 재사용 가능 // [로긴 x > null 저장 , 로그인 o > 아이디 저장] ,
		// 목적으로 운영 할 변수

		BoardDto[] boards = new BoardDto[100];
		// 게시판 데이터를 저장할 공간을 준비 하는 , 배열은 데이터를 담는 그릇을 만드는 것

		BoardService bs = new BoardService();
		// 게시판과 관련된 작업을 처리하는 객체 , 서비스 객체는 데이터를 관리하는 작업을 하는 도구를 만드는 것

		while (true) {// ws // 이 부분은 무한 반복문 입니다. true 는 항상 참이기 때문에 반복문이 계속해서 실행됩니다.
			// 사용자가 선택할 때가지 계속해서 동작을 유지하게 됩니다.

			System.out.println("\n 1.가입 2.로그인"); // 프로그램이 시작되면 사용자에게 1.가입 또는 2 로그인을 선택하라고 묻습니다.
			Scanner scan = new Scanner(System.in); // 사용자가 입력한 값을 choose 변수에 저장하고, 그 값에 따라 다른 작업을 수행합니다.
			int choose = scan.nextInt();
			if (choose == 1) { // ==1 가입 선택시 // 회원가입 함수 호출 // 사용자가 1을 선택하면
				ms.signUp(scan, members); // 해당 함수가 호출됩니다.
			} // 이 함수는 사용자의 정보를 받아서 members리스트(또는 배열)에 저장하는 역할을 할 것 입니다.

			else if (choose == 2) { // ==2 로그인 선택시 // 로그인 함수 호출 // 사용자가 2를 선택하면
				loginId = ms.login(scan, members); // 해당 함수가 호출 됩니다.
				if (loginId != null) { // 만약 로그인이 성공하면 loginId에 사용자 아이디가 저장됩니다.
					// 로그인의 성공여부는 loginId 가 null 인지? 아닌지? 로 확인가능 합니다.

					while (true) { // 로그인이 성공한 후 또 다른 메뉴가 나옵니다.

						System.out.println("1.등록 2.출력 3.로그아웃");
						int choose2 = scan.nextInt();
						// 사용자는 1. 글쓰기 2. 출력 3. 로그아웃 중에서 원하는 것을 선택할 수 있습니다.
						if (choose2 == 1) { // 1. 글쓰기
							bs.boardAdd(scan, boards, loginId); // 해당 함수를 호출 합니다.
						} // 이 함수는 로그인한 사용자의 아이디와 함께 글을 작성하게 됩니다.
						else if (choose2 == 2) { // 2. 출력
							bs.boardPrint(boards); // 해당 함수를 호출 합니다.
						} // 이 함수는 저장된 글들을 출력합니다.
						else if (choose2 == 3) { // 3. 로그아웃
							loginId = null; // 해당 함수를 호출 합니다.

							break; // 해당 함수를 호출합니다.
							// 가 장 가까운 반복문을 종료하고 다시 처음 로그인 또는 가입 메뉴 상태로 돌아가게 됩니다.
						} // 이 함수는 사용자가 로그아웃 선택하면 로그인 상태를 해제 합니다.

					} // w e
				} // if e
			} // else if e // 로그인 함수 호출
		} // we

	}// me
}// ce

/*
 * // BoardProgram7의 전체적인 흐름 ㄴ1. 프로그램이 시작되면 회원가입(1)* 또는 로그인(2)** 을 선택하는 메뉴가
 * 출력됩니다. ㄴ2. 사용자가 회원가입(1)*을 선택하면 , 회원가입 절차가 진행됩니다. ㄴ3. 사용자가 로그인(2)**을 선택하면 ,
 * 로그인 절차가 진행되고 , 로그인에 성공하면 게시판 메뉴(글쓰기/출력/로그아웃)로 넘아갑니다. ㄴ4. 게시판 메뉴에서ㅗ 글을 작성하거나
 * 출력할 수 있고, 로그아웃하면 다시 로그인 또는 회원가입 메누로 돌아옵니다.
 * 
 * // BoardProgram7의 요약 이 코드는 회원가입과 로그인 기능을 제공하고, 로그인 후 게시판에 글을 작성하거나 출력하고 .
 * 로그아웃 할 수 있는 시스템을 제공합니다. 로그인 상태에 따라 게시판 메뉴를 제공하고 , 로그아웃 시 다시 로그인 또는 가입 메뉴로
 * 돌아가는 구조입니다.
 */
