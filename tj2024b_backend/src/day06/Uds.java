package day06; 

	// 생각해보기 : 생활속의 객체들을 클래스 코드로 표현하기
	//(단, 학생,자동차,주문 제외)
	//(예4)무인 택배 접수,
	//- 속성(멤버변수) : 예약접수번호,예약접수일자,예약수량
	//- 기능(메소드)
    //public class Uds{
	//  int 예약접수번호;
	//   int 예약접수일자;
	//   int 예약수량;
	//} 
	 
	  
	// [1] 클래스 정의하기 , 객체를 만들기 위한 일종의 틀 / 설계도 만들기
			// ==> 생활속에서의 틀/설계도가 필요한 이유?
			// ==? 붕어빵 가가에서 붕어빵을 구매 > 주인이 붕어빵을 수제 생성
	        // ==? 모양이 일정치 않고, 오래걸림
			// ==> 붕어빵 모형의 주물을 사용하면 빠르고 일정한 모양으로 붕어빵을 만들 수 있다.
			// * 객체 설계도 클래스는 main 함수가 없어도 된다.
			// * 클래스 생성법 : class  클래스명{}
	  public class Uds { // Unmanned delivery service ; 무인택배서비스
		  int 예약접수번호; int 예약접수일자; int 예약접수수량;

}