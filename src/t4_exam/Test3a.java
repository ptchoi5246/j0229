package t4_exam;

import java.util.Scanner;

// 숫자 맞추기 게임 (1~100까지의 자연수)
//정답을 입력받아야한다. Scanner sc
//랜덤 난수 발생 double rand = Math.random()
//실수형 난수 -> 정수형 난수 강제 캐스팅, 1~100까지 자연수 ((int)(Math.random()*100)+1); 
//5번 반복 : while (cnt <= 5)
//sysout 숫자를 입력하세요
//if 입력한 숫자 == 랜덤숫자 "정답" break;
//else if 입력한 숫자 != 랜덤숫자 "땡! 틀렸습니다. //else if 입력숫자 > 랜덤숫자 "더 작은 숫자를 입력하세요"
//else if 입력한 숫자 > 랜덤숫자 "더 큰 숫자를 입력하세요"
//if(cnt==6) "정답은 랜덤숫자입니다. 다음 기회에!"
public class Test3a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rand = (int)(Math.random()*100) +1; //강제 int 캐스팅 + 1~100 정수
		int cnt = 1, su;
		
		
		while(cnt <=5) {
			System.out.print(cnt+ ". 1~100까지의 숫자를 입력하세요~!  ");
			su = sc.nextInt();
			
			if(su == rand) {
				System.out.println("딩동댕~! 정답입니다! 축하합니다 :)  ");
				break;
			}
			else if(su > rand) System.out.println("땡! 더 작은 숫자를 입력하세요~!  ");
		
			else System.out.println("땡! 더 큰 숫자를 입력하세요~!  ");
			cnt++;
		}//while문 닫기
		
			if(cnt == 6) System.out.println("땡! 정답은 "+rand+"입니다. 다음 기회에~!");
			
		sc.close();
	}
}
