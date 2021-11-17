package hello2;

public class HelloClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int st; //변수명은 숫자로 시작할 수 있다
		int a; // 변수명에 특수문자를 사용할 수 없다
		//int classa ; //키워드를 변수명으로 사용할 수 없다
		
		// 안녕하세요
		// 나는 누구 입니다
		// 잘 부탁합니다
		
		String b ="너를"; // 문자열 변수 선언
		String c = "나를";
		a = 0; // 위에 미리 선언됨 중복 불가		
		System.out.println("나는" + b + "좋아한다");
		System.out.println("너는"+ c +"좋아하지않는다");
		System.out.println("내가"  + b + "더 좋아한다");
		System.out.println("너는 나에게 넘어온다");
		System.out.print("너에대한 나의 마음은?");
		System.out.println(a); // println 은 출력하고 줄바꿈도 포함 
	}

}