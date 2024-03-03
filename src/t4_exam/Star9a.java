package t4_exam;
/*
        * 
		   ***
		  *****
		 *******
		*********
		 *******
		  *****
		   ***
        *
*/

public class Star9a {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}

//모든 행의 갯수는 9개, 홀수가 나와야지 예쁘다 홀수별 그리기
//절반은 쪼갠다 위-증가별 아래-감소별
//중간 별의 갯수는 입력받는다
//위쪽별 9 왼쪽 4공백 *1 3공백 *2 
//짝수 : 2n 홀수 : 2n +1 또는 2n -1
//인터넷에 예제가 많다
