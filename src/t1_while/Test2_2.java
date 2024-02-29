package t1_while;

import java.util.Scanner;

// 반복문 탈출(break)
public class Test2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0, su, breakSu; //i: 출력되는 숫자, su: 1부터 출력할 숫자, breakSu: 탈출할 숫자;
		
		while(true) {
			System.out.print("1부터 출력할 수를 입력하세요~~! "); //첫번째 수가 탈출할 수보다 무조건 커야한다.
			su = sc.nextInt();
			System.out.print("탈출할 수를 입력하세요~~! ");
			breakSu = sc.nextInt();
			//ex. 1부터 출력할 숫자 : 10, 탈출할 숫자 : 5;
			if(su >= breakSu) break; 
			else System.out.println("첫번째수는 두번째수보다 더 큰수를 입력하셔야 합니다.\n");
		}
		
		while(i < su) {
			i++;
			System.out.println(i);
			
			if(i == breakSu) break;
		} //ex. i가 10보다 작으니까 출력; 탈출할 숫자 5랑 같으면 탈출 :: 10까지 출력이 안 되고 1-5까지만 출력;
		
		sc.close();
	}
}
