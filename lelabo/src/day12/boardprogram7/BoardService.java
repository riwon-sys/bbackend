package day12.boardprogram7;

import java.util.Scanner;
//1. 멤버변수 //2. 생성자

//3. 메소드(기능제공만 하는 메소드만 모아두는 곳)

public class BoardService { // c s
// 이 클래스는 게시판 관련 서비스 기능을 제공합니다. 예를 들어 , 게시물을 등록하거나 출력하는 기능을 담당합니다.
	// 이 코드에서는 멤버변수가 정의되어 있지 않습니다. 즉 이 클래스는 기능만 제공하는 클래스로,
	// 게시판에 필요한 데이터를 멤버 변수로 저장하지 않습니다. 대신 메소드의 매개변수로 데이터를 처리합니다.

	// * boardAdd 메소드 (게시물 등록 함수) *
	public void boardAdd(Scanner scan, BoardDto[] boards, String loginId) { // 함수 사용
		System.out.print("제목 : ");
		String title = scan.next();
		System.out.print("내용 : ");
		String content = scan.next();
		// [1]입력받기 : 사용자가 입력한 제목과 내용을 scan.next()를 이용해 입력받고,
		// 작성자는 로그인된 사용자 아이디(loginId)로 설정합니다.

		System.out.print("작성자는 로그인된 유저입니다. : ");
		String writer = loginId; // 로그인 아이디를 작성자에 대입한다.

		BoardDto boardDto = new BoardDto(title, content, writer);
		// [2] 생성자를 이용한 빠른 초기화 객체 생성 : BoardDto 클래스의 생성자를 사용하여,
		// 입력받은 제목,내용,작성자 정보를 바탕으로 게시물 객체(BoardDto)를 생성합니다.
		// 게시물 객체를 만든다는 건, 게시판에 글을 올리는 것과 비슷해요.
		// ㄴ1. 제목 : 글의 이름을 정하는 거예요. // ㄴ2. 내용 : 글 안에 쓸 내용을 적는 거에요. // ㄴ3. 작성자 : 글을 쓴 사람의
		// 이름이에요
		// 즉, "게시물 객체를 만든다"는 건, 제목/내용/작성자를 넣은 하나의 글을 만드는 거라고 생각하면 돼요!

		// * 게시물 목록에서 빈 공간을 찾아서 대입
		for (int index = 0; index <= boards.length - 1; index++) {
			if (boards[index] == null) {
				boards[index] = boardDto;
				System.out.println("게시물 등록 성공!!");
				return;
			} // [3] 게시물 등록 :배열 boards를 순회하면서 빈 공간 (값이 null인곳)을 찾아 새로 생성한 게시물 객체를 넣습니다.
		} // 만약 빈 공간을 찾으면 게시물을 등록하고, "게시물 등록 성공!!" 메시지를 출력한 뒤 함수가 종료됩니다.

		// [4] 게시물 목록의 크기 : 배열 크기만큼 반복문을 돌리면서 게시물을 등록할 수 있는 빈 공간을 찾고, 없으면 배열이 꽉 차 있다고 할
		// 수 있습니다.
		// (즉, 배열 크기를 넘는 부분에 대한 처리가 필요할 수도 있습니다.)
		// ㄴ 게시물 목록은 마치 여러 개의 상자를 놓은 것과 같아요. 각 상자에는 하나의 글이 들어갈 수 있어요.
		// 그런데 상자가 얼마나 있느냐를 확인하는 것이 바로 배열 크기예요.
		// ㄴ1. 배열크기 : 상자의 개수예요. 예를들어 상자가 5개라면, 글을 올릴 수 있는 자리가 5개 있다는 뜻이에요.
		// ㄴ2. 반복문 : 상자 하나하나를 차례대로 살펴보면서, 글을 넣을 자리가 있는지 확인해요. 자리가 있으면 글을 넣고, 자리가 없으면 더이상
		// 글을 넣을 수 없다고 말해요.
		// ㄴ3. 그래서 "배열 크기를 넘는 부분에 대한 처리가 필요하다"는 건, 상자가 꽉 차서 더 이상 글을 넣을 수 없을 때 어떻게 할지
		// 생각해야 한다는 거예요.
	} // f e 1

