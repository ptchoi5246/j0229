package t3_for;

//중첩구문 for문 2개 바깥쪽 * 안쪽 수행문 횟수만큼 수행 !!단골손님!!
public class Test5_2a_ForFor {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=4; j++) {
				cnt++;
				System.out.println(cnt+ ". i : "+i+", j : " +j );
			}
			System.out.println(); //j :4 후에 한줄 띄우기
		}
	}
}
