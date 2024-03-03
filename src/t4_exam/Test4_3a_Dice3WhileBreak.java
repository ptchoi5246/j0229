package t4_exam;

import java.util.Scanner;

//주사위 숫자 정답 맞추기 (주사위 1개)
public class Test4_3a_Dice3WhileBreak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, dice, ans;
		while(true) {
			while(true) { //입력하는 숫자의 범위를 지정
				System.out.println("주사위 숫자를 맞춰보세요~!!!");
				num = sc.nextInt();
			
				if (num >= 1 && num <= 6) break;
				System.out.println("1~6까지의 숫자를 입력하세요~!  ");
			}
		
			dice = (int)(Math.random()*6) +1;
		
			if(num == dice) System.out.println("딩동댕~! 정답입니다!!!");
			else System.out.println("땡! 정답은 "+dice+" 입니다. 다음 기회에....");
		
			System.out.println("계속 하시겠습니까??? (1 : 계속, 0 : 그만)");
			ans = sc.nextInt();
		
			if(ans == 0) break;
			System.out.println();
		}	
		System.out.println("게임이 끝났습니다. 안녕히 가세요.");
		
		sc.close();
	}
}
