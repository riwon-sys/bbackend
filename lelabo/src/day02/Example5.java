package day02;

// 예제 풀이 시작!
import java.util.Scanner; // 사용자 입력을 받을 때 사용하는 도구

public class Example5 { // 클래스 시작

    public static void main(String[] args) { // 메인 메서드 시작
        // 스캐너라는 도구를 사용해 사용자의 입력을 받기 위해 준비
        Scanner scan = new Scanner(System.in);

        // [지문1] 국어, 영어, 수학 점수를 입력받아 총점과 평균 계산
        System.out.println("국어 점수를 입력하세요:");
        int korean = scan.nextInt();
        System.out.println("영어 점수를 입력하세요:");
        int english = scan.nextInt();
        System.out.println("수학 점수를 입력하세요:");
        int math = scan.nextInt();
        int total = korean + english + math; // 총점 계산
        double average = total / 3.0; // 평균 계산
        System.out.println("총점: " + total + ", 평균: " + average);

        // [지문2] 반지름 입력받아 원 넓이 계산
        System.out.println("원의 반지름을 입력하세요:");
        double radius = scan.nextDouble();
        double area = radius * radius * 3.14; // 원의 넓이 계산
        System.out.println("원의 넓이: " + area);

        // [지문3] 두 실수를 입력받아 앞 실수의 값이 뒤 실수의 값의 비율 계산
        System.out.println("첫 번째 실수를 입력하세요:");
        double num1 = scan.nextDouble();
        System.out.println("두 번째 실수를 입력하세요:");
        double num2 = scan.nextDouble();
        double ratio = (num1 / num2) * 100; // 비율 계산
        System.out.println("비율: " + ratio + "%");

        // [지문4] 정수를 입력받아 홀수면 true, 짝수면 false 출력
        System.out.println("정수를 입력하세요:");
        int number = scan.nextInt();
        boolean isOdd = (number % 2 != 0); // 홀수면 true, 짝수면 false
        System.out.println("홀수인가요? " + isOdd);

        // [지문5] 정수를 입력받아 7의 배수인지 확인
        System.out.println("정수를 입력하세요:");
        int num = scan.nextInt();
        boolean isMultipleOf7 = (num % 7 == 0); // 7의 배수 여부 확인
        System.out.println("7의 배수인가요? " + isMultipleOf7);

        // [지문6] 정수를 입력받아 홀수이면서 7의 배수인지 확인
        System.out.println("정수를 입력하세요:");
        int numCheck = scan.nextInt();
        boolean isOddAndMultipleOf7 = (numCheck % 2 != 0) && (numCheck % 7 == 0);
        System.out.println("홀수이면서 7의 배수인가요? " + isOddAndMultipleOf7);

        // [지문7] 십만원 단위로 금액의 지폐 수 계산
        System.out.println("금액을 입력하세요:");
        int money = scan.nextInt();
        int tenThousand = money / 100000; // 십만원권 계산
        money %= 100000;
        int oneThousand = money / 10000; // 만원권 계산
        money %= 10000;
        int thousand = money / 1000; // 천원권 계산
        System.out.println("십만원: " + tenThousand + "장, 만원: " + oneThousand + "장, 천원: " + thousand + "장");

        // [지문8] 1차 점수와 2차 점수를 입력받아 합격/불합격 판단
        System.out.println("1차 점수를 입력하세요:");
        int firstScore = scan.nextInt();
        System.out.println("2차 점수를 입력하세요:");
        int secondScore = scan.nextInt();
        int totalScore = firstScore + secondScore; // 총점 계산
        String result = (totalScore >= 150) ? "합격" : "불합격"; // 합격/불합격 판단
        System.out.println("결과: " + result);

        // 스캐너 닫기 (필수는 아니지만 자바에서는 권장합니다)
        scan.close();
    } // 메인 메서드 끝
} // 클래스 끝


/*코드 설명
입력 받기: Scanner scan = new Scanner(System.in)으로 키보드 입력값을 읽습니다.
scan.nextInt(): 정수 입력받기
scan.nextDouble(): 실수 입력받기
출력하기: System.out.println()으로 화면에 결과를 출력합니다.
조건문 없이 해결: ? :(삼항 연산자)와 논리 연산자(&&, ||)를 사용했습니다.
계산: 나누기(/), 나머지(%), 곱하기(*) 등을 사용해 결과를 구했습니다.
*/


























