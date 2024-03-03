package t4_exam;

import java.util.Scanner;

// 숫자 맞추기 게임 (1~100까지의 자연수)
public class Test3b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rand = (int)(Math.random()*100) +1;
		int cnt =1, su;
		
		while(cnt <= 5) {
			System.out.print(cnt + ". 1~100까지의 숫자를 입력하세요~!  ");
			su = sc.nextInt();
			
			if(su == rand) {
				System.out.println("딩동댕~! 정답입니다! 축하합니다 :)");
				break;
			}
			else if(su > rand) System.out.println(cnt + ". 땡!!! 더 작은 숫자를 입력하세요~!  ");
			else System.out.println("땡!!! 더 큰 숫자를 입력하세요~!  ");
			cnt++;			
		}
			if(cnt==6) System.out.println("땡! 정답은 "+rand+"입니다. 다음 기회에~!!!");
		
		sc.close();
	}
}
