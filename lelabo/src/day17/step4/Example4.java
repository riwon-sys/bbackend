package day17.step4;

public class Example4 {
public static void main(String[] args) {
	//[1] costomer 인스턴스 생성
	Costomer costomer = new Costomer();
	// ㄴ 하위 타입이 생성 될때 상위 타입도 같이 참조한다.
	// ㄴ Costomer > Buy/Sell
	//[2] costomer 인스턴스가 buy타입 형 변환
	Buy buyer = costomer;
	buyer.buy(); // 구매하기
	//[3] costomer 인스턴스가 sell타입 형 변환
	Sell seller = costomer; // 업 캐스팅
	seller.sell(); // 판매하기
	
	//[4] 변수명 instanceof 타입 : 변수가 참조하는 인스턴스의 타입 조회
	if(seller instanceof Costomer) { // true 예상됨
		Costomer costomer2 = (Costomer)seller; // 강제 형 변환 = 다운 캐스팅 
		costomer2.sell(); // 구매하기
		costomer2.buy(); // 판매하기
		
	}
}
}
