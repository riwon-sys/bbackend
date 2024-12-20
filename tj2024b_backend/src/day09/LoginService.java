package day09;

import java.util.Scanner;

public class LoginService { // CS(LS)
	    /*
	     * 회원 객체가 사용하는 메소드 설계
	     * 보이드 (스캐너 스캔 , 배열선언)
	     * ㄴ ********************* 프린트 찍기
	     * 널 포인트 익셉션 ; 객체가 없기때문에 객체를 참조 할 수 없다 .
	     * 
	     * void1 
	     * boolean 땡땡 State = false;를 왜 넣었는지 생각해보기
	     * ㄴ for 문 위에 작성 / else 대신 사용 /
	     * 
	     *  void2 
	     *  cf. 컴퓨터는 로그인을 어떻게 인식할까?
	     *  불 차 바 쇼 인 롱 더 플롯;
	     *  == 기본타입을 비교 (디테일한건 메모리의 차이)
	     * 
	     * *  스 스 멤 멤;
	     * = 이퀄스를 써야 한다 
	     * 널은 리터럴이라서 이퀄스를 써도 안써도 무방하다.
	    */
	
/*	 내가 해본 것
		// 2. 메소드
		      // 1. 등록 메소드 , 실행조건 : , 매개변수 ; 반환값 :
		      void LoginAdd( Scanner scan , Login[] loginArray) {
		    		System.out.println("> 로그인 <"); int login = scan.next();
		    		System.out.print("아이디 : ");	String ID = scan.nextInt();
		    		System.out.print("비밀번호 : ");	int password = scan.nextInt();
		    		System.out.print("최대출력 : ");	int count = scan.nextInt();
		    		
		    		
		     void LoginAdd2( Scanner scan , Login[] loginArray)		   
		 * void1 
	     * boolean 땡땡 State = false;를 왜 넣었는지 생각해보기
	     * ㄴ for 문 위에 작성 / else 대신 사용 /
		    
		    // [*] 객체 생성하고 객체내 멤버변수 접근하여 입력받은 값 대입했다.
		    		Logins logins = new Logins();
		    		Logins.login = login; Logins.login = ID; Logins.login = password;
		    		Logins.login = count;
		    // [*] 배열에 저장하기
		    		for (int index = 0; index <= logins(배열).length -1 ; index++ ) {
		    			if(logins[index] == null) {
		    				logins[index] = login;
		    				break;
		    			}

		    // 2. 출력 메소드 
		  * void2  cf. 컴퓨터는 로그인을 어떻게 인식할까? // 반복문이 종료되고 나서 로그인 실패 기능 사용해야함 > boolean 땡땡 State = false;
		     
		    		void loignsPrint(login [] logins) {
		    			for( int index=0; index<= logins.length-1 ; index++) {
		    					if(logins[index]!= null) {
		    						System.out.printtf("아이디 %와 , 패스워드 : %가 "\n" , loginsArray[index].login , loginsArray[index].ID "
		    								+ ",loginsArray[index].password loginsArray[index].count);
		    					} // if end 
		    				}// for end
		    			} // f end 
		      }

}
*/