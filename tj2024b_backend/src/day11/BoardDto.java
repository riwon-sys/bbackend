package day11;
// (2) 게시물정보를 갖는 객체의 설계 클래스 // 주 석 치 고 클 래 스 설 계
public class BoardDto { // cs
	// * 클래스 멤버
	 // 1. 멤버변수 , 접근제한자 , 객체의 속성을 고려
	private String title; //제목 // 접근제한자  private 왜 사용 했을까? // 다른 외부 클래스로부터 접근을 차단하기 위해서 사용
	private String content; // 내용
	private String writer; // 작성자
	 // 2. 생성자 , 객체 생성시 초기화를 담당하는 역할 // new 생성자() // 왜 비어있는 디폴트생성자를 만들었을까?
	     // +디폴트생성자 규칙 : 클래스명과 동일해야함 , 매개변수와 인수값 및 타입과 개수가 일치해야함
	
	//BoardDto2() // 오류
	// 1. 비어있는 디폴트 생성자 // ?
	public BoardDto() {} 
	
	// 2. (전체) 매개변수가 3개인 생성자 // ? 
	public BoardDto( String title , String content , String writer ) {
		this.title = title; this.content = content; this.writer = writer;
	}	
	
	
	 // 3. 메소드 // 멤버변수 // 객체의 이벤트 내지 행위 , 객체가 실행 할 함수 정의
	    // 1. getter(호출 및 반환 목적) and setter(저장 목적) :  private 멤버변수를 다른 클래스로부터 간접 접근이 가능하도록 제공하는 함수
	public String getTitle() { return this.title; }	
	public void setTitle( String title) { this.title = title; }
	
	public String Content() { return this.content; }
	public void pw( String content ) { this.content = content; }
	
	public String getWriter() { return this.writer; }
	public void setWriter( String writer ) { this.writer = writer; }
	// getter(호출 및 반환 목적) and setter(저장 목적) 왜 사용하는지?
	// public 및 void를 왜 사용하는지?
	// return 및 this를 왜 사용하는지?
	// get,set,string은 왜 대문자를 사용하는지? 

} // ce
