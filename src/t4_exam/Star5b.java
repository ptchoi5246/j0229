package t4_exam;
/* 
   *
   **
   ***
   ****
   ***** 행 5번, 열5번
 */
public class Star5b {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) { //* j<=i
				System.out.print("*");
			}
			System.out.println(); //빈칸
		}
	}
}
