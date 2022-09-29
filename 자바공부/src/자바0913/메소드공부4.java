package 자바0913;

public class 메소드공부4 {

	/*
	 * 메소드 사용하는 이유
	 * 1. 업무분담
	 * 2. 유지보수 편리성
	 * 
	 */
	
	//public static int getSum( int x) {
	//	return x;
	//}
	/*
	 *  public static : 접근 제어자
	 *  int : 리턴 타입
	 *  getSum : 메소드(혹은 함수) 이름
	 *  int x : 파라미터 타입(혹은 매개변수)
	 * 
	 */
	
	//public static String getWord(String x) {
	//	return x; 
	//}
	
	//public static int getSum(int x, int y) {
	//	return 10;
	//}
	/*
	 *  public static : 접근 제어자
	 *  int : 리턴 타입
	 *  getSum : 메소드(혹은 함수) 이름
	 *  int x, int y : 파라미터 타입(혹은 매개변수)
	 * 
	 */
	
	
	//public static int getCount( int startNum, int endNum) {
	//	return 0;
	//}
	/*
	 *  public static : 접근 제어자
	 *  int : 리턴 타입
	 *  getSum : 메소드(혹은 함수) 이름
	 *  int x, int y : 파라미터 타입(혹은 매개변수)
	 * 
	 */
	
//	public static int getCount( int startNum, int endNum) {
		//문제1. startNum이 endNum보다 크면 startNum을 리턴.
		//		endNum이 startNum보다 크면 endNum을 리턴.
		
		
/*		if(startNum > endNum) {
			  return startNum;
		}
		if(startNum < endNum) {
			 return endNum;
			 return 0;
		}
		
	} */
	
	/*
	public static int 일부터십까지합구하기() {
		// 1~10까지 합을 구하고 리턴하시오!
		
		int sum = 0;
		for(int i=1; i<11; i++) {
		sum += i;
		}
		return sum;
	}
		*/

	
	public static int 짝수개수구하기() {
		//1부터 20까지 짝수 개수를 구하고 리턴하시오.
		
		int count=0;
		for(int i=1; i<21; i++) {
			if(i%2==0) ++count;
			}
			return count;
		}

	
	
	public static void main(String[] args) {
		
//		getCount(1,10); // 메소드 호출.
	}

}
