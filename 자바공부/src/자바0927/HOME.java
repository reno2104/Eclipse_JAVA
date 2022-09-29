package 자바0927;

/*
class A{ // A 클래스 시작
	int value = 100; // 필드 변수. 특징1. 전역(전체)로 활용가능 2. 초기값을 지정하지 않아도 됨. 기본 값(default)이 존재.
	
	public void 확인하기() {
		int x =50; // x라는 이름을 가진 변수 탄생. 
		System.out.println("A클래스에 있는 메소드 입니다.");
		System.out.println(value);
	} // x 생을 마감.
	
} // A 클래스 끝
*/

/*
class B{
	public void 확인하기() {
		System.out.println("B클래스에 있는 메소드 입니다.");
	}
}
*/

class C{
	
	String str;
	int value;
	
	//리턴타입이 있으면 리턴을 꼭 써주자!
	// 접근제어자 public static 은 사실 선택이다. 무조건 써야되는건 X.
	boolean 메소드만들기() {
		// true 혹은 false 를 리턴.
		return true;
	}
	
	int 메소드만들기(double x, double y) {
		return 0;
		
	}

	//class b를 리턴한다.
	B 메소드만들기(B b) {
		return b;
	}
}

public class HOME {
	//static 메소드는 static용 메소드 혹은 인스턴스화 된 메소드만 올 수 있다.
	public static void main(String[] args) {
/*
		A a클래스 = new A(); // new A => A클래스를 호출하다.
		a클래스.확인하기(); // a클래스에 있는 확인하기 메소드(==함수) 사용.
	}
*/
/*
		B b클래스 = new B();
		b클래스.확인하기();
*/
	}

}
