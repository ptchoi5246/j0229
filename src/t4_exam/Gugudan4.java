package t4_exam;

import java.util.Scanner;

public class Gugudan4 {
	public static void main(String[] args) {
		// 시작단에서 끝단까지 출력하시오. 반복문
		
		Scanner sc = new Scanner(System.in);
		int startDan, endDan;
		
		System.out.print("시작 단을 입력하세요~!  ");
		startDan = sc.nextInt();
		System.out.print("끝 단을 입력하세요~!  ");
		endDan = sc.nextInt();
		
		for(int i=startDan; i<=endDan ; i++) { //시작단;끝단 바깥쪽 for문 : *단			
			System.out.println(i + "단");
			for(int j=1; j<=9; j++) { //안쪽 for문 : 구구단 반복
				System.out.println(i+ " * "+j+" = " + (i * j));
			}
			System.out.println("====================");
		}	
		
		sc.close();
	}
}
