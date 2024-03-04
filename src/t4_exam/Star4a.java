package t4_exam;
/* t3 for Test5-2 같이 공부하기
		3 2 1 
		6 5 4
		9 8 7 
 */
public class Star4a {
	public static void main(String[] args) {
		int su = 4;
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				su--;
				System.out.print(su + " ");
			}
			su +=6;
			System.out.println();
		}
	}
}
//