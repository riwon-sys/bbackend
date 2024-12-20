package day10;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date = new MyDate();
		//  오류발생 : 이유 : 호훌하고자 하는 멤버변수가 PRIVATE 이므로 외부 클래스로 접근/호출 불가능
		//  date.month =2;
		//  date.day = 31;
		//  date.year = 2018;
		
		date.setDay(31);
		date.setDay(28);
        // 저장할 데이터의 유효성검사를 할때 주로 사용 / 모든 멤버변수는 private 사용
		// dto(; 통신 간 이동 ) vo(; 읽기모드 )
	}

}
