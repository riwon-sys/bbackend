package najaba.board2;

import java.util.Scanner;

/*
* * 😊 순서도
/*
* 실습 2 : 게시판 프로그램
* (1) 문법 : 변수, 입출력 함수, 연산자, 제어문(조건문/반복문)을 나타내요.
* (2) 제목, 내용, 작성자를 입력받아서 저장|출력|삭제|수정을 구현할 수 있어요.
* (3) 게시물 3개를 저장해요. 게시물 1개당 객체 1개가 필요해요. 객체 1개당 3개의 멤버 변수를 가져요.

5. 클래스를 만들어요. 객체를 생성해요. 게시물을 만들기 위해 객체 3개를 생성해요.
// Tbp250115 생성 // tbp25011151 , tbp25011152 , tbp25011153

1. 반복문을 사용해요. // while(___)

2. 출력함수를 사용해요. // printIn(___)

3. 입력함수를 사용해요. // Scanner 변수명 = new Scanner(System.in); // 변수명.nextXXX();

4. 연산자를 사용해요. // == 같다 와 조건문, if를 사용해요. // 제목,내용,작성자!

6. - 있는지 확인해요. // == null : 비어있는지 확인해요.(같음 비교) // != null : 글이 있는지 확인해요.(다름 비교)
*/
public class TestBoardProgram2501154 {
	public static void main(String[] args) {
		Tbp250115 tbp25011151 = new Tbp250115();
		Tbp250115 tbp25011152 = new Tbp250115();
		Tbp250115 tbp25011153 = new Tbp250115();
		
		while(true) {
			System.out.println("1.등록 2.출력 3.종료");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			
			if(choose ==1) {System.out.println(" 등록 선택! ");
			System.out.println("제목!");String title = scan.next();
			System.out.println("내용!");String content = scan.next();
			System.out.println("작성자!");String writer = scan.next();
			
			if(tbp25011151.title==null) {
				tbp25011151.title=title; tbp25011151.content=content; tbp25011151.writer=writer;
			} else if (tbp25011152.title==null) {
				tbp25011152.title=title; tbp25011152.content=content; tbp25011152.writer=writer;
			} else if (tbp25011152.title==null) {
				tbp25011153.title=title; tbp25011153.content=content; tbp25011153.writer=writer;
			}
			} //ie
			
			else if(choose ==2) { System.out.println(" 출력 선택! ");
				if(tbp25011151 !=null) {
					System.out.println("제목" + tbp25011151.title + "내용" + tbp25011151.content + "작성자" + tbp25011151.writer);
				}
				if(tbp25011152 !=null) {
					System.out.println("제목" + tbp25011151.title + "내용" + tbp25011151.content + "작성자" + tbp25011151.writer);
					
				}
				if(tbp25011153 !=null) {
					System.out.println("제목" + tbp25011153.title + "내용" + tbp25011153.content + "작성자" + tbp25011153.writer);
				}
			} // ie
			
			else if(choose ==3) {System.out.println(" 종료! ");
			scan.close();
			break;
			
			} //ie
		} //we 
	} //me
} // ce
