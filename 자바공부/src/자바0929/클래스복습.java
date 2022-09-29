package 자바0929;

//클래스 C 생성

class emp{

	//필드변수
	private int 사원번호;
	private String 사원이름;
	private int 급여;
	private int 보너스;
	

	
	emp(int 사원번호, String 사원이름, int 급여, int 보너스){
		this.사원번호 = 사원번호; //파라미터(오른)에서 가져온 값을 필드(왼쪽)에 대입하겠다.
		this.사원이름 = 사원이름;
		this.급여 = 급여;
		this.보너스 = 보너스;
	}
	//생성자(리턴타입이 없는 메솓,)
	emp(){
		
	}
//메소드(함수)
public int get사원번호() {
		return 사원번호;
	}
	public void set사원번호(int 사원번호) {
		this.사원번호 = 사원번호;
	}
	public String get사원이름() {
		return 사원이름;
	}
	public void set사원이름(String 사원이름) {
		this.사원이름 = 사원이름;
	}
	public int get급여() {
		return 급여;
	}
	public void set급여(int 급여) {
		this.급여 = 급여;
	}
	public int get보너스() {
		return 보너스;
	}
	public void set보너스(int 보너스) {
		this.보너스 = 보너스;
	}

	
class c{
	//클래스 안에 작성한 편수를 필드변수라고 함.
	private String 이름;
	private int 나이;
	
	C(String 이름, int 나이){
		//파라미터가 있는 생성자
	}
	C(){
		
	}
	
	//getter, setter
	//필드변수가 private에서 get, set 함수를 이용해서
	//필드변수 데이터를 대입하고 호출한다.
	public String get이름() {
		return 이름;
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public int get나이() {
		return 나이;
	}
	public void set나이(int 나이) {
		this.나이 = 나이;
	}

	
}


class B{
	//클래스 생성 후 메인 함수에 B클래스 호출

		B(int x, int y) {
	System.out.println("B class : hello world");
}
		//메소드 이름은 같은데, 파라미터 타입이 다를 때 : 오버로딩
		B(){}

class A{
	//기본으로 제공 == default 
	A(){} //메소드 => 생성자. 생성자는 메소드와 리턴타입이 없다.
	
	
	public void A클래스에있는메소드() {
		System.out.println("hello world");
	}
	public int 메소드생성(int x) {
		return x;
	}
}

public class 클래스복습 {
	public static void main(String[] args) {
		//메인 메소드에서 a클래스에 있는 메소드 복습하기
		A a=new A();
		//new (); A클래스 호출
		//A a 불러온 클래스를 a라는 변수에 대입.(인스턴스화, 객체 생성.)
		a.A클래스에있는메소드(); // 변수를 활용한 방법.
		a.메소드생성(300);
		
		new A().A클래스에있는메소드(); // 변수를 생성하고 클래스 호출시 바로 메소드 호출.

		B b=new B(50, 100); //B라는 클래스를 호출할 때 디폴트 생성자도 자동으로 호출된다.

	}
	
}


