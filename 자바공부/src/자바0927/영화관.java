package 자바0927;

public class 영화관 {
	//필드변수는 public과 private를 지정할 수 있다.
	private int 직원수;
	private String 영화관위치;
	private String 영화관이름;
	private String[] 개봉영화종류;//배열로 받기
//private은 필드변수를 생성하면 다른 클래스에서 영화관 클래스에 있는
	// 필드변수를 사용할 수 없다.(은닉성)


//메소드
	public void 직원수(int 직원수) {
		this.직원수 = 직원수;
		//파라미터로 받아온 값을 필드변수에 대입
		//이런 메소드는 setter 메소드라고 한다.
		//this는 자기자신을 의미함.
		//this는 직원 수 뜻. 파라키터 변수이름과 동일.
		//this를 사용해서 필드변수를 사용하자.
	}
	public int get직원수() {
	//필드변수를 리컨하는 메소드	
		return 직원수;
	}
}

