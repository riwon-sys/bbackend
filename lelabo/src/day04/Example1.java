package day04; // 폴더명

public class Example1 { // 시작

	public static void main(String[] args) { // 메인시작
		//p102 switch 예제1
		
		/*
		   switch(조건 /조건검사 대상){
		   case 값1
		        실행문;
		        break;
		  }
		  - break : switch 종료 , 만일 break가 없다면 아래 case 의 실행문이 실행된다.
		  */
		
		int ranking = 1;
		char medalcolor;
	   
		switch( ranking ) { // swich (조건)  case 값 1 : 실행문; } // 예제 1 시작
			case 1 :
				medalcolor = 'g';
				break;
			case 2 :
				medalcolor = 's';
				break;
			case 3 :
				medalcolor = 'b';
				break;
			default :
				medalcolor = 'a';
				
		} // 예제1 끝
		System.out.println("매달의 색깔은  : "  + medalcolor);
		
		//p104 switch 예제2
		
		int month =10;
		int day;
		switch( month ) { //예제2 시작
		
		   case 1 :
		   case 3 :
		   case 5 :
		   case 7 :
		   case 8 :
		   case 10 :
		   case 12 :
		        day = 31;
		        break;
		   
		   case 4 :
		   case 6 :
		   case 9 :
		   case 11 :
		        day = 30;
		        break;
		   
		   case 2 :
			    day = 28;
			    break;
	  } // 예제2 끝
		
		
		//p105 case문에 문자열 사용하기 예제3
		
		String medal = "gold";
		
		switch( medal ) {
		case "gold" :
			System.out.println("금메달입니다.");
			break;
		case " silver" :
			System.out.println("금메달입니다.");
			break;
		case "bronze" :
			System.out.println("금메달입니다.");
			break;
		default :  // 그외 기타
			System.out.println("메달이 없습니다.");
			break; // 생략 가능
	    }
         // 예제4 if는 조건결과의 논리(t/f) 제어 , switch 는 조건결과의 값(value case) 제어
		int score = 80;
		// switch ( score >=80 ) {} : 조건문에 논리연산, 비교 연산에 따른 논리 결과 케이스가 아니다.
		// switch( score ) {
		// case  score >=80 : System.out.println("합격"); : 
		// }
		
		//p106 나혼자코딩 예제4
		
		String a5 = "5층 헬스클럽";
		switch(a5) {
		case "1층 약국" :
			System.out.println("1층 약국입니다.");
			break;
		case "2층 정형외과" :
			System.out.println("2층 정형외과입니다.");
			break;
		case "3층 피부과" :
			System.out.println("3층 피부과입니다.");
			break;
		case "4층 치과" :
			System.out.println("4층 치과입니다.");
			break;
		case "5층 헬스클럽" :
			System.out.println("5층 헬스클럽입니다.");
			break;
		default :  // 그외 기타
			System.out.println("관계자외 출입금지.");
			break; // 생략 가능	
		}
		
		
		// if ~ else if
		 
	   /* int nf =5;
	     if(nf ==1){
	     System.out.println("1층 약국입니다.");
	     }else if(nf==2){
	     System.out.println("2층 정형외과입니다.");
	     }else if(nf==3){
	     System.out.println("3층 피부과입니다.");
	     }else if(nf==4){
	     System.out.println("4층 치과 입니다.");
	      }else if(nf==5){
	     System.out.println("5층 헬스클럽입니다.");
	     }else {
	     System.out.println("관계자외 출입금지.");
	     }
	    */
				
	} //메인 끝

} // 끝
