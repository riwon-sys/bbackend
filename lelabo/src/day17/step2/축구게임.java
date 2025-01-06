package day17.step2;

//키보드 인터페이스를 축구게임 클래스가 구현
//게임사는 하드웨어를 만들지 않고 키보드의 게임 구현을 위한 구체적인 이벤트 기능을 구현

public class 축구게임 implements 키보드 {
	
	@Override
	public void aKey() {
		System.out.println("슛");
		
	}
	
	@Override
	public void bKey() {
		System.out.println("패스");
		
		
	}

}
