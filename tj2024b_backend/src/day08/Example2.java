package day08;

public class Example2 { // p s
	public static void main(String[] args) { // m s
	 
		 // [1] 함수 호출하고 값 반환하기
		int num1 = 10;
	    int num2 = 20;
	    
	    int sum = add( num1 , num2 ); // add 함수가 없어서 오류 // 내가 만든 add 함수에 num1과 num2를 인수로 전달하고 반환값을 sum 변수에 대입한다.
	    System.out.println(num1 + " + " + num2 + " = " +sum + "입니다." );
	} // m e

	
	// (1) 함수 정의하기 , 반환타입은 int 함수명은 add 매개변수는 int (n1,n2)
	public static int add( int n1 , int n2 ) { // main 함수 밖에다가 설정 해야함 // a f s
		int result = n1 + n2;
		return result; // 반환값 : 함수가 종료 > 현재 함수를 호출했던 곳으로 반환 
		
	} // a f e
} // p e
