package day12.boardprogram7;

import java.util.Scanner;

public class MemberService { // cs
	
	//1. 멤버변수 //2. 생성자
	
		//3. 메소드(기능제공만 하는 메소드만 모아두는 곳)
		public void signUp(Scanner scan , MemberDto [ ] members) {
			System.out.println("아이디 : "); String id =scan.next();
			System.out.println("비밀번호 :"); String pwd =scan.next();
			System.out.println("닉네임 :"); String name =scan.next();
			
			// * 객체화 . 생성자 이용한 빠른 객체 생성
			MemberDto memberDto = new MemberDto(id ,pwd , name);
			// * 반복 활용한 회원목록에서 빈공간 찾기
			for(int index =0; index<=members.length-1; index++) {
				if(members[index] ==null) {
					members[index] =memberDto;
					System.out.println("가입 성공!!");
					return; // 함 수 종 료
				}
			}
		
		} // f e 1
	   
		public String login(Scanner scan , MemberDto [ ] members) { // void > String전환 
			System.out.println("아이디 : "); String id = scan.next();
			System.out.println("비밀번호 : "); String pwd = scan.next();
			// * 기존 회원 목록에서 방금 입력받은 값과 비교하여 동일 값을 찾기
			
			for(int index =0; index<=members.length-1; index++) {
				MemberDto memberDto = members[index];
				if(memberDto != null) {
					if(memberDto.getId().equals(id) && memberDto.getPwd().equals(pwd)) {
						System.out.println("로그인 성공");
						return memberDto.getId(); // 로그인 성공한 아이디 반환
					} // if e
				} // if e
			}// for e
			System.out.println("로그인 실패");
			return null; // 로그인 실패시 null 반환 // 반환값 return 사용
		} // f e 2

	
	
} // ce
