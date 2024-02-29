package t4_exam;

public class Test2 {
	public static void main(String[] args) {
		int lotto;
		String str = " ";
		
		for(int i=1; i<=6; i++) {
			lotto = (int)(Math.random()*45 + 1); //실수형 난수*~까지의 숫자 + ~에서 숫자
			str += lotto + " / "; //할당연산자 : 누적의 이미 str = str + lotto; str +=lotto
		}
		System.out.println("금주의 로또 번호는!!! " + str); //같은 번호가 나올 경우도 있다.
	}
}
