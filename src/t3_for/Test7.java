package t3_for;

//중첩구문 for문 2개 바깥쪽 * 안쪽 수행문 횟수만큼 수행 !!단골손님!!
public class Test7 {
	public static void main(String[] args) {
		int cnt = 0;
		// Lable(이름atom:)을 적어주면 해당 for문을 탈출시켜줄 수 있다.
		atom:for(int i=1; i<=3; i++) {
			for(int j=1; j<=4; j++) {
				cnt++;
				System.out.println(cnt + " , i = "+i+" , j = " +j );
				
				//앞의 문장을 6번 수행 후 탈출시키고자 한다.
				if(cnt == 6) break atom; // atom 블록을 탈출시킨다.
			}
			System.out.println();			
		}	
		System.out.println("작업 끝!!!");
	}
}
