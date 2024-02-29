package t4_exam;

import java.util.Scanner;

// 숫자 맞추기 게임 (1~100까지의 자연수)
public class Test3a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rand = (int)(Math.random()*100) + 1;
		
		
		
		
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