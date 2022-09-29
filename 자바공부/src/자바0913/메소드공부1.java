package 자바0913;

public class 메소드09 {
	
//	메소드 : 무엇을 수행하는 기능.
// 자바스크립트의 function과 같은 기능.
	// () => 마라미터 or 매개변수
	//int : 리턴 타입
	// 더하기 : 메소드 이름(기능 이름)
//	리턴 타입 : int, double, float, boolean ... 데이터타입 +String(클래스 타입)
	
	
	public static int 더하기 (int x, int y) {
		return x+y;
	}
		public static int 빼기(int x, int y) {
			return  x-y;
		}	
		public static int 나누기(int x, int y) {
			return  x/y;
		}
		public static int 곱하기(int x, int y) {
		return  x*y;
	}	
	
		
	public static void main(String[] args) {

	int 결과 = 더하기(20, 10);
	int 결과2 = 빼기(30,5);
	int 결과3 = 나누기(40,5); //	나누기 메소드 만들기
	int 결과4 = 곱하기 (2,2); //	곱하기 메소드 만들기
	System.out.println(결과);
	System.out.println(결과2);
	System.out.println(결과3);
	System.out.println(결과4);

	}
	
//	곱하기 메소드 만들기


