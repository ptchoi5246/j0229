package t1_while;

import java.util.Scanner;

// 반복문 탈출(break) 1부터 출력할 숫자, 탈출할 숫자 입력받는데 단, 출력할 숫자가 탈출할 숫자보다 무조건 커야한다.
public class Test2_2b_Break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0, su, breakSu; //i: 출력되는 숫자, su: 1부터 출력할 숫자, breakSu: 탈출할 숫자;
		
		while(true) {
			System.out.print("1부터 출력될 숫자를 입력하세요~!  ");
			su = sc.nextInt();
			System.out.print("탈출할 숫자를 입력하세요~!  ");
			breakSu = sc.nextInt();
			
			if(su >= breakSu) break;
			else System.out.println("첫번째 입력하는 숫자는 두번째 입력하는 숫자보다 더 커야합니다.  ");
					
		}
		
		while(i < su) {
			i++;
			System.out.println(i);
			
			if(i == breakSu) break;
		} 
		
		sc.close();
	}
}
