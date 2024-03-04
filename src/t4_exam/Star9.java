package t4_exam;

import java.util.Scanner;

/*
        * 
		   ***
		  *****
		 *******
		*********
		 *******
		  *****
		   ***
        *
*/

public class Star9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //중간 별의 갯수를 입력받는다.
		
		sc.close();
	}
}	
/*
 		
		
		while(true) {
			System.out.println("홀수인 숫자를 입력하세요.  ");
			mid = sc.nextInt();
			if(mid % 2 ==0) System.out.println("짝수를 입력했습니다. 홀수를 입력해주세요\n");
			else break;
		}
		
		for(int i=1; i<=mid; i+=2) { //중간 숫자를 입력 받았으니 입력받은 숫자만큼 반복
			for(int j=1; j<=(mid-1)/2; j++) { //빈칸 첫번째 값 4니까 (mid-1)/2
				System.out.print(" "); //빈칸 입력
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*"); //별 입력 i랑 똑같이 반복
			}
			System.out.println(); //증가 별
		}	
		
		for(int i=(mid-2); i>=1; i-=2) {
			for(int j=1; j<=(mid-i)/2; j++) {
				System.out.print(" "); //빈칸입력
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
		} System.out.println();
	
		
		sc.close();		
	}
}
*/