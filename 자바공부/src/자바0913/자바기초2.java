package 자바0913;

import java.util.Scanner; // ctrl + shift + o (자동 임포트)

public class 자바기초2 {

	public static void main(String[] args) {
		
//		if( 3==4) {
//			System.out.println("IF 실행");
//		}else {
//			System.out.println("ELSE 실행");
//		}
		
//		if(x == 10) {
//			int y = 0; //y가 출생.
//		} //y의 끝.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력해주세요. =>");
		int num = scan.nextInt();
		System.out.println("값은"+num);
		
		// 받아온 값이 짝수면 '짝수', 홀수면 '홀수' 출력해보시오.
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}
		else if(num % 2 == 1) {
			System.out.println("홀수");
		}
	}
	

}
