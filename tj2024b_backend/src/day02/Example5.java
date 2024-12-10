package day02;

import java.util.Scanner;

public class Example5 { // 시작

	public static void main(String[] args) { // 메인시작
		// TODO Auto-generated method stub
		
		// JS DAY 10 연산자 문제 10개를 자바로 풀이하기
		Scanner scan = new Scanner(System.in); 
		//[1] 국,영,수 점수를 각 입력받아 각 변수에 저장하고 총점과 평균을 계산하여 출력하시오.
		System.out.println(" 국어점수 입력하세요 :"); // 메시지만 출력
		int 국어 = scan.nextInt( );
		System.out.println(" 영어점수 입력하세요 :"); // 메시지만 출력
		int 영어 = scan.nextInt( );	
		System.out.println(" 수학점수 입력하세요 :"); // 메시지만 출력
		int 수학 = scan.nextInt( );
		
		int 총점 = 국어 + 영어 + 수학;
		
		int 평균 = 총점 / 3;

		System.out.println(" 총점 :" + 총점); // 파란색 큰따옴표 안에 있는 문자 그자체로써 빨간색은 진짜 변수를 갖고있는 진자 / 메세지와 값을 출력
		System.out.println(" 평균 :" + 평균);
		
		
	/*
		String name1 ="국어"; int point1 = 70;
		String name2 ="영어"; int point2 = 50;
		String name3 ="수학"; int point3 = 30;
		System.out.printf( "과목은 %s 이고 점수는 %d 입니다." , name1 , point1); 
		System.out.printf( "과목은 %s 이고 점수는 %d 입니다." , name2 , point2); 
		System.out.printf( "과목은 %s 이고 점수는 %d 입니다." , name3 , point3);
		System.out.printf( "과목의 총점수는 %d 입니다." , point1+point2+point3);
		System.out.printf( "과목의 평균점수는 %d 입니다." , 3/point1+point2+point3);
		
		//[2] 반지름으 입력받아서 원넓이[반지름*반지름*3.14] 계산하여 출력하시오
		//String name1 ="원주율"; double value1 =3.14;
		
		String name4 = "원주율"; double 문자정수1 = 3.14;
	     System.out.println("글 정수 :" + 문자정수1);
	     
	      // [지문3] 두 실수를 입력받아서 앞 실수의 값이 뒤실수의 값의 비율% 계산하여 console탭에 출력하시오.
	      
	      // [지문4] 정수를 입력받아 입력받은 값이 홀수이면 true / 짝수이면 false 로 console탭에 출력하시오.
	            
	            //1.boolean 타입은 true 와 false 만 저장 할 수 있다.
				boolean bool1 = true;
				System.out.println("bool1 : + bool1"); // 기본틀 연결 연산자 ("문자열 : + 변수호출값 ");
				// boolean bool2 = 3; // 틀린 이유 : boolean 타입에는 3을 대입 할 수 없다.
				boolean bool2 = false;
				System.out.println("bool2 : + bool2");
	     
	      
	      // [지문5] 정수를 입력받아 입력받은 값이 7의 배수이면 true / 아니면 false 로 console탭에 출력하시오.
			     
				//1.boolean 타입은 true 와 false 만 저장 할 수 있다.
				boolean bool3 = true; //14
				System.out.println("bool3 : + bool3"); // 기본틀 연결 연산자 ("문자열 : + 변수호출값 ");
				// boolean bool2 = 3; // 틀린 이유 : boolean 타입에는 3을 대입 할 수 없다.
				boolean bool4 = false;  //15
				System.out.println("bool4 : + bool4");
	      // [지문6] 정수를 입력받아 입력받은 값이 홀수 이면서 7배수 이면 true / 아니면 false 로 console탭에 출력하시오.
			    
				//1.boolean 타입은 true 와 false 만 저장 할 수 있다.
				boolean bool5 = true;   //49
				System.out.println("bool5 : + bool5"); // 기본틀 연결 연산자 ("문자열 : + 변수호출값 ");
				// boolean bool2 = 3; // 틀린 이유 : boolean 타입에는 3을 대입 할 수 없다.
				boolean bool6 = false; // 50
				System.out.println("bool6 : + bool6");
	      
	   
	     
	     
	    
		
	     //[7] 십만원 단위의 금액을 입력받아 입력받은 금액의 지폐수를 출력하시오
	     String moneyname1 ="천원"; int money1 = 1000;
		 String moneyname2 ="만원"; int money2 = 10000;
		 String moneyname3 ="십만원"; int money3 = 100000;
		 System.out.printf( "총 금액은 %d 입니다." , 6*money1+5*money2+3*money3);
	   
	     
	     //[8] 1차 점수와 2차 점수를 각각 입력받아서 / 총점이 150점이면 합격 아니면 불합격으로 출력하시오.
		 //[8-1 불합격]
		 String name9 ="1차"; int point9 = 70;
		 String name10 ="2차"; int point10 = 75;
		 String name11 ="불합격";
		 System.out.printf( "과목의 총점수는 %d 입니다." , point9+point10);
	     System.out.printf("따라서 %s 입니다." , name11);
	     
	     //[8-2 합격]
		 String name12 ="1차"; int point12 = 90;
		 String name13 ="2차"; int point13 = 75;
		 String name14 ="합격";
		 System.out.printf( "과목의 총점수는 %d 입니다." , point12+point13);
	     System.out.printf("따라서 %s 입니다." , name14);
	     */
	     
	
	} // 메인 끝

} // 끝
