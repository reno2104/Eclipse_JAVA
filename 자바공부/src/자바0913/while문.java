package 자바0913;	

public class while문 {

	public static void main(String[] args) {
		//while문 : for문처럼 반복문 중 하나.
		//for문에 비하면 사용 빈도는 낮으나, 종종 사용하는 기능.
		//while문은 for문 처럼 조건없이 계속 실행됨.
		
		int count= 0;
		
		while(true) {
			++count;
			System.out.println("안녕");
			if(count == 20) {
				break; //while문 멈추기.
			}
		}
		
		
		//문제1. while 문을 이용해서 1부터 10까지 합을 구하시오.
		
		int sum = 0;
		int	i = 0;
		
				while(true) {
					++i;
					sum = sum +i;
					System.out.println("sum =>"+sum);
				}
				if(sum == 55){
					break;
				}
		
	}

}
