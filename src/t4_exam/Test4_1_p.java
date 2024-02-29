package t4_exam;

import java.util.Scanner;

//1개의 주사위를 던졌을 때 나오는 숫자 맞추기 게임
public class Test4_1_p {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//주사위 눈금 입력받기	
		System.out.println("출력될 주사위의 숫자를 입력하세요~!!!  ");
		int su = sc.nextInt();
		// su = 주사위 눈금
		int rand = (int)(Math.random()*6) + 1;
		// 실수형 난수 정수형 난수로 캐스팅 *~까지의 숫자) + ~부터의 숫자
		if (su == rand) System.out.println("딩동댕@ 정답입니다~!!!"); //입력한 숫자 = 주사위 숫자 같으면 
		else System.out.println("땡!!! 주사위의 눈금은 " +rand+ "입니다!!!"); //그렇지 않다면!
		
		
		sc.close();		
	}
}
