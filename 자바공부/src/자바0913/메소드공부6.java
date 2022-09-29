package 자바0913;

public class 메소드공부6 {

	public static int getSum(int x, int y) {
		return x +y;
	}
	
	public static void main(String[] args) {

		int result = getSum(30,70);
		//result 값은? 100
		
		// 리턴타입이 void인 메소드는 변수에 결과를 대입할 수 없다.
		// 왜냐하면 return을 쓸수 없기 때문이다.
		// (실무 : void쓰긴하나 자주 쓰진 않는다.)
	}

}
