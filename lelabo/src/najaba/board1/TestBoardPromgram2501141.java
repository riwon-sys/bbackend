package najaba.board1;

import java.util.Scanner;

// 실습 1 : 게시판 프로그램
// 문법 : 변수, 입출력 함수, 연산자, 제어문(조건문/반복문)
// 제목, 내용, 작성자를 입력받아서 저장/출력/삭제/수정을 구현할 수 있다.
// 게시물 3개 저장하기, 게시물 1개당 제목, 내용, 작성자 저장소(변수) 3개 필요하고, 게시물 3개 생성 시 변수 9개 필요하다.

public class TestBoardPromgram2501141 {
	public static void main(String[] args) {
		
		//[6-1] 변수선언 , 기본타입[boolean char byte short int long float double] , 참조타입[String,Scanner등등]
		String 제목1 = null; String 내용1 = null; String 작성자1 = null;
		String 제목2 = null; String 내용2 = null; String 작성자2 = null;
		String 제목3 = null; String 내용3 = null; String 작성자3 = null;
	
		//[1] 반복문
		while(true) { 
		
		//[2] 출력함수
		System.out.println(" \n\n ===게시판 프로그램=== ");
		System.out.println("1.등록 2.출력 :");
		
		//[3] 입력함수
		    // 1. 입력객체 : Scanner 변수명 = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		    // 2. 입력객체를 이용한 입력함수 : 변수명.nextXXX();
		int 선택메뉴 = scan.nextInt(); // - 임의 정의한 메뉴번호(int) 입력받기 // - 입력받은 값저장
		
		//[4] 연산자 , == 같다 
		//[5] 조건문 , if(조건문){}
		if(선택메뉴 ==1) {System.out.println(">> 1.등록 선택 ");
		System.out.print(">제목 : "); String title = scan.next(); // 메시지(print) -> 입력(next) -> 저장(변수)
		System.out.print(">내용 : "); String content = scan.next(); // 메시지(print) -> 입력(next) -> 저장(변수)
		System.out.print(">작성자 :"); String writer = scan.next();  // 메시지(print) -> 입력(next) -> 저장(변수).
		
		
		
		
		//[7-1] 변수값에 따른 데이터 검사후 대입 // 첫번째 게시물이 비어 있으면 //[6-2] 변수값 수정
		if( 제목1 == null) { 제목1 = title; 내용1 = content; 작성자1 = writer; }     // while 밖 변수에 입력받은 3개의 문자열을 각각 저장
		else if( 제목2 == null) {제목2= title; 내용2 = content; 작성자2 = writer; }  // 두번째 게시물이 비어 있으면
		else if( 제목3 == null) {제목3 = title; 내용3 = content; 작성자3 = writer; } // 세번째 게시물이 비어 있으면
		else { System.out.println("※등록실패※ : 게시물 작성공간이 부족합니다.");}
		
	
  // etc
	} // i.e
		else if (선택메뉴 ==2) {System.out.println(">>2.출력 선택");	
		//[7-2] 변수값에 따른 데이터 검사후 출력 //[6-3] 변수값 호출 // +연결연산자 : "문자열"+변수명|"문자열"+변수명
		if (제목1 != null) {System.out.println(">제목 : "+제목1+" >내용 : "+내용1+" >작성자 : "+작성자1);}
		if (제목2 != null) {System.out.println(">제목 : "+제목2+" >내용 : "+내용2+" >작성자 : "+작성자2);}
		if (제목3 != null) {System.out.println(">제목 : "+제목3+" >내용 : "+내용3+" >작성자 : "+작성자3);}
		// 오류 이유 : 변수의 초기값이 없다 ( 처음에 변수 만들 때 값을 넣는 행위- 초기화) // 지역변수가 초기값이 없으면 호출이 불가능하다.
		  } // ie
		} //we
	} // me	
} // ce