package 자바0929;


// 오버로딩  : 메소드 이름은 같으나, 파라미터 타입이 다르다.
// 오버라이딩  : 부모의 기능을 자식이 재정의 함.
//	 상속
	class 부모{
		public void 아들아공부해야지() {
			System.out.println("아들아! 공부해라.");
		}
		public void 아들아밥먹자() {
			System.out.println("아들아 밥먹자");
		}
	}
	
	// 자식 클래스에서 부모님 클래스를 상속받겠다.
	// 프로그래밍에서 상속 : 부모의 기능을 자식이 물려받는다.
	class 자식 extends 부모{ // Ctrl + space바
		@Override//부모의 기능을 자식이 재정의.
		public void 아들아공부해야지() {
		System.out.println("공부하겠습니다.");
		}
		@Override
		public void 아들아밥먹자() {
		System.out.println("싫어요. 게임할래요.");
		}
	}

public class 상속공부하기 {
	
	public static void main(String[] args) {

			자식 x = 
		
		
	}

}
