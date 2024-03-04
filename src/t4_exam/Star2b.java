package t4_exam;
/* t3 for Test5-2 같이 공부하기
		9 8 7
		6 5 4
		3 2 1
 */
public class Star2b {
	public static void main(String[] args) {
		int su = 10; //10으로 수정, 첫번째 값이 9니까 for (j)에서 su = su-1; => su 초기값 10
		
		for(int i=1; i<=3; i++) {//행
			for(int j=1; j<=3; j++) { //열
				su--;
				System.out.print(su + " ");
			}
			System.out.println(); //j가 다 돌고 i로 돌아갈 때 줄 바꿈
		}		
	}
}