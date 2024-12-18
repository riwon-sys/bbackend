package day08;

public class Student {
	int studentID; // 학생식별자
	String studentName; // 이름
	
	int grade; // 등급
	String address; // 주소

	// 메서드 추가
	public void showStudnetInfo() {
		System.out.println(studentName + "," + address); // 이름 , 주소출력
		
	}
}
