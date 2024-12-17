package day07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Example4 { // c.s

	public static void main(String[] args) { // m.s
		// [0] 배열 사용하기 전 , 학번 10개를 저장하는 코드
		int studentId1;  int studentId2;  int studentId3; int studentId4;  int studentId5; 
		int studentId6;  int studentId7;  int studentId8; int studentId9;  int studentId10;
		
		// [1] 배열 사용 , 학번 10개를 저장하는 코드
		int[] studentIds = new int[10]; 
		
		// p200.배열의 초기화하기
		  // 1.
		int[] studentIds2 = new int[] { 101, 102, 103 };
		  // 2.
		// int[] studentIds3 = new int[3] { 101 , 102 , 103 };
		  // 3.
		int[] studentIds4 = { 101 , 102 , 103 };
		  // 4.
		int[] studentIds5;
		studentIds5 = new int[] { 101 , 102, 103 };
		
		// [3] 배열 사용 하기 ,  인덱스 사용하기
		int [] num = new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println( num );
		System.out.println(Arrays.toString(num)); // [1,2,3,4,5,6,7,8,9,10]
		System.out.println( num[0] );
		System.out.println( num[3] );
		  // 1. 1분복습
		int[]arr = new int[] {3,6,9,12};
		System.out.println(arr[0]+2);
		System.out.println(arr[1]+2);
		// System.out.println(arr[4]+3);
		
		  // 1. 1분복습
		//int [] num = new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println(arr[1]+arr[2]+arr[3]+arr[4]+arr[5]+arr[6]+arr[7]+arr[8]+arr[9]);
		int sum = 0;
		for (int i = 0; i <=num.length-1 ; i++) {
			sum += num[i];
		}
		
		//[4] 전체 배열 길이와 유효한 요소 값
		double[] data = new double[5]; // 실수 5개를 저장할 수 있는 배열 선언
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		// 네번째 인덱스와 다섯번째 인덱스는 대입하지 않았다. [3]과[5]는 기본값인 0.0 들어왔따.(기본값)
		
		for(int i = 0; i <=data.length-1 ; i++) {
			
		}
				
		
	} //m.e

} // c.e
