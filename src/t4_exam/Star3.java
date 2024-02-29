package t4_exam;
/* t3 for Test5-2 같이 공부하기
		1 4 7 /먼저
		2 5 8
		3 6 9 1-9까지 숫자 받아서 3번의 행과 3열씩 출력 9번 반복 :: 이중 for문 사용
 */ //행으로 먼저 증가 = 바깥쪽 열, 안쪽 행;
public class Star3 {
	public static void main(String[] args) {
		int su = -2; //su + 3 = 14줄 su
		
		for(int i=1; i<=3; i++) { //행 가로
			for(int j=1; j<=3; j++) { //열 세로
				su += 3;
				System.out.print(su + " "); 
			}
			su -= 8;
			System.out.println();
		}		
	}
}
//정보처리 기능사 실기 문제 : 달팽이