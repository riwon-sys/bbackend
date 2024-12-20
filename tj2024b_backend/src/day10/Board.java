package day10;

public class Board {
	// 클래스 멤버
		//1. 멤버변수
		
		
	String title;
	String content;
	String writer;
	
	//2. 생성자[옵션] : 객체 (new) 생성시 초기화(선택사항임) 담당하는 역할
	    // (1). 규칙 : 생성자명은 클래스명과 동일하다. 리턴값 x, 매개변수는 o . 생성자를 사용 할 경우에 매개변수의 타입 , 개수 일치 해야함
	    // (2). 디폴트 생성자 : 매개변수가 없는 생성자( > 주로 객체 생성시 매개변수를 받아 멤버변수에 대입 또는 유효성검사)
	       // ㄴ 매개변수명과 멤버변수명이 동일 하되 , 멤버변수명 앞에 this 를 붙인다.
	    // (3). 오버로드 : 원래는 동일명으로 여러개 선언 불가능 > 매개변수 * 개수 , 타입 , 순서가 * 다를 경우 오버로딩을 지원한다.
	    // (4). 주의할점 : 멤버변수가 많아지면 생성자 개수가 과도하게 늘어 날 수 있다.( > 관리 유지보수의 불편함 증대)
	    // (5). 사용경우 : 객체를 만들때 객체 내 멤버변수에 처음값을 대입하고자 할 때 생성자 생성
	       // ㄴ 객체가 많을때 , 상황에 따라 초기값이 다를 경우 , 상황에 따라 다양하게 생성자를 만들어준다.
	       // ㄴ 예 - 게시물 등록시 , 수정시 , 삭제시 필요한 생성자 
	         // ㄴ 문법xxx : * 객체 생성시 멤버변수 값들을 초기에 빠른 대입이 할 것이 있는지 판단 *
	
	Board(){}
    
	Board(String title){
    	this.title = title;
    }
	
	Board(String title , String content){
    	this.title = title; this.content = content;
    }
	
	Board(String title , String content ,String writer){
    	this.title = title; this.content = content; this.writer = writer;
    }
	
	//3. 메소드/멤버함수
} // c.e
