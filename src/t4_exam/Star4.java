package t4_exam;
/* t3 for Test5-2 같이 공부하기
		3 2 1 /먼저
		6 5 4
		9 8 7 1-9까지 숫자 받아서 3번의 행과 3열씩 출력 9번 반복 :: 이중 for문 사용
 */ //행으로 먼저 증가 = 바깥쪽 열, 안쪽 행;
public class Star4 {
	public static void main(String[] args) {
		int su = 4; //su -- 해서 14열 su
		
		for(int i=1; i<=3; i++) { //행 가로
			for(int j=1; j<=3; j++) { //열 세로
				su-- ;
				System.out.print(su + " "); 
			}
			su += 6;
			System.out.println();
		}		
	}
}
//정보처리 기능사 실기 문제 : 달팽이