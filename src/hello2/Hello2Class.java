package hello2;
import java.util.Scanner;

public class Hello2Class {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		// 사귈 수 있는 확률높은 고백 횟수
		//1번 후보는 2번
		//2번 후보는 3번
		//3번 후보는 1번
		//4번 후보는 5번
		//5번 후보는 10번
		
		// 시도 횟수
		int tr;
		System.out.println();
		System.out.println("================================");
		System.out.print("고백 시도횟수를 입력해주세요(0 이상의 수): ");
		tr = sc.nextInt();
		
		// 조건문
		while(tr<0) {
			System.out.print("시도횟수를 입력해주세요(0이상의 수): "); 
			tr = sc.nextInt();
		}
		
		
		int [] odds = {2,3,1,5,10};
		
		// 
		int man_num = 0;
		
		for(int i=0;i<odds.length;i++) {
			for(int j=1;j<=tr;j++) {
				System.out.println(man_num+1+"번 후보는 "+j+"회 고백을 시도했다");
				
				
				//if 고백 확률이 높을 때 고백하면
				if(i==odds[man_num]) {		
					System.out.println("모솔 탈출");
					System.out.println();
					System.out.println("==> 그 위치에서 나름대로 행복하세요  <==");
					System.out.println();
					tr -= 1;
					break;
				}else {
					System.out.println("솔로입니다");
				}
				
				System.out.println();
			}
			
			man_num++; //다음 솔로~

			if(tr==0) break;
		}
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
