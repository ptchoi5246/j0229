package t4_exam;
/* 
	 ***** 행 5번, 열5번
	 ****
	 ***
	 **
	 *
 */
public class Star6b {
	public static void main(String[] args) {
		for(int i=1; i<=5 ; i++) {
			for(int j=1; j<=6-i; j++) { //처음 *의 갯수 : 5 j<= 5 만들어주기
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
