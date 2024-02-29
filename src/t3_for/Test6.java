package t3_for;

//중첩구문 for문 2개 바깥쪽 * 안쪽 수행문 횟수만큼 수행 !!단골손님!!
public class Test6 {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=4; j++) {
				cnt++;
				System.out.println(cnt + " , i = "+i+" , j = " +j );
				
				//앞의 문장을 6번 수행 후 탈출시키고자 한다. 
				if(cnt == 6) break; //가장 가까운 for문 탈출 :: 안쪽 for문 탈출 안쪽 구문 탈출하고 다시 while로 들어가서 i:3으로 실행
			} //실패
			System.out.println();			
		}	
		System.out.println("작업 끝!!!");
	}
}
