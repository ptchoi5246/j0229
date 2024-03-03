package t3_for;

//중첩구문 for문 2개 바깥쪽 * 안쪽 수행문 횟수만큼 수행 !!단골손님!!
public class Test8a_ForFor_BreakReturn {
	public static void main(String[] args) {
		int cnt = 0;
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=4; j++) {
				cnt++;
				System.out.println(cnt + " , i = "+i+" , j = " +j );
				
				//앞의 문장을 6번 수행 후 탈출시키고자 한다.
				if(cnt == 6) return; //void는 return 값 없는데 return 입력하면 전체 main 메소드 탈출 :: 작업끝 수행 안됨
			}
			System.out.println();			
		}	
	}
}

//for문 탈출 방법 : (if cnt == 6) return; 