package day12.boardprogram7;

public class BoardDto {
	// 상자 (Object):
	// 이 상자는 우리가 만들고 싶은 정보를 담을 수 있는 곳이에요. 
	// 예를 들어, 제목, 내용, 작성자 같은 것들이 이 상자 안에 들어가요.
	private String title; // 게시판 항목의 제목을 저장하는 변수입니다.
	private String content; // 게시판 항목의 내용을 저장하는 변수입니다.
	private String writer; // 게시판 항목을 작성한 사람의 이름을 저장하는 변수입니다.
	

	public BoardDto() {} 
	// 기본 생성자입니다. 이 생성자는 BoardDto 객체를 기본값(빈 값)으로 초기화하는 데 사용 됩니다.
	
	public BoardDto( String title, String content, String writer ) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	// 매개변수를 받아서 객체를 초기화하는 생성자입니다. 
    // title content writer 값을 매개변수로 받아서 객체의 필드를 초기화합니다.	
	}

// Getter 메서드 ( Accessors ) // 읽는 사람 // 새로운 정보를 꺼내서 읽는 것
public String getTitle() { return this.title; } // title 값을 반환하는 메서드
public String getContent() { return this.content; } // content 값을 반환하는 메서드
public String getWriter() { return this.writer; } // writer 값을 반환하는 메서드
// Setter 메서드 ( Mutators ) // 쓰는 사람 // 새로운 정보를 정보상자에 넣는 것
public void setTitle(String title) {this.title = title;} // title 값을 설정하는 메서드
public void setContent(String content) {this.content = content;} // content 값을 설정하는 메서드
public void setWriter(String writer) {this.writer = writer;} // writer 값을 설정하는 메서드
}

/* // BoardDto 요약
*ㄴ1. 이 클래스는 게시판 항목의 제목,내용.작성자를 저장하고 가져오는 역할을 하는 DTO입니다.
*ㄴ2. 기본 생성자와 매개변수가 있는 생성자를 제공하며, 각 필드에 대해 Getter 와 Setter 메서드를 통해 데이터를 읽고 쓸 수 있습니다.
*ㄴ3. 간단히 말하면, 이 클래스는 게시판 항목의 데이터를 저장하는 객체로, 다른 시스템 또는 계층 간에 데이터를 전달할 때 사용됩니다.
*  // BoardDto의 내용중  Setter 와 Getter
*ㄴ1. Setter: 상자에 새로 정보를 넣어요 (새로운 제목, 내용, 작성자).
*ㄴ2. Getter: 상자에서 정보를 꺼내서 읽어요 (제목, 내용, 작성자).
*ㄴ3. 이렇게 Getter와 Setter는 상자에 정보를 넣고, 꺼내는 일을 도와주는 아주 중요한 역할을 해요!
 */