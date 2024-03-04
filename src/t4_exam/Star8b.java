package t4_exam;
/*
		 *****
		  ****
		   ***
		    **
         *
*/
public class Star8b {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i-1; j++) { //빈칸 먼저 첫번째 숫자 0 i-1
				System.out.print(" ");
			}	
			for(int j=1; j<=6-i; j++) { //별 5 6-i
				System.out.print("*");
			}
			System.out.println();
	
		}
	}
}