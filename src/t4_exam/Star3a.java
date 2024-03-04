package t4_exam;
/* t3 for Test5-2 같이 공부하기
		1 4 7 
		2 5 8
		3 6 9 
*/		
public class Star3a {
	public static void main(String[] args) {
		int su = -2;
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				su = su+3;
				System.out.print(su + " ");
			}
			su = su-8;
			System.out.println();
		}
		
	}
}
