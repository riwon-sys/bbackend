package day10;

public class BoardDto { // Dto ;데이터를 이동하는 객체 data transfer object) // c.s
	// 목적 : 협업할때 클래스명에 공통적으로 dto 를 명시함으로써 클래스 사용처 파악이 쉽다.
	// 추후에 dto , vo , dao(;데이터 접근 객체) , controller , service , view , entity
	// dto : 데이터베이스에(db)에 저장된 자료들을 자바에 이동할때 사용되는 객체
	       // 자바와 자바스크립트는 휘발성(영구저장 불가) -> db(영구저장 가능)
	// 관례적으로 모든 멤버변수는 private ,  일반적으로 디폴트 생성자 + 풀 매개변수 + 그외(개발자가 상황에 맞게;) , setter/getter , toString 메소드 구현 필요 : 객체 주소값 대신 객체 멤버변수 정보 반환 함수
	
	// 1. 멤버변수 : private  
		private String title;
		private String content;
		private String writer;
		// 2. 생성자 : 디폴트 , 풀매개변수 , 설계에 따라 만들기
			// 2-1 : 디폴트 생성자 
		public BoardDto() {}
			// 2-2 : 풀매개변수 생성
		public BoardDto( String title , String content , String writer ) {
			this.title = title ; this.content = content; this.writer = writer;
		}
		// 3. 메소드 : 멤버변수 마다 getter/setter , toString
			// private 멤버변수는 외부 클래스로부터 차단 했으므로 간접적으로 접근할 수 있도록 public 메소드 제공 
				// 멤버변수 1개당 getter 호출 , setter 저장 제공  
		public String getTitle() { return this.title; }	
		public void setTitle( String title) { this.title = title; }
		public String getContent() { return this.content; }
		public void setContent( String content ) { this.content = content; }
		public String getWriter() { return this.writer; }
		public void setWriter( String writer ) { this.writer = writer; }
			// toString() : 기본적으로 객체 호출하면 주소(참조)값이 반환되지만, 오버라이딩(재정의)해서 주소값 대신 원하는 반환값 정의
		@Override
		public String toString() {
			return "BoardDto [title=" + title + ", content=" + content + ", writer=" + writer + "]";
		}
} // c.e