package t4_exam;
/* t3 for Test5-2 같이 공부하기
		1 2 3
		4 5 6
		7 8 9 1-9까지 숫자 받아서 3번의 행과 3열씩 출력 9번 반복 :: 이중 for문 사용
 */
public class Star1b {
	public static void main(String[] args) {
		int su = 0;
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				su++;
				System.out.print(su + " "); // 1 2 3 4 5 6 7 8 9 가로 출력 
			}
			System.out.println(); //j가 3까지 끝나고 i로 갈 때 줄 띄움
		}
	}
}