	// ** boardPrint 메소드 (게시물 출력 함수) **
	public void boardPrint(BoardDto[] boards) { // 함수 선언
		// [1] 게시물 목록 출력 : 배열 boards에 저장된 게시물들을 출력하는 기능을 담당합니다.
		System.out.println("순번\t작성자\t제목\t내용");
		// System.out.println("순번\t작성자\t제목\t내용"); 출력 형식의 헤더를 출력합니다.
		// 이 코드는 헤더를 출력하는 부분이에요. 쉽게 말하면, 정보를 표로 정리할 때 첫 번째 줄에 쓰는 제목들 같아요.
		// ㄴ1. System.out.println: 이건 "출력"하는 명령이에요. 화면에 뭔가를 보여주고 싶을 때 써요.
		// "순번\t작성자\t제목\t내용": 이 부분은 출력할 내용이에요.
		// \t: 이건 "탭"이라고 해서, 글자들 사이에 공간을 두는 기호예요. 각 항목들이 잘 구분되게 해줘요.

		for (int index = 0; index <= boards.length - 1; index++) {
			if (boards[index] != null) {
				System.out.printf("%d \t %s \t %s \t %s \n", index,
						// for 반복문을 통해 boards 배열을 순회하며 각 게시물이 null 이 아닌 경우에만 출력합니다.

						// [2] 출력내용 : 게시물의 순번(배열 인덱스),작성자,제목,내용을 출력합니다.
						// 그리고 getWriter(), getTitle(), getContent() 메소드를 통해 가져옵니다.

						boards[index].getWriter(), // 배열 안에서 index 번째의 있는 작성자를 꺼내서 읽는다.
						boards[index].getTitle(), // 배열안에 있는 제목을 꺼내서 읽는다.
						boards[index].getContent()); // 배열안에 있는 내용을 꺼내서 읽는다.
				/*
				 * // Getter 메서드 ( Accessors ) // 읽는 사람 // 새로운 정보를 꺼내서 읽는 것// // BoardDto의 내용중
				 * Setter 와 Getter ㄴ1. Setter: 상자에 새로 정보를 넣어요 (새로운 제목, 내용, 작성자). ㄴ2. Getter:
				 * 상자에서 정보를 꺼내서 읽어요 (제목, 내용, 작성자). ㄴ3. 이렇게 Getter와 Setter는 상자에 정보를 넣고, 꺼내는 일을
				 * 도와주는 아주 중요한 역할을 해요!
				 */
			}

		} // for e
	} // f e 2
} // c e

/*
 * // BoardService의 전체적인 흐름 
 * ㄴ1. 게시물 등록(boardAdd) : 사용자가 제목,내용,작성자를 입력하여 게시물을 등록하고, 배열에 저장합니다.
 * ㄴ2. 게시물 출력(boardPrint) :  배열에 저장된 게시물들을 출력합니다. 빈 공간은 건너뛰고, 등록된 게시물만 출력됩니다.
 * // BoardService의 주요 특징 
 *  게시물 등록은 BoardDto[] boards 배열에서 빈 공간을 찾아 등록합니다.
 *  게시물 출력은 BoardDto[] boards 배열에서 비어 있지 않은 게시물만 출력합니다.
 *  
 *  개선할 점 (Optional)
 *  ㄴ1. 배열 크기 제한 : 현재 배열 크기 (boards.length)는 고정되어 있으며, 배열이 가득 차면 더 이상 게시물을 등록할 수 없습니다.
 *  배열 크기를 동적으로 확장하거나, ArrayList 같은 동적 크기의 자료구조를 사용하는 것이 더 유용할 수 있습니다.
 *  ㄴ2. 배열 초기화 : boards 배열이 null 값으로 초기화된 상태에서 게시물을 등록하고 출력할 수 있도록 합니다. null 체크를 통해 유요한 데이터를 처리합니다.
  */

