package day03; // 폴더

public class Example3 { // 시작

	public static void main(String[] args) { // 메인 시작
	
		// [1] if문
		int age = 10;
		    // 만약에 나이가 8 이상이면 출력함수 실행한다.
		if( age >=8 ) { // if s 
			System.out.println("학교에 다닙니다.");
		} // if e
		
		
		// [2] if ~ else문
		if(age >=8 ) { // if s
			System.out.println("학교에 다닙니다.");
		}else { // 7 이하이면
			System.out.println("학교에 다니지 않습니다.");
		}
		
		// p95
		
		char gender ='f';
				if(gender =='f') {
					System.out.println("여성");
				}else {
				    System.out.println("남성");
				}
				
        // [3] if ~ else if
				
				/*
				    if(age >=8 ) { // if s
			             System.out.println("학교에 다닙니다.");
		            }else { // 7 이하이면
			             System.out.println("학교에 다니지 않습니다.");
		            }
				 */
				
				int charge;
				if(age <8) { // age가 8미만이면
				    charge = 1000;
				    System.out.println("미취학 아동입니다.");
				}else if (age < 14) {
					charge = 2000;
					System.out.println("초등학생 입니다.");
				}else if (age < 20) {
					charge = 2500;
					System.out.println("중.고등학생 입니다.");
				}else if (age >= 60){ // p98
					charge = 0;
					System.out.println("경로우대 입니다.");
				}else               { // 나머지 
		            charge = 3000;
		            System.out.println("성인 입니다.");
	            }
				System.out.println("입장료는 " + charge + "원 입니다.");
				
	   // if ~ elseif ( 다수 조건에 따른 하나의 결과실행문 ) vs if if ( 다수 조건에 따른 N개의 결과실행문 )
				
				// p100 , score 와 char형 변수 grade 를 사용하여 score 에 따른 grade 를 출력해보세요.
				
				
				int score = 78; //점수
				char grade; // 등급 
				if(score <=100 && score>= 90 ) { // 100 미만 이거나 90 이상
					grade ='a';
				}else if(score <89 && score>=80 ) { // 89 미만 이거나 80 이상 // score >=80
					grade ='b';
				}else if(score <79 && score>=70 ) { // 79 미만 이거나 70 이상 // score >=70
					grade ='c';
				}else if(score <69 && score>=60 ) { // 69 미만 이거나 60 이상 // score >=60
					grade ='d';
					
				}else {                             // 그 외 
					grade ='f';
				}
				System.out.println( score );
				System.out.println( grade );
					
				
	} // 메인 끝

} // 끝
