package t4_exam;
/* t3 for Test5-2 같이 공부하기
		9 8 7
		6 5 4
		3 2 1 1-9까지 숫자 받아서 3번의 행과 3열씩 출력 9번 반복 :: 이중 for문 사용
 */
public class Star2 {
	public static void main(String[] args) {
		int su = 10; //10으로 수정
		
		for(int i=1; i<=3; i++) { //행 가로
			for(int j=1; j<=3; j++) { //열 세로
				su--; //-- 수정
				System.out.print(su + " "); 
			}
			System.out.println();
		}		
	}
}
//수정