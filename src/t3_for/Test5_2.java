package t3_for;

//중첩구문 for문 2개 바깥쪽 * 안쪽 수행문 횟수만큼 수행 !!단골손님!!
public class Test5_2 {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=4; j++) {
				cnt++;
				System.out.println(cnt + " , i = "+i+" , j = " +j );
			}
			System.out.println();
			//안쪽 구문 먼저 수행하고 바깥쪽 구문 수행하고 다시 안쪽 구문 수행
		}	// i:1, j:1,2,3,4/ i:2, j:1,2,3,4 / i:3 j:1,2,3,4
	}	// 한번 더 이해해보기!!
}
