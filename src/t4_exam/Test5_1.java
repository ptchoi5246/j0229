package t4_exam;

import java.util.Scanner;

//최대값 구하기 (Two Read)
public class Test5_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max, min, su;
	
		System.out.println("수를 입력하세요~!  ");
		su = sc.nextInt();
		max = min = su; //Two Read

		while(true) {
			System.out.println("수를 입력하세요~!  (종료시 999입력)"); //탈출구 안 만들면 무한루프
			su = sc.nextInt();
			
			if(su == 999) break;//항상 탈출구 먼저 생각하기!
			
			if(su > max) max = su;
			else if (su < min) min = su;
		}
		
		System.out.println("최대값 : "+max+", 최소값 : " +min);
		
		sc.close();
	}
}
