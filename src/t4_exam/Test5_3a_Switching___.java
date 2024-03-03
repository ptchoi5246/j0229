package t4_exam;

import java.util.Scanner;

//수를 여러개 입력받아 최대값 구하기 (max, min 초기값 지정 방식) = Switching기법 적용
public class Test5_3a_Switching___ {
	public static void main(String[] args) {
		//단, 2자리 이하의 정수만을 입력받는다. 조건 무조건!!!
		Scanner sc = new Scanner(System.in);
		int max = -99, min = 99, su, cnt=1, sw = 0; //max, min 초기값 정해져있음!
	
		while(true) {
			System.out.println(cnt+ ". 2자리 이하의 정수를 입력하세요~!  (종료시 999입력)"); //탈출구 안 만들면 무한루프
			su = sc.nextInt();
			cnt++;
			
			if(su == 999) break;//항상 탈출구 먼저 생각하기!
			
			if(su > max) {
				max = su;
				if (sw == 0) {
					sw = 1;
					if(sw < min) min = su;
				}
			}	
			else if(su < min) min = su; //Two Read에서 else 제외하면 오류 없어짐, switching 사용하면 else 꼭 사용!
		}
		
		System.out.println("최대값 : "+max+", 최소값 : " +min);
		
		sc.close();
	}
}
