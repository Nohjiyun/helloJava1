package hello2;
import java.util.Scanner;
import java.util.Random;

public class Hello2Class {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int[] odds = new int[5];        // size는 발생시킬 난수의 개수
		Random rd = new Random();
		 
		for(int r=0;r<5;r++) {
		    odds[r] = rd.nextInt(100)+1; //1 ~ 100까지의 무작위 정수 한 개 발생
		}
		
		// 사귈 수 있는 확률높은 고백 횟수
		
		// 시도 횟수
		int tr;
		System.out.println();
		System.out.println("================================");
		System.out.print("고백 시도횟수를 입력해주세요(0과 100사이의 수 입력)>> ");
		tr = sc.nextInt();
		
		// 조건문
		while(tr<=0) {
			System.out.print("시도횟수를 입력해주세요(0이상의 수): "); 
			tr = sc.nextInt();
		}
		
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
		for(int k=0;k<odds.length;k++) System.out.println((k+1)+"고백 성공 예측 횟수 :"+odds[k]);
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
