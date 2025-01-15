package najaba;

public class TestMode {
public static void main(String[] args) {

	// 예제 1: \n 한 번 사용
	System.out.println("안녕하세요\n반갑습니다");
	/* 출력결과:
	안녕하세요
	반갑습니다
	*/

	// 예제 2: \n 두 번 사용
	System.out.println("안녕하세요\n\n반갑습니다");
	/* 출력결과:
	안녕하세요

	반갑습니다
	*/
	// 예제 3: 문자열 + 문자열
	System.out.println("안녕" + "하세요");  // 출력: 안녕하세요

	// 예제 4: 문자열 + 숫자
	int 나이 = 20;
	System.out.println("제 나이는 " + 나이 + "살 입니다");  // 출력: 제 나이는 20살 입니다

	// 예제 5: 여러 개 연결하기
	String 이름 = "민수";
	int 학년 = 3;
	System.out.println("이름: " + 이름 + ", " + 학년 + "학년");  // 출력: 이름: 민수, 3학년

	
	// \t : 탭(들여쓰기)
	System.out.println("이름:\t홍길동");  // 출력: 이름:    홍길동

	// \" : 큰따옴표 출력
	System.out.println("그가 \"안녕\"이라고 말했다");  // 출력: 그가 "안녕"이라고 말했다

	// \\ : 역슬래시 출력
	System.out.println("C:\\Program Files");  // 출력: C:\Program Files
	
/* 
 * \n : 줄바꿈
    + : 문자열 연결
   \t : 탭
   \" : 큰따옴표
   \\ : 역슬래시
 *
*/
	
	
	
	
	
	
}
}


