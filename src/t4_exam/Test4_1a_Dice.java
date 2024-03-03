package t4_exam;

import java.util.Scanner;

//주사위 숫자 정답 맞추기 (주사위 1개)
public class Test4_1a_Dice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("주사위 숫자를 맞춰보세요~!!!");
		int num = sc.nextInt();
		
		int dice = (int)(Math.random()*6) +1;
		
		if(num == dice) System.out.println("딩동댕~! 정답입니다!!!");
		else System.out.println("땡! 정답은 "+dice+" 입니다. 다음 기회에....");
		
		
		sc.close();
	}
}
