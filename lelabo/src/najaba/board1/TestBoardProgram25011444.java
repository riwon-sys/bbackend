package najaba.board1;

import java.util.Scanner;

public class TestBoardProgram25011444 { // cs
	public static void main(String[] args) { // ms
		
		//[6] 변수 선언 , 기본타입[boolean char byte short int long float double] 참조타입[String Scanner 등등]
		String 제목1 = null; String 내용1 = null; String 작성자1 = null; // null : 참조값 내지 문자열이 없다
		String 제목2 = null; String 내용2 = null; String 작성자2 = null;
		String 제목3 = null; String 내용3 = null; String 작성자3 = null;
		
		
		//[1] while 반복문
		while(true) {// ws
			
			//[2] 출력함수
			System.out.println("\n======게시판 프로그램=====");
			System.out.print("1.등록 2.출력");
			
			//[3] 입력함수
			     // 1. 입력객체 : Scanner 변수명 = new Scanner(System.in);
			Scanner scan = new Scanner(System.in);
			     // 2. 입력객체 이용한 입력함수 : 변수명.nextXXX();
			int 선택메뉴 =scan.nextInt(); // 임의 정의한 메뉴번호(int) 입력받기 // 입력받은 값 저장하기
			
			//[4] 연산자 , == 같다 // [5] 조건문 , if(조건문) {}
			if(선택메뉴 == 1) {System.out.println(" 1.등록 선택 ");
				System.out.println("제목 : "); String title = scan.next();
				System.out.println("내용 : "); String content = scan.next();
				System.out.println("작성자 : "); String writer = scan.next();
			
			//[7-1] 변수값에 따른 데이터 검사 후 대입 // [6-2] 변숫값 수정 // while 밖 변수에 입력받은 3개의 문자열을 각각 저장
				if (제목1==null) {제목1 =title; 내용1=content; 작성자1 =writer;} // 첫번째 게시물이 비어 있으면
				if (제목2==null) {제목2 =title; 내용2=content; 작성자2 =writer;} // 두번째 게시물이 비어 있으면
				if (제목3==null) {제목3 =title; 내용3=content; 작성자3 =writer;} // 세번째 게시물이 비어 있으면
				else {System.out.println(" *등록실패* : 공간 부족 ");}
 // etc
			} // ie
			else if( 선택메뉴 ==2 ) {System.out.println(" 2.출력 선택 ");
			// [7-2] 변수값에 따른 데이터 검사 후 출력 //[6-3] 변수값 호출 // +연결연산자 : "문자열"+변수명+"문자열"+변수명...
			if(제목1 !=null ) {System.out.println("제목"+제목1+"내용"+내용1+"작성자"+작성자1);}
			if(제목2 !=null ) {System.out.println("제목"+제목2+"내용"+내용2+"작성자"+작성자2);}
			if(제목3 !=null ) {System.out.println("제목"+제목3+"내용"+내용3+"작성자"+작성자3);}
			 // 오류가 발생 할 수 있는 경우 : 변수의 초기값이 없을 경우에 오류가 발생 할 수 있다.
			} // ie
	  
		} // we
	} // me

} //ce
