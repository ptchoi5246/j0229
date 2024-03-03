package t3_for;

//중첩구문 for문 2개 바깥쪽 * 안쪽 수행문 횟수만큼 수행 !!단골손님!!
public class Test5_1a_ForFor {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i=1; i<=3; i++) { //1,2,3
			for(int j=1; j<=4; j++) { //1,2,3,4
				cnt++;
				System.out.println(cnt);
			} //1-12까지 출력
		}		
	}
}
