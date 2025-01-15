package najaba.board1;

import java.util.Scanner;

/* 게시판 프로그램 설명
 * 목적: 간단한 게시판 구현
 * 기능: 게시글 등록과 출력
 * 저장: 최대 3개의 게시글 저장 가능
 * 구성: 각 게시글은 제목, 내용, 작성자로 구성
 */

/*
 * ※ 주요 정리

1. 변수 초기화

null: 참조 변수의 '비어있음'을 나타내는 값
게시글의 존재 여부를 확인할 때 사용


2. 입력 처리

Scanner 클래스 사용
next(): 문자열 입력
nextInt(): 정수 입력


3. 조건문

if(조건) { ... }: 조건이 참일 때 실행
else if(조건) { ... }: 이전 조건이 거짓이고, 현재 조건이 참일 때 실행


4. 반복문

while(true): 무한 반복
프로그램을 계속 실행하기 위해 사용



5. 프로그램의 한계점

최대 3개의 게시글만 저장 가능
삭제 기능 없음
수정 기능 없음
게시글 번호 기능 없음


* 게시판 프로그램을 설명해드릴게요! 😊

### 게시판 프로그램이란? 
학교 복도에 있는 게시판처럼, 글을 써서 붙일 수 있는 디지털 게시판이에요.

### 프로그램에서 할 수 있는 일
1. 글쓰기 (등록)
2. 글보기 (출력)

### 어떻게 작동하나요?

1. **우선 게시판에 글을 붙일 수 있는 공간을 만들어요**
```java
// 게시글 3개를 저장할 수 있는 공간을 만들어요
String 제목1 = null;    // 첫 번째 글의 제목 (비어있음)
String 내용1 = null;    // 첫 번째 글의 내용 (비어있음)
String 작성자1 = null;  // 첫 번째 글을 쓴 사람 (비어있음)

// 2번째, 3번째 글도 같은 방식으로 공간을 만들어요
```

2. **프로그램 시작하면**
```java
while(true) {  // 계속 반복
    // 선택할 수 있는 메뉴를 보여줘요
    System.out.println("==== 게시판 프로그램 ====");
    System.out.println("1.등록 2.출력 : ");
    
    // 사용자가 선택한 번호를 받아요
    Scanner scan = new Scanner(System.in);
    int 선택메뉴 = scan.nextInt();
}
```

3. **1번(등록)을 선택하면**
```java
if(선택메뉴 == 1) {
    // 제목, 내용, 작성자를 차례로 입력받아요
    System.out.println(">제목 : "); 
    String title = scan.next();
    
    // 비어있는 첫 번째 공간을 찾아서 저장해요
    if(제목1 == null) {  // 1번 자리가 비어있으면
        제목1 = title;   // 1번 자리에 저장
        내용1 = content;
        작성자1 = writer;
    }
    // 1번이 차있으면 2번, 3번도 확인해요
}
```

4. **2번(출력)을 선택하면**
```java
else if(선택메뉴 == 2) {
    // 저장된 글이 있는지 확인하고 있으면 보여줘요
    if(제목1 != null) {  // 1번에 글이 있으면
        // 1번 글을 보여줘요
        System.out.println(">제목:" + 제목1 + ">내용:" + 내용1 + ">작성자:" + 작성자1);
    }
    // 2번, 3번도 같은 방식으로 확인해요
}
```

### 쉽게 생각하면!
1. 3개의 포스트잇을 붙일 수 있는 게시판이 있어요
2. 각 포스트잇에는 제목, 내용, 작성자를 쓸 수 있어요
3. 1번을 누르면 글을 쓸 수 있고
4. 2번을 누르면 써놓은 글을 볼 수 있어요

### 제한사항
- 포스트잇은 3개만 붙일 수 있어요
- 한번 붙인 포스트잇은 떼거나 수정할 수 없어요

이렇게 이해하시면 될 것 같아요! 😊


*/
public class TestBoardProgram25011433 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 게시글을 저장할 변수들 선언
        // 첫 번째 게시글 저장 변수
        String 제목1 = null;    // null은 아직 값이 없다는 의미
        String 내용1 = null;    // 게시글이 저장되기 전까지는 null 상태
        String 작성자1 = null;
        
        // 두 번째 게시글 저장 변수
        String 제목2 = null;
        String 내용2 = null;
        String 작성자2 = null;
        
        // 세 번째 게시글 저장 변수
        String 제목3 = null;
        String 내용3 = null;
        String 작성자3 = null;

        // 무한 반복문 시작 - 프로그램 종료할 때까지 계속 실행
        while(true) {
            // 메뉴 출력
            System.out.println("\n\n ==== 게시판 프로그램 ====");  // 프로그램 제목 출력
            System.out.println("1.등록 2.출력 : ");               // 메뉴 옵션 출력

            // 사용자 입력 받기
            Scanner scan = new Scanner(System.in);  // 입력을 받기 위한 Scanner 객체 생성
            int 선택메뉴 = scan.nextInt();         // 사용자가 선택한 메뉴 번호 저장

            // 메뉴 1: 게시글 등록
            if(선택메뉴 == 1) {
                System.out.println(">1. 등록 선택");
                
                // 게시글 정보 입력 받기
                System.out.println(">제목 : "); 
                String title = scan.next();     // 제목 입력받아 임시 저장
                
                System.out.println(">내용 : "); 
                String content = scan.next();   // 내용 입력받아 임시 저장
                
                System.out.println(">작성자 : "); 
                String writer = scan.next();    // 작성자 입력받아 임시 저장

                // 빈 공간 찾아서 게시글 저장하기
                if(제목1 == null) {  // 첫 번째 공간이 비어있으면
                    // 첫 번째 공간에 저장
                    제목1 = title;
                    내용1 = content;
                    작성자1 = writer;
                }
                else if(제목2 == null) {  // 두 번째 공간이 비어있으면
                    // 두 번째 공간에 저장
                    제목2 = title;
                    내용2 = content;
                    작성자2 = writer;
                }
                else if(제목3 == null) {  // 세 번째 공간이 비어있으면
                    // 세 번째 공간에 저장
                    제목3 = title;
                    내용3 = content;
                    작성자3 = writer;
                }
                else {  // 모든 공간이 차있으면
                    System.out.println("※등록실패 : 작성공간이 부족합니다※");
                }
            } 

            // 메뉴 2: 게시글 출력
            else if(선택메뉴 == 2) {
                System.out.println(">2. 출력 선택");
                
                // 저장된 게시글 출력하기
                // 첫 번째 게시글이 있으면 출력
                if(제목1 != null) {  // null이 아니라는 것은 ★★★게시글이 저장되어 있다는 의미
                    System.out.println(">제목:" + 제목1 + ">내용:" + 내용1 + ">작성자:" + 작성자1);
                }
                
                // 두 번째 게시글이 있으면 출력
                if(제목2 != null) {
                    System.out.println(">제목:" + 제목2 + ">내용:" + 내용2 + ">작성자:" + 작성자2);
                }
                
                // 세 번째 게시글이 있으면 출력
                if(제목3 != null) {
                    System.out.println(">제목:" + 제목3 + ">내용:" + 내용3 + ">작성자:" + 작성자3);
                }
            }
        } // while 반복문 끝
    } // main 메소드 끝
} // 클래스 끝
