package day11;

import java.util.Scanner;

public class BoardService {
	// 클래스 멤버
		// 1. 멤버변수 
		
		// 2. 생성자
		
		// 3. 메소드/멤버함수
			// 1. 등록 함수 boardadd , 실행조건 : 주메뉴에서 1입력시 , 매개변수 : 입력객체 / 게시물목록[] , 반환값 : 없음
		void boardAdd( Scanner scan , BoardDto[] boards ) {
			System.out.println("제목 : "); String title = scan.next();
			System.out.println("내용 : ");	String content = scan.next();
			System.out.println("작성자 : ");	String writer = scan.next();
			
			// *********** 생성자를 이용한 객체 생성 *********** // // 객체를 만들때 초기화를 담당한다.
			BoardDto boardDto = new BoardDto( title , content , writer ); 
			// *********** 배열에 저장 ***********//
			
			boolean saveState = false; // 왜 사용하는지?  // for문 작성 이후 작성 
			
			for( int index = 0 ; index <= boards.length -1 ; index++ ) { // fs
				if( boards[index] == null ) { // is
					boards[index] = boardDto;
					saveState = true;
					break;
				} // ie
			} // fe
	
		if ( saveState ) {System.out.println("등록성공");}
		else {System.out.println("등록 실패");}
		}
		
			// 2. 출력 함수 boardPrint , 실행조건 : 주메뉴에서 2입력시 , 매개변수 : 게시물목록[] , 반환값 : 없음
		void boardPrint( Board[] boards ) {
			for( int index = 0 ; index <= boards.length - 1 ; index++ ) {
				if( boards[index] != null ) {
					System.out.printf("순번 : %d , 제목 : %s , 내용 : %s , 작성자 : %s \n" ,
boards[index].gettitle() ,
boards[index].getcontent() , 
boards[index].getwriter());
				
				}
			}
		}

	} // class end 




