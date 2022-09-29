package 자바0927;

public class home2 {

	
	
	public static void main(String[] args) {
	
/*		
	영화관 a영화관 = new 영화관();

	//필드변수에 값 대입!
	a영화관.직원수 = 20;
	a영화관.영화관위치 = "대전 둔산동";
	a영화관.영화관이름 = "CGV둔산점";
	a영화관.개봉영화종류 =
			new String[]{"늑대사냥","공조2","아바타 리마스터링"};

	System.out.println("직원 수 : "+a영화관.직원수);
	System.out.println("영화관 위치 : "+a영화관.영화관위치);
	System.out.println("영화관 이름 : "+a영화관.영화관이름);
	System.out.println("개봉영화종류 : "+a영화관.개봉영화종류[0]);

*/
		영화관 a영화관 =new 영화관();
		a영화관.set직원수(20);
		int 직원수 = a영화관.get직원수();
		System.out.println("직원 수 :"+ 직원수);
		}

	}


