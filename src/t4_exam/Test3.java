package t4_exam;

import java.util.Scanner;

// 숫자 맞추기 게임 (1~100까지의 자연수)
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1~100까지의 난수 발생
		int rand = (int)(Math.random()*100) + 1; // (강제 정수)(난수()*~까지의 수) + ~부터의 수
		int cnt = 1, su; // 입력받을 수 su
		
		while(cnt <= 5) { //반복문 while
			System.out.print(cnt + ". 1~100까지의 수를 입력하세요~!  ");
			su = sc.nextInt();
			
			if(su == rand) { //
				System.out.println("축하합니다!정답입니다! ");
				break;
			}
			else if(su > rand) System.out.println("더 작은 수를 입력하세요~!  ");
			else System.out.println("더 큰수를 입력하세요~!  ");
			cnt++; //없으면 무한루프, 5번만 수행하도록 입력
		}	
		if(cnt == 6) System.out.println("정답은" + rand + "입니다! 아쉽지만 다음 기회에,,,,!  ");//5일때 까지는 수행, 6이면 탈출
		
		sc.close();
	}
}


//랜덤 난수 발생
//실수형 난수 - 정수형 난수 강제 캐스팅
//5번 반복 : 반복문 while(cnt <= 5) , 숫자를 입력하세요 출력
//if 입력한 숫자 == 랜덤숫자 "정답" break;
//else if 입력한 숫자 != 랜덤숫자 "오답" 반복 //맞춰야 되는 거니까 else if 입력한 숫자 > 랜덤 숫자 "더 작은 수를 입력하세요"
//else if 입력한 숫자 < 랜덤 숫자 "더 큰 수를 입력하세요" -> else "더 큰 수를 입력하세요"
//while문 나가서 횟수가 6번 이상, if(cnt == 6) "정답은 랜덤숫자입니다. 다음 기회에!"