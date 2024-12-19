package day09;

import day08.Student;

public class Waiting {
	// 1.멤버변수 만들기
	String phone; 
	int count;
	// 2. 메소드 만들기
	public String getphone( ) {
		return phone;	//return 반환값;
	} 
	public int count( ) {
		return count;	//return 반환값;
	}
	
	// -- main 함수 : 프로그램을 시작하기 위해 호출하는 함수 , 클래스의 메소드는 아니다.
		// main + 자동완성 
		public static void main(String[] args) {
			// (1) 인스턴스(객체) 생성 	Student studentAhn = new Student(); 
			// (2) 객체내 멤버변수에 값을 대입 studentAhn.studentName = "안연수";	
			// (3) 객체내 멤버변수에 값 호출  System.out.println( studentAhn.studentName );		
			// (4) 객체내 멤버함수/메소드 를 호출 System.out.println( studentAhn.getStudentName() );	
		}
	
	
}


