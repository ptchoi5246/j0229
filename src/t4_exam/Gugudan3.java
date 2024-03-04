package t4_exam;

public class Gugudan3 {
	public static void main(String[] args) {
		// 2단에서 5단까지 출력하시오. 반복문 사용
		
		for(int i=2; i<=5 ; i++) { //시작단;끝단 바깥쪽 for문 : *단			
			System.out.println(i + "단");
			for(int j=1; j<=9; j++) { //안쪽 for문 : 구구단 반복
				System.out.println(i+ " * "+j+" = " + (i * j));
			}
			System.out.println("====================");
		}	
	}
}
