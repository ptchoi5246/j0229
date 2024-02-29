package t4_exam;
/* 
	 ***** 행 5번, 열5번
	 ****
	 ***
	 **
	 *
 */
public class Star6 {
	public static void main(String[] args) {
		
			for(int i=1; i<=5; i++) { //행 가로
			for(int j=1; j<=6-i; j++) { //열 세로 //처음을 생각해서 j<=5 수정!
				System.out.print("*"); //("*") 총 별이 5 5 5 5 5
			}
			System.out.println();
		}		
	}
}
//정보처리 기능사 실기 문제 : 달팽이