package t4_exam;
/* 
   *
   **
   ***
   ****
   ***** 행 5번, 열5번
 */
public class Star5a {
	public static void main(String[] args) {
			for(int i=1; i<=5; i++) { //행 가로
			for(int j=1; j<=i; j++) { //열 세로 j<=i 수정
				System.out.print("*"); //("*") 총 별이 5 5 5 5 5
			}
			System.out.println();
		}		
	}
}
//정보처리 기능사 실기 문제 : 달팽이