/* 자바를 수강하는 학생입니다. 선생님께서 개선할 점 (Optional)을 알려주셨습니다.
저는 이해를 잘 하지 못해서 초등학생 수준으로 자세하고 친절한 설명 부탁드립니다.
감사합니다.
 * [1] 배열 크기 제한
  현재 사용하고 있는 배열 boards는 크기가 고정되어 있어요. 예를 들어 배열의 크기가 10이라면, 게시물을 10개까지는 저장할 수 있지만 11개부터는 저장할 수 없게 됩니다.
  그래서 "배열 크기 제한"이라고 말씀하신 거예요.
  이 문제를 해결하기 위해 배열 크기를 동적으로 확장하는 방법을 알려드릴게요. 동적으로 크기를 확장할 수 있는 자료구조에는 대표적으로 ArrayList 라는 것이 있습니다.
  ArrayList 는 배열처럼 데이터를 저장할 수 있지만, 배열과는 달리 크기를 동적으로 늘릴 수 있습니다. 즉 , ArrayList에 데이터를 추가하면 자동으로 크기가 커지기 때문에 크기에 대해 걱정을 할 필요가 없습니다.
  
  import java.util.ArrayList;

public class BoardExample {
    public static void main(String[] args) {
        // ArrayList를 사용하여 동적으로 게시물 관리
        ArrayList<String> boards = new ArrayList<>();

        // 게시물을 추가할 때마다 자동으로 크기가 늘어남
        boards.add("첫 번째 게시물");
        boards.add("두 번째 게시물");
        boards.add("세 번째 게시물");

        // 게시물 출력
        for (String board : boards) {
            System.out.println(board);
        }
    }
}
 > 여기서는 ArrayList<String>을 사용해서 게시물을 동적으로 추가하고 출력하는 예시입니다.
 boards.add()를 사용하여 게시물을 추가할 때마다 크기가 늘어납니다.
 
 * [2] 배열 초기화
 두 번째로, "배열 초기화"에 대해서는 배열이 null로 초기화된 상태라는 말이 조금 어려울 수 있어요.
 이 말은 배열을 만들었을 때, 배열 안의 값들이 아직 설정되지 않았다는 뜻입니다. 그래서 만약 배열을 사용하기 전에
 그 안에 데이터가 들어 있는지 확인해야 하는 경우가 생깁니다. 배열을 사용하기 전에 null 값 체크를 통해 데이터가 있는지
 확인하고, 데이터가 업다면 처리할 수 있는 방법을 생각해야 합니다.
 
 public class BoardExample {
    public static void main(String[] args) {
        // 배열을 크기가 10인 상태로 초기화 (초기값은 모두 null)
        String[] boards = new String[10];

        // 게시물 등록
        // null 체크를 통해 배열에 유효한 데이터가 들어 있는지 확인
        if (boards[0] == null) {
            boards[0] = "첫 번째 게시물";
        }

        // 게시물 출력
        for (int i = 0; i < boards.length; i++) {
            if (boards[i] != null) {  // null이 아니면 출력
                System.out.println(boards[i]);
            }
        }
    }
}
 > 여기서는 배열을 new String[10]으로 만들엇기 때문에 배열의 크기는 10이지만 처음에는 모두 null로 채워져 있습니다. 
 그래서 null 인 곳에만 게시물을 등록하고 출력할 때도 null 인 값은 출력하지 않도록 처리했습니다.
 
 ###########################정리#########################
 1.배열 크기 제한 문제 : 고정된 크기의 배열 대신에, ArrayList와 같은 동적크기의 자료구조를 사용하면 크기를 걱정할 필요 없이 게시물을 추가할 수 있습니다.
 2.배열 초기화 문제 : 배열을 사용하기 전에 null 체크를 통해 데이터가 유효한지 확인하고, null이 아니면 데이터를 처리하도록 해야 합니다.
 * */
