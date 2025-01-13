package day24;

import java.util.Scanner;

public class StringExample {
public static void main(String[] args) {
	
	// [1] 변수 몇개 ? 2개 / 자료 몇개 ? 1개
	      // 리터럴이란? 키보드로부터 입력받은 자료,상수풀이라는 곳에 이미 저장된 값
	int a = 3;
	int b = 3;
	System.out.println(a==b); // t
	// > 즉 서로 다른 두 변수는 같은 자료를 참조한다.
	
	// [1] 변수 몇개 ? 2개 / 자료 몇개 ? 1개
	int c= 5;
	int d = c;
	System.out.println(c==d); // t
	// > 즉 c가 참조하는 5를 d에 대입했다. 그러므로 c와d는 같은 자료를 참조한다.
	
	// [3] 변수 몇개 ? 2개 / 자료 몇개 ? 2개 (순수한 자료 3, 포장된 new Integer(인스턴스))
	Integer value1 =3;
	Integer value2 = new Integer(3); // 취소선 : 권장하지 않음.
	System.out.println(value1==value2); // f       // 단순 리터럴을 비교     // 스텍 값 비교
	System.out.println(value1.equals(value2)); // true // 인스턴스 안에 값을 비교 // 힙 값 비교
	
	// [4] String 클래스
	// (1) 배열을 이용한 문자열 표현
	char[] str1 = new char [] {'유','재','석'}; 
	// (2) "" 리터럴을 이용한 문자열 표현 (2번사용을 권장함 V)
	String str2 = "유재석";
	// (3) 생성자를 이용한 문자열 
	String str3 = new String("유재석");
	System.out.println(str2 == str3 ); // f
	System.out.println(str2.equals(str3)); // t
	
	String str4 = "유재석";
    System.out.println(str2 == str4);// true
    
    // [5] String 주요 메소드
	    
    // (1) 
	String str5 = "자바".concat("프로그래밍");
	System.out.println( str5 ); 	// 자바프로그래밍
		
	// (2) 
	StringBuilder builder = new StringBuilder();
	builder.append("자바");
	builder.append("프로그래밍");
	System.out.println( builder );	// 자바프로그래밍
		
	// (3) 
	String str6 = String.format("%s %s" , "자바" , "프로그래밍");
	System.out.println( str6 ); // 자바 프로그래밍
		
	// (4) 
	String str7 = "";
	str7 += "자바";		// 문자열1개 
	str7 += "프로그래밍";	// 문자열1개   
	System.out.println( str7 ); // 자바프로그래밍
    
    // (5) charAt(index)
    char gender = "012345-1230123".charAt(7);
	System.out.println( gender );	// 
	// [활용] .nextChar() 없는 이유는 .next().charAt(0) : 한글자 입력
	// Scanner scan = new Scanner(System.in);
	// char ch = scan.next().charAt(0); // 입력받은 문자열의 첫글자 추출
    
    // [활용] nextchar()가 없는 이유는 .next.charAt(0) : 한글자 입력 가능
    Scanner scan = new Scanner(System.in);
    char ch = scan.next().charAt(0); // 키보드로부터 입력받은 저희 문자열의 첫글자를 추출하겠습니다.
    
    // (6) length()
    System.out.println("012345-1230123".length()); // 14
    // [활용] 반복문 : 변수명.length()-1 [마지막 인덱스] 
    // 반복문 -1 을 하는 이유는 ?  길이는 14 이지만 인덱스는 0부터 13까지 이므로 반복문에 -1을 사용합니다.
    // // for( int index = 0 ; index <= 변수명.length()-1 ; index++ ){ }
    

 		
    // (7) replace(기존 문자열 , 새로운 문자열);
    String str8 = "자바프로그래밍".replace( "자바", "JAVA");
    System.out.println( str8 ); // JAVA프로그래밍
    // [활용] html(<br/>) --> java(\n)
 		String htmlData = "유재석<br/>안녕하세요.";
 		System.out.println( htmlData );  // 유재석<br/>안녕하세요.
 		String javaData = htmlData.replace("<br/>", "\n");
 		System.out.println( javaData );	
 		// 유재석
 		// 안녕하세요
	
} // m.e
} // c.e
