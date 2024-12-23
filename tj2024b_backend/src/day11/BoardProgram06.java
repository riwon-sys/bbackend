package day11;
// 순서 메인보드프로그램 와일문생성 > 보드디티오 생성 게터 및 셋터  > 다시 와일문 상단으로 돌아와서 보드디티오 배열 생성 > 
// 보드서비스 클래스 생성 > 와일문 상단 보드서비스 작성 후 하단 이프 츄즈 바로 아래에 보드에드 작성 및 엘스이프츄즈 바로 아래 보드프린트 작성
import java.util.Scanner;
// (1) main 함수를 갖는 프로그램 실행 클래스
public class BoardProgram06 { // c.s
     
	public static void main(String[] args) { // m.s
		
		// * 
		
	  BoardDto[] boards = new BoardDto[100] // dto 배열 100개 생성 
	  BoardService bs = new BoardService();		  
		
		while(true) { // w.s 무 한 루 프
			System.out.println("1.등록 2.출력 : ");
			Scanner scan = new Scanner(System.in); //?
			
			int choose = scan.nextInt();
			if( choose == 1 ) {
				bs.BoardAdd(scan , boards);
				
			    // 등 록 함 수 호 출
			
			}else if( choose == 2 ) {
				bs.BoardPrint(boards);
				
				// 출 력 함 수 호 출
			} // if end
			
			
		} // w.e
	
} // m.e
} // c.e
