package day03; // 폴더

public class Example2 { // 시작

	public static void main(String[] args) { // 메인시작
		// p88 연습문제
		
		//q1
		int myAge =  23;
		int teacherAge =38;
		
		boolean value  = (myAge > 25);
		System.out.println(value);
		
		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge);
		
		char ch;
		ch = (myAge > teacherAge) ? 't' : 'f';
		System.out.println(ch);
		
		
		//q2
		int num;
		num = -5 + 3 * 10 / 2;
		System.out.println(num);
		
		//q3
		int num2 = 10;
		System.out.println(num2);
		System.out.println(num2++);
		System.out.println(num2);
		System.out.println(--num2);
		
		//q4
		int num3 = 10;
		int num4 = 20;
		boolean result1;
		boolean result2;
		
		result1 = ((num3 > 10) && (num4 > 10));
		System.out.println(result1); // f
		
		result2 = ((num3 > 10 || (num4 > 10) ));
		System.out.println(result2); // t
		System.out.println(!result2); // f
		
		//q5
		
		
		//q6
		int num7 = 8;
		System.out.println(num7+=10);
		System.out.println(num7-=10);
		System.out.println(num7>>=2);
		
		//q7
		int num8 = 10;
		int num9 = 20;
		
		int result = (num8>=10) ? num9 + 10 : num9 - 10; 
		//num8이 10 이상이면 num9에 10을 더하고 아닐경우에는 num9에 10을 빼라
				System.out.println(result);
		
				
	} // 메인 끝

} // 끝
