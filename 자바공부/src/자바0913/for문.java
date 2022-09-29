package 자바0913;

import java.util.Scanner;

public class for문 {

	public static void main(String[] args) {

		
		/* for문 실행순서
		 *  1. int i=0;
		 *  2. i <10;
		 *  3. 코드실행
		 *  4. i++;
		 */
		
		int i=0;
		for(i=0; i<10; i++) {
			
		}
		System.out.println(i);
		
		
		//문제 
		//num에 값을 입력받았을 때 n을 x로 나눈 나머지가 1이 되도록하는 가장 작은 자연수 n을 출력하시오.
		//제한 사항 : num은 3 <= num <= 1000 입니다.
		// while or for문으로 풀기.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력해주세요. =>");
		int num = scan.nextInt();
		
		for(int a=3; a<1000; a++) {
			if(num%a == 1) {
				System.out.println("값은"+a+"입니다.");
				break;
		}
		}
		
		// 문제 2. 3부터 6까지 숫자 총합을 구하시오.
		int s = 3;
		int sum = s;
		for (s=3; s<=6; s++) {
			sum=sum+s;
		}
		System.out.println("총 합은" + sum);
	}

}
