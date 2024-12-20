package day10;

public class MyDate {
	
	// + 멤버 변수
	private int day; // (폐쇄)
	private int month; // (폐쇄)

	private int year; // (폐쇄)
    
	// + 생성자
	
	// + 메소드 , getter : 호출 , setter : 저장
	
	public void setDay(int day) {
		if(month ==2) {
			if(day<1 || day > 28) {
				System.out.println(">오류<");
			}else {
				this.day = day;
			}
		}
	}

}
