package day11;

import java.util.Scanner;

public class MemberService { // c.s
	//  클래스 멤버
	// 1. 멤버변수
	// 2. 생성자
	// 3. 메소드 및 멤버함수
	   // 1. 등록함수 signup , 실행조건 : 주메뉴에서 1 입력시 , 매개변수 : 입력객체 / 로그인여부[] , 반환값 : 없음
	
	public void signup(Scanner scan , MemberDto[]memberArray) {
		System.out.println(">> sign up <<");
		System.out.print(" id : "); String id = scan.next();
		System.out.print(" password : "); String pw = scan.next();
		System.out.print(" name : "); String name = scan.next();
		
		// *********** 생성자를 이용한 객체 생성 *********** // // 객체를 만들때 초기화를 담당한다.
		MemberDto memberDto = new MemberDto( id , pw , name );
		// *********** 배열에 저장 ***********//
		
		boolean saveState = false; // for 문 작성 후 사용 
		
		for ( int index = 0; index <= memberArray.length -1; index++) { // index 0이면 배열은 1씩 증가가 반복한다. //  for문에는 배열함수 사용
			if( memberArray[index] == null) {
				memberArray[index] = memberDto;
				saveState = true; // for 문 작성 후 사용 
				break;
			} // i.e
		} // f.e
		
		if ( saveState ) {System.out.println(" Login successful ");}
		else {System.out.println(" Login failed ");}
	} // m.e

} // c.e
