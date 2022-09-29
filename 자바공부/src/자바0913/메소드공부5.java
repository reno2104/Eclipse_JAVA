package 자바0913;

public class 메소드공부5 {

	
	public static int getsum(int x, int y) {
		return x + y;
	}
	
	public static boolean isLogin(boolean isLogin) {
		return isLogin;
		
	}
	
	public static String getWord (String word) {
		return word;
	}
	
	public static void main(String[] args) {
		
			int result = getsum(10,10);
			//문제 1. 예상되는 result 값은? 20
			System.out.println("결과 : "+ result);
	}
	
			boolean isResult = isLogin(true);
			//문제 2. 예상되는 isResult 값은? true
			
			String word = getword("치즈돈까스");
			//문제 3. 예상되는 word 값은? 치즈돈까스

}
