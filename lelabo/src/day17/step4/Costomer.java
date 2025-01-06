package day17.step4;
// public class Costomer extends 클래스명{}
public class Costomer implements Buy , Sell{
	// + 상속 : extends 클래스명
	// + 구현 : implements 인터페이스a , 인터페이스b
	// - 클래스 1개당 구현은 여러개의 인터페이스
	
	
	// + 두 인터페이스의 추상메소드 구체화/구현하기
	@Override
	public void buy() {
		System.out.println("판매");
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void sell() {
		System.out.println("구매");
		// TODO Auto-generated method stub
		
	}

} // c.e
