package najaba.board2;

import java.io.StreamTokenizer;
import java.util.Scanner;

/*
* * 😊 순서도
/*
* 실습 2 : 게시판 프로그램
* (1) 문법 : 변수, 입출력 함수, 연산자, 제어문(조건문/반복문)을 나타내요.
* (2) 제목, 내용, 작성자를 입력받아서 저장|출력|삭제|수정을 구현할 수 있어요.
* (3) 게시물 3개를 저장해요. 게시물 1개당 객체 1개가 필요해요. 객체 1개당 3개의 멤버 변수를 가져요.

5. 클래스를 만들어요. 객체를 생성해요. 게시물을 만들기 위해 객체 3개를 생성해요.
// Tbp250115 생성

1. 반복문을 사용해요. // while(___)

2. 출력함수를 사용해요. // printIn(___)

3. 입력함수를 사용해요. // Scanner 변수명 = new Scanner(System.in); // 변수명.nextXXX();

4. 연산자를 사용해요. // == 같다 와 조건문, if를 사용해요.

6. - 있는지 확인해요. // == null : 비어있는지 확인해요.(같음 비교) // != null : 글이 있는지 확인해요.(다름 비교)
*/

public class TestBoardProgram2501153 {
	public static void main(String[] args) {
		//[5] 
		Tbp250115 tbp2501151 = new Tbp250115(); // Tbp250115 클래스 타입의 변수 tbp2501151을 선언해요. // new Tbp250115();를 통해 Tbp250115 클래스의 새로운 객체를 생성해요. // 생성된 객체의 주소값을 tbp2501151에 저장해요.
		Tbp250115 tbp2501152 = new Tbp250115();
		Tbp250115 tbp2501153 = new Tbp250115();
		
		//[1]
		while(true) {
			//[2]
			System.out.println("1.등록 2.출력 3.종료 :");
			//[3]
			Scanner scan = new Scanner(System.in); // 입력 받을 준비
			int choose =scan.nextInt();
			
			//[4]
			if( choose ==1) {System.out.println("등록 선택!");
			System.out.println("제목!"); String title =scan.next();
			System.out.println("내용!"); String content =scan.next();
			System.out.println("작성자!"); String writer =scan.next();
			
			// [6] - 있는지 확인해요. // == null : 비어있는지 확인해요.(같음 비교) // != null : 글이 있는지 확인해요.(다름 비교)
			if(tbp2501151.title==null) {
				tbp2501151.title=title; tbp2501151.content=content; tbp2501151.writer=writer;
			}else if(tbp2501152.title==null) {
				tbp2501152.title=title; tbp2501152.content=content; tbp2501152.writer=writer;
			}else if(tbp2501153.title==null) {
				tbp2501153.title=title; tbp2501153.content=content; tbp2501153.writer=writer;
			}
			} //ie
			
			else if(choose==2) {System.out.println("출력 선택!");
				if(tbp2501151.title !=null) {
					System.out.println("제목"+tbp2501151.title + "내용" + tbp2501151.content + "작성자" + tbp2501151.writer);
				}
				if(tbp2501152.title !=null) {
					System.out.println("제목"+tbp2501152.title + "내용" + tbp2501152.content + "작성자" + tbp2501152.writer);
				}
				if(tbp2501153.title !=null) {
					System.out.println("제목" + tbp2501153.title +"내용" + tbp2501153.content + "작성자" + tbp2501153.writer);
				}
			}
			
			else if(choose ==3) {System.out.println("종료!");
			scan.close();
			break;
			}
			
		}
	}

}
