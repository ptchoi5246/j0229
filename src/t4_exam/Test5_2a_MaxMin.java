package t4_exam;

import java.util.Scanner;

//수를 여러개 입력받아 최대값 구하기 (max, min 초기값 지정 방식)
public class Test5_2a_MaxMin {
	public static void main(String[] args) {
		//단, 2자리 이하의 정수만을 입력받는다. 조건 무조건!!!
		Scanner sc = new Scanner(System.in);
		int max = -99, min = 99, su, cnt=1; //max, min 초기값 정해져있음!
	
		while(true) {
			System.out.println(cnt+ ". 2자리 이하의 정수를 입력하세요~!  (종료시 999입력)"); //탈출구 안 만들면 무한루프
			su = sc.nextInt();
			cnt++;
			if(su == 999) break;//항상 탈출구 먼저 생각하기!
			
			if(su > max) max = su;
			if (su < min) min = su; //Two Read에서 else 제외하면 오류 없어짐
		}
		
		System.out.println("최대값 : "+max+", 최소값 : " +min);
		
		sc.close();
	}
}
//*오류테스트 : 가장 평범한 데이터, 가장 극단적인 데이터(정렬된 데이터 - 1,2,3,4,5 / 5,4,3,2,1)
