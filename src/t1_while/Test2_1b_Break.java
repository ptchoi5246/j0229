package t1_while;

import java.util.Scanner;

//반복문 탈출(break) :: 1부터 출력할 수와 탈출할 수를 입력받아 나열하시오
public class Test2_1b_Break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0, su = 0, breaksu = 0;
		
		System.out.println("1부터 출력할 수를 입력하세요~!  ");
		su = sc.nextInt();
		System.out.println("탈출할 수를 입력하세요~!  ");
		breaksu = sc.nextInt();
		
		while (i < su) {
			i++;
			System.out.println(i);
			
			if(i == breaksu) break;
		}
		
		sc.close();
	}
}