package t4_exam;

import java.util.Scanner;

//수를 여러개 입력받아 최대값 구하기 (Two Read)
public class Test5_1a_TwoRead {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max, min, su, cnt = 1;
		
		System.out.println(cnt+ ". 숫자를 입력하세요~!  ");
		su = sc.nextInt();
		max = min = su;
		cnt++;
		
		while(true) {
			System.out.println(cnt+ ". 숫자를 입력하세요~!   (종료시 999입력)");
			su = sc.nextInt();
			cnt++;
			if(su == 999) break;
			
			if(su > max) max = su;
			else if (su < min) min = su;
		}
		System.out.println("최대값 : "+max+", 최소값 : " +min);
		
		
		sc.close();
	}
}
//*오류테스트 : 가장 평범한 데이터, 가장 극단적인 데이터(정렬된 데이터 - 1,2,3,4,5 / 5,4,3,2,1)
