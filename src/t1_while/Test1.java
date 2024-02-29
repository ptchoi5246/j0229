package t1_while;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("안녕하세요!!!");
		System.out.println("안녕하세요!!!");
		System.out.println("안녕하세요!!!");
		System.out.println("안녕하세요!!!");
		System.out.println("안녕하세요!!!");

		System.out.println();
		
		/*
	while(조건식) {
		조건식의 내용이 참인동안 반복 수행한다.}
	*/
		
		int cnt = 0;
		while(cnt < 5) { //범위 꼭 지정, 지정 안 하면 반복루프
			System.out.println("안녕하세요!!!");
			cnt++;
		}
	}
}
