package t1_while;

//반복문 제어 (반복문의 처음으로 돌려보낸다 : continue)
public class Test4_2a_Continue {
	public static void main(String[] args) {
		int i = 0;
		
		while(i < 10) {
			i++;
			
			//i값이 짝수인 경우만 출력하시오. (단 홀수인 경우는 출력하지 않고 다시 조건을 비교하도록 하시오.)
			if(i % 2 != 0) continue; //홀수인 경우 다시 while로 돌아가기 //break; //홀수인 경우 바로 탈출
			//if(i % 2 != 0) continue; 2,4,6,8,10 = 홀수일 경우 while로 돌아가니까 짝수만 출력
			// if(i % 2 == 0) continue; 1,3,5,7,9 = 짝수일 경우 while로 돌아가니까 홀수만 출력
			System.out.println(i);
		}
	}
}
