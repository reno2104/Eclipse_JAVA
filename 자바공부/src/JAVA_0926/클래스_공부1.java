package JAVA_0926;

// 클래스 이름을 만들때는 항상 핲자리는 대문자를 입력한다.
// 클래스 안에 메소드가 위치한다.
// 메소드가 가장 작은 단위. 그 메소드를 감싸는 것이 클래스임. 클래스는 패키지 안에 있다. 패키지는 프로젝트 안에 있다.
class Pizza{
	
	public static void 피자를먹다() {
		System.out.println("백종원피자 냠냠");
		
	}
	

class 붕어빵{
	public static String 붕어빵을만들다(String 재료) {
		return 재료+"붕어빵을 만들었습니다!";
		}
	public static int 붕어빵수량을파악하다(int 수량){
		return 수량;
	}

}

public class 클래스_공부1 {

	
	
	public static void main(String[] args) {
		
		Pizza p = new Pizza(); // new Pizza(); 클래스를 불러온것.(호출)
		p.피자를먹다(); // pizza 클래스 안에 있는 피자를먹다 메소드 호출.

		붕어빵 팥붕어빵 = new 붕어빵();
		String 결과 = 팥붕어빵. 붕어빵을만들다("팥");
		System.out.println(결과);
		
		붕어빵 수량 = new 붕어빵();
		int 결과 = 수량.붕어빵수량을파악하다("수량");
		System.out.println(수량);
		
		
	}

}
