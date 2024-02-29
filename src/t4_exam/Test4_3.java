package t4_exam;

import java.util.Scanner;

// 1개의 주사위를 던졌을때 나오는 숫자 맞추기 게임
public class Test4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su , rand, ans;

		//rand = (int)(Math.random()*6) + 1; //처음에 난수 딱 고정, 계속 반복해도 같은 숫자
	
		while(true) { //다시 하시겠습니까? yes 처음으로 돌아갈 떄 전체 while로 묶기
			while(true) {
				System.out.print("출력될 주사위 눈금을 입력하세요? ");
				su = sc.nextInt();
				
				if(su >= 1 && su <= 6) break;
				System.out.println("1~6까지의 수를 입력하세요");
			}
			
			rand = (int)(Math.random()*6) + 1; //다시 할 때마다 난수 새로 발생, 정답이 자꾸 달라진다
			
			if(su == rand) System.out.println("정답입니다.");
			else System.out.println("틀렸습니다. 출력된 주사위 눈금은 "+rand+" 입니다.");
			
			System.out.print("계속 하시겠습니까??? (계속 : 1 그만 : 0)");
			ans = sc.nextInt();
			
			if(ans == 0 ) break; //그만 한다면 break, 0일때만 break, 나머지 숫자는 계속 반복 // 잘 못 나가게 할 때만 정확한 숫자만 입력하게 만듬 
			System.out.println();
		}
		System.out.println("게임이 끝났습니다~!!!  " );
		
		sc.close();
	}
}
