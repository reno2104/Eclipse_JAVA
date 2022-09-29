package 자바0929;

class 관장{
	public void 운동을하다() {
		System.out.println("운동하기 전에 운동장 뛰는게 맞는거야!");
	}
	public void 주먹을날리다() {
		System.out.println("라이트 훅!");
		System.out.println("레프트 훅!");
		System.out.println("어퍼 컷!");

	}
}

class 제자 extends 관장{
@Override
public void 운동을하다() {
	System.out.println("관장님! 간단하게 스크레칭하고 운동에 집중하죠!");
}
@Override
		public void 주먹을날리다() {
	System.out.println("상대와 간격을 조절한다.");
	System.out.println("레프트 쨉을 날린다.");
	System.out.println("라이트 훅을 날린다.");
}	
}

public class 상속공부하기2 {
	// extends Object : 자바는 누군가에게 상속받고 있다. 누구나 부모가 있다.
	
	
	public static void main(String[] args) {

		관장 경호관장님 = new 관장();
		경호관장님.운동을하다();
		경호관장님.주먹을날리다();
		System.out.println("======================");
		제자 홍길동 = new 제자();
		홍길동.운동을하다();
		홍길동.주먹을날리다();

	}

}
