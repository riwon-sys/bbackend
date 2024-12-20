package day10;

public class MemberDto { // cs

			private String id; // 아이디
			private String pw; // 비번
			private String name; // 닉네임
			// 2. 생성자 : 디폴트 , 풀매개변수 , 설계에 따라 만들기
				// 2-1 : 디폴트 생성자 
			public MemberDto() {}
				// 2-2 : 풀매개변수 생성
			public MemberDto( String id , String pw , String name ) {
				this.id = id; this.pw = pw; this.name = name;
			}
			
			// 3. 메소드 : 멤버변수 마다 getter/setter , toString
			// private 멤버변수는 외부 클래스로부터 차단 했으므로 간접적으로 접근할 수 있도록 public 메소드 제공 
				// 멤버변수 1개당 getter 호출 , setter 저장 제공  
		public String getId() { return this.id; }	
		public void setId( String id) { this.id = id; }
		public String Pw() { return this.pw; }
		public void pw( String pw ) { this.pw = pw; }
		public String getName() { return this.name; }
		public void setName( String name ) { this.name = name; }
			// toString() : 기본적으로 객체 호출하면 주소(참조)값이 반환되지만, 오버라이딩(재정의)해서 주소값 대신 원하는 반환값 정의
		@Override
		public String toString() {
			return "MemberDto [id=" + id + ", pw=" + pw + ", namer=" + name + "]";
		}
		
	     
} // cl e
