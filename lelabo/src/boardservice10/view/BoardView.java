package boardservice10.view;

import java.util.ArrayList;
import java.util.Scanner;

import boardservice10.controller.BoardController;
import boardservice10.controller.MemberController;
import boardservice10.model.dto.BoardDto;
import boardservice10.model.dto.MemberDto;
import day10.Board;

public class BoardView {
	// + 싱글톤 
	private static BoardView instance = new BoardView();
	private BoardView() {}
	public static BoardView getInstance() { return instance;} 
	
	private Scanner scan = new Scanner(System.in);
	
	// 0. (로그인 했을때) 메인 메뉴 메소드 // 로그아웃시 탈출 
	public void index() {
		while(true) {
			findAll();// + 게시물 전체조회 
			System.out.print("[ 1.로그아웃 2.내정보 3.게시물작성 4.게시물상세보기 ] : ");
			int choose = scan.nextInt();
			if( choose == 1 ) { MemberView.getInstance().logout(); break; }
			else if( choose == 2 ) { 
				int state = MemberView.getInstance().myInfo();
				if( state == 0 ) { return; }
			}
			else if( choose == 3 ) { write(); }
			else if( choose == 4 ) { findById(); }
		}// w end 
	} // f end 
	
	// 1. 전체 게시물 조회 화면 
	public void findAll() {
		// 1. 컨트롤러 에게 요청하고 결과를 받는다.
		ArrayList< BoardDto > result = BoardController.getInstance().findAll();
		// 2. 결과에 따른 출력
		System.out.println("번호\t카테고리\t작성자\t작성일\t\t\t제목");
		for( int index = 0 ; index<=result.size()-1 ; index++ ) {
			// - index는 0부터 리스트의 마지막 인덱스(요소개수-1) 까지 1씩 증가 반복  
			BoardDto boardDto = result.get(index); // index번째의 요소 객체를 꺼내기
			System.out.print( boardDto.getBno() + "\t" );	
			System.out.print( boardDto.getCname() + "\t" );
			System.out.print( boardDto.getMid() + "\t" );
			System.out.print( boardDto.getBdate() + "\t" );
			System.out.print( boardDto.getBtitle() + "\n" );	
		} // for end 
	} // f end
	
	// 2. 개별(1개) 게시물 조회 화면 
	public void findById() {
		System.out.print(">> 게시물 번호 "); 	int bno = scan.nextInt();	// 0. 입력받기 
		// 1. 컨트롤러 에게 요청하고 결과를 받는다.
		BoardDto result = BoardController.getInstance().findById( bno );
		// 2. 결과
		System.out.println( result.getCname()+"\t"+result.getMid()+
				"\t"+result.getBview()+"\t"+result.getBdate() );
		System.out.println( result.getBtitle() );	
		System.out.println( result.getBcontent()  );
		// -- 추후에 댓글 출력되는 코드 
		while( true ) {
			System.out.print( "1.뒤로가기 2.댓글작성(구현x) 3.수정 4.삭제 : ");
			int choose = scan.nextInt();
			if( choose == 1 ) { break; } // 뒤로가기.
			else if( choose == 2 ) { } // x
			else if( choose == 3 ) { update( result.getBno() ); }
			else if( choose == 4 ) { delete( result.getBno() ); }
		} // w end 
	} // f end 
	
	// 5. 게시물 수정 작성 화면 
	public void update(  int bno ) { 
		System.out.println("새로운 제목 : "); 	String btitle = scan.next();
		System.out.println("새로운 내용 : ");	String bcontent = scan.next();
		BoardDto boardDto = new BoardDto();
		boardDto.setBno( bno );
		boardDto.setBtitle(btitle); boardDto.setBcontent(bcontent);
		boolean result = BoardController.getInstance().update( boardDto );
		if( result ) { System.out.println("수정 성공");}
		else { System.out.println("수정 실패");}
	} // f end 
	
	// 6. 게시물 삭제 작성 화면 
	public void delete( int bno  ) { 
		boolean result =  BoardController.getInstance().delete( bno );
		if( result ) { System.out.println("삭제 성공"); }
		else { System.out.println("삭제 실패");}
	} // f end 
	
	// 3. 게시물 작성 화면 
	public void write( ) { 
		categoryAll( ); // 카테고리 전체 조회 
		System.out.print("카테고리 번호 : ");		int cno = scan.nextInt();
		System.out.print("제목 : ");				String btitle = scan.next();
		System.out.print("내용 : ");				String bcontent = scan.next();
		BoardDto boardDto = new BoardDto();
		boardDto.setCno(cno); 
		boardDto.setBtitle(btitle); 
		boardDto.setBcontent(bcontent);
		boolean result = BoardController.getInstance().write( boardDto );
		if( result ) { System.out.println("글쓰기 성공"); }
		else { System.out.println("글쓰기 실패"); }
	} // f end 
	
	// 4. 카테고리 전체 조회 화면
	public void categoryAll( ) {
		ArrayList< BoardDto > result = BoardController.getInstance().categoryAll();
		for( int index = 0 ; index <= result.size() - 1 ; index++ ) {
			BoardDto boardDto = result.get(index);
			System.out.printf("번호 : %d  카테고리명 : %s \n" ,
					boardDto.getCno() , boardDto.getCname()  );
		} // for end 
	} // f end 
	
} // class end 





















