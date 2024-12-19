package day09;

import java.util.Scanner;

public class WaitingService { // cls
	// 1. 멤버변수 
	
	 
	// 2. 메소드
	      // 1. 명단등록 메소드 , 실행조건 : , 매개변수 ; 반환값 :
	      void waitingAdd( Scanner scan , Waiting[] waitings) {
	    		System.out.println("> 게시물 등록합니다."); String phone = scan.next();
	    		System.out.print("제목 : ");		int count = scan.nextInt();
	     
	     // [*] 객체 생성하고 객체내 멤버변수 접근하여 입력받은 값 대입했다.
	    		Waiting waiting = new Waiting();
	    		Waiting.phone = phone; waiting.count = count;
	    		
	     // [*] 배열에 저장하기
	    		for (int index = 0; index <= waitings.length -1 ; index++ ) {
	    			if(waitings[index] == null) {
	    				waitings[index] = waiting;
	    				break;
	    			}
	    		}
	    		
    // 2. 명단 출력 메소드
	void waitingPrint(Waiting [] waitings) {
		for( int index=0; index<= waitins.length-1 ; index++) {
			if(waitings[index]!= null) {
				System.out.printtf("인원수 %d명 , 연락처 : %s "\n" , waitingArray[index].count , waitingArray[index].phone);
			} // if end 
		}// for end
	} // f end 
	  
	    	  
	 
						
		
		
	} // m end 
} // cl e 


