package t4_exam;
/*
 		     *
 		    **
 		   ***
 	  	****
  	 *****
*/
public class Star7a {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5-i; j++) { //빈칸 4 3 2 1 0
				System.out.print("");
			}
			for(int j=1; j<=i; j++) { //별 1 2 3 4 5
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}
