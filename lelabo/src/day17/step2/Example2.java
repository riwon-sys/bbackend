package day17.step2;

public class Example2 { // c.e
         public static void main(String[] args) { // m.s
			// (1) 인터페이스 타입의 변수 생성, 키보드 변수 선언
        	 키보드 myKeyBoard;
        	// (2) 구현채 : 인터페이스의 추상메소드를 구현한 인스턴스
        	   // 1.사냥게임 플레이
        	   // 2. 키보드에 사냥게임 연결
        	 myKeyBoard = new 사냥게임(); // new 사냥게임() -> 구현한
        	 myKeyBoard.aKey(); // 공격
        	 myKeyBoard.bKey(); // 방어
        	  
        	  // 1. 게임 변경
        	 myKeyBoard = new 축구게임(); // new 축구게임() -> 구현한
        	  // 2. 키보드에 축구게임 연결
        	 myKeyBoard.aKey(); // 슛
        	 myKeyBoard.bKey(); // 패스
        	 
        	 // (3) 생각해보기 : 키보드 타입이 없어도 게임타입으로 실행이 가능하다.
        	 게임1.aKey();
        	 게임2.bKey();
        	// 게임1= new 축구게임(); // 오류 : 사냥게임 인스턴스는 축구게임의 타입을 모른다.
        	 // 참새 ---> 조류 ---> 동물 > object.
        	 // 닭 ---> 조류 > 동물 > object
        	 // 게임1= new 축구게임(); // 오류 : 사냥게임 인스턴스는 축구게임의 타입을 모른다.
        	 
		}// m.e
} // c.e
