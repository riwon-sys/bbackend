package najaba.board1;

import java.util.Scanner;

/*
* 실습 1 : 게시판 프로그램
* 문법 : 변수, 입출력 함수, 연산자, 제어문(조건문/반복문)
* 제목, 내용, 작성자를 입력받아서 저장|출력|삭제|수정을 구현할 수 있다.
* 게시물 3개를 저장할 수 있다 / 게시물 1개당 제목|내용|작성자 저장소(변수) 3개가 필요하다 / 게시물 3개에 필요한 변수는 총 9개이다.
*/
public class TestBoardProgram2501143 { //cs
	public static void main(String[] args) { //ms
		
		//[6-1] 변수선언 , 기본타입 [boolean char byte short int long float double] , 참조타입[String,Scanner 등등]
		String 제목1 = null; String 내용1 = null; String 작성자1 = null;
		String 제목2 = null; String 내용2 = null; String 작성자2 = null;
		String 제목3 = null; String 내용3 = null; String 작성자3 = null;
		
		//[1] 반복문 , while 무 한 루 프 , // ws
		while(true) {
			
			//[2] 출력함수 ,syso+컨트롤+스페이스바
			System.out.println( " \n\n===게시판 프로그램=== ");
			System.out.println(" 1.등록 2.출력 ");
			
			//[3] 입력함수
			    //1. 입력객체 : Scanner 변수명 = new Scanner( System.in );
			Scanner scan = new Scanner(System.in);
			    //2. 입력객체 이용한 입력함수 : 변수명.nextXXX();
			int 선택메뉴 = scan.nextInt(); // 임의로 정의한 메뉴번호(int) 입력받기 // > 입력받은 값 저장
			
			//[4] 연산자 , == 같다 [5] 조건문 , if(조건문){ }
			if(선택메뉴==1) {System.out.println(" 1.등록선택 ");
			System.out.print(" 제목 : "); String title = scan.next(); // 메시지(print) > 입력(next) > 저장(변수)
			System.out.print(" 내용 : "); String content = scan.next(); // 메시지(print) > 입력(next) > 저장(변수)
			System.out.print(" 작성자 : "); String writer = scan.next(); // 메시지(print) > 입력(next) > 저장(변수)
			
			//[7-1] 변수값에 따른 데이터 검사 후 대입하기 // [6-2] 변수값 수정하기 // while 밖 변수에 입력받은 3개의 문자열을 각각 저장한 상황
			if(제목1 ==null) { 제목1 = title; 내용1 = content; 작성자1 = writer;} // 첫번째 게시물이 비어 있으면
			else if(제목2 ==null) { 제목2 = title; 내용2 = content; 작성자2 = writer;} // 두번째 게시물이 비어 있으면
			else if(제목3 ==null) { 제목3 = title; 내용3 = content; 작성자3 = writer;} // 세번째 게시물이 비어 있으면
			else { System.out.println("** 등록 실패 : 공간부족 **");}
			}//ie
 // etc			
			else if(선택메뉴==2) {System.out.println(" 2.출력선택 ");
			//[7-2] 변수값에 따른 데이터 검사후 출력하기 // [6-3] 변수값 호출하기 // +연결연산자 : "문자열"+변수명+"문자열"+변수명+"문자열"+변수명
			if(제목1 !=null) {System.out.println("제목" + 제목1 + "내용" + 내용1 + "작성자" + 작성자1);}
			if(제목2 !=null) {System.out.println("제목" + 제목2 + "내용" + 내용2 + "작성자" + 작성자2);}
			if(제목3 !=null) {System.out.println("제목" + 제목3 + "내용" + 내용3 + "작성자" + 작성자3);}
			// 오류가 발생하는 이유 : 변수의 초기값이 없다(처음에 변수 만들때 값을 넣는 행위) // 지역변수는 초기값이 없으면 호출이 불가능하다.
			} //ie
			
		} //we
		
		
	} //me

} //ce
