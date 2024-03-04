package t4_exam;

import java.util.Scanner;

//수를 여러개 입력받아 최대값 구하기 (max, min 초기값 지정 방식) = Switching기법 적용
public class Test5_3b_Switching___ {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int su, max = -99, min = 99, sw = 0;
		
		while(true) {
			System.out.println("숫자를 입력하세요.   (종료시 999)");
			su = sc.nextInt();
			
			if(su == 999) break;
			
			if(su > max) {
				max = su;
				if (sw == 0) {
					sw = 1;
					if(sw < min) min = su;
				}		
			}
			else if(su < min) min = su;		
		}
		System.out.println("최대값 : " +max+ ", 최소값 : " +min);		
		
		sc.close();				
		
	}
}
