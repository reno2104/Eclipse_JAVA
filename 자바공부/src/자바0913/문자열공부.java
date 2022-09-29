package 자바0913;

public class 문자열공부 {

	public static void main(String[] args) {
//		String name = "황정민"; // 문자
//		String name2 = "하정우";
		// 자바에서 문자를 비교할 때는 == 을 사용하지 않는다.
		
		// 1. 문자 비교 equals
//		boolean isCheck = name.equals("name2"); // name과 name2를 비교함.
		
		// 왜 자바에서는 문자를 equals로 비교하는가?
		// 자바에서 문자열은 클래스이기 때문에 == 연산자로 비교시, 문자가 아닌 클래스 끼리 비교하는 것.
//		System.out.println("name하고 name2를 비교한 결과 =>"+isCheck);
		
		// *** boolean은 true와 false만 표현할 수 있다.
		
		
		//2. 문자 길이 알아내기. length
		String 비밀번호 = "12341234";
		int 문자길이 = 비밀번호.length();//le치면 아래 나옴.
	 System.out.println("문자 길이는 =>"+문자길이);
	 
	 
	 	//3. 문자 자르기. split
//	 	String 핸드폰번호 = "010-8888-1212";
//	 	String 배열[] = 핸드폰번호.split("-");
//	 	System.out.println(배열[0]);
//	 	System.out.println(배열[1]);
//	 	System.out.println(배열[2]);
	 	
	 	
	 	//4. 특정 문자만 추출하기.
	 	String 영화제목 = "어벤져스 인피니티 워";
	 	String 결과는 = 영화제목.substring(2);
	 	String 결과는2 = 영화제목.substring(0,4); // 어벤져스만 나오게 한다.
	 	System.out.println(결과는);
	 	System.out.println(결과는2);
	}
	
	
	// 문제1. 배열 name에 있는 원소(element)중 "kim"의 위치를 찾아
	// "kim은 x에 있습니다." 출력 나오게 로직구하기.
	// 정답) kim은 배열 1번째에 있으므로 "kim은 1번에 있습니다."가 정답.
	// hint) 오늘 배운 equals와 for문을 이용해서 풀것.
	
	// 방법1.
//	String name[] = {"Brian", "kim"};
//	for(int i=0; i<name.length; i++) {
//		boolean isCheck = name[i].equals("Kim");
//		System.out.println(isCheck);
//		if(isCheck) {
//			System.out.println("Kim은 "+i+"번에 있습니다.");
//			break;
//		}
//	}
	
	//방법2. (쌤이 선호하는 방법)
//	for(int i=0; i<name.length; i++) {
//	if(name[i].equals("Kim")) {
//		System.out.println("Kim은 "+i+"번에 있습니다.");
//		break;
//	}
// }
	
	// 문제 2. 홍길동 번호는 010-3333-9999 입니다. 길동이는 개인정보 유출을 생각해
	// 핸드폰 번호를 010-****-****로 보이게 하고 싶습니다.
	// Hint) 오늘 배운 split와 for문을 이용해서 풀것.
	
	//방법 1.
//	String phone = "010-3333-9999";
//	String array[] = phone.split("-");
//	for(int i=1; i<3; i++) {
//		array[i] = "****";
//		System.out.println("확인 =>"+array[i]);
//	}
//	String 결과 = array[0]+"-"+array[1]+"-"+array[2];
//	System.out.println(결과);
	

 }

