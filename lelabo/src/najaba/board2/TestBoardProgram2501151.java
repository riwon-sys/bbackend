package najaba.board2;

import java.util.Scanner;

/*
* 실습 2: 게시판 프로그램
* 1. 문법 : 변수, 입출력 함수, 연산자, 제어문(조건문/반복문) , 클래스/객체 실현합니다.
* 2. 제목, 내용, 작성자를 입력받아서 저장 출력 구현합니다.
* 3. 게시물 3개 저장해요, 게시물 1개당 객체 1개가 필요해요, 객체 1개당 3개의 멤버 변수를 가져요.
*/

public class TestBoardProgram2501151 {
	public static void main(String[] args) {
		
		//[5] 클래스 만들기 , 객체생성 , 게시물을 만들기 위해 객체3개를 생성
		    // Tbp250115 생성
		Tbp250115 tbp2501151 = new Tbp250115();
		Tbp250115 tbp2501152 = new Tbp250115();
		Tbp250115 tbp2501153 = new Tbp250115();
		
		// [1]반복문 , while(__)
		while(true) {
			
			// [2]출력함수 , printIn
		System.out.println("1.등록 2.출력 3.종료 :");
		   
		// [3] 입력함수 , Scanner
		Scanner scan = new Scanner(System.in);
		int choose =scan.nextInt();
		  
		//[4] 조건문 , if , 코드의 흐름제어
		if( choose ==1 ) { System.out.println("등록 선택!");
			System.out.println("> 제 목 <"); String title = scan.next();
			System.out.println("> 내 용 <"); String content = scan.next();
			System.out.println("> 작 성 자 <"); String writer = scan.next();
		
		//[6] 첫번째 객체의 내용물이 비어 있으면 대입  // == null : 비어있는지 확인 // != null : 글이 있는지 확인	
			
		if(tbp2501151.title ==null) {
			tbp2501151.title =title; tbp2501151.content =content;
			tbp2501151.writer =writer;
			
		}else if(tbp2501152.title==null){	
			tbp2501152.title =title; tbp2501152.content =content;
			tbp2501152.writer =writer;
		
		}else if(tbp2501153.title==null){	
			tbp2501153.title =title; tbp2501153.content =content;
			tbp2501153.writer =writer;
		}
			
		}//ie	
			
		else if( choose ==2) {System.out.println("출력 선택!"); 
		
		if(tbp2501151.title !=null) { // 첫번째 게시물이 비어 있지 않다면
			System.out.println("제목"+ tbp2501151.title +"/내용"+tbp2501151.content + "/작성자"+tbp2501151.writer);
		}
		if(tbp2501152.title !=null) { // 두번째 게시물이 비어 있지 않다면
			System.out.println("제목"+ tbp2501152.title +"/내용"+tbp2501152.content + "/작성자"+tbp2501152.writer);
		}
		if(tbp2501153.title !=null) { // 세번째 게시물이 비어 있지 않다면
			System.out.println("제목"+ tbp2501153.title +"/내용"+tbp2501153.content + "/작성자"+tbp2501153.writer);
		}
		}// i e
		  
		 
		else if (choose ==3 ) { System.out.println("종료!");
		scan.close();
		break;
		}
		
		} //we	
	} //me
} //ce
