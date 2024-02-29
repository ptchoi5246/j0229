package t4_exam;

import java.util.Scanner;

//최대값 구하기 (초기값 지정 방식)
public class Test5_2 {
	public static void main(String[] args) {
		//단, 2자리 이하의 정수만을 입력받는다. 조건 무조건!!!
		Scanner sc = new Scanner(System.in);
		int max = -99, min = 99, su; //max, min 초기값 정해져있음!
	
		while(true) {
			System.out.println("수를 입력하세요~!  (종료시 999입력)"); //탈출구 안 만들면 무한루프
			su = sc.nextInt();
			
			if(su == 999) break;//항상 탈출구 먼저 생각하기!
			
			if(su > max) max = su;
			if (su < min) min = su; //Two Read에서 else 제외하면 오류 없어짐
		}
		
		System.out.println("최대값 : "+max+", 최소값 : " +min);
		
		sc.close();
	}
}
