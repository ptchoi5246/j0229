package t3_for;

//중첩구문 for문 2개 바깥쪽 * 안쪽 수행문 횟수만큼 수행 !!단골손님!!
public class Test7a_ForFor_BreakAtom {
	public static void main(String[] args) {
		int cnt = 0;
		// Lable(이름atom:)을 적어주면 해당 for문을 탈출시켜줄 수 있다.
		atom:for(int i=1; i<=3; i++) {
			for(int j=1; j<=4; j++) {
				cnt++;
				System.out.println(cnt+ ". i : "+i+", j : " +j );
				
				if(cnt == 6) break atom; //atom 전체 break
			}
			System.out.println(); //j :4 후에 한줄 띄우기
		}
	}
}

////for문 탈출 방법 : atom : for... if(cnt == 6) break atom;
