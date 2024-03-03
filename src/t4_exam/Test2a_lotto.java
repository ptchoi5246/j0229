package t4_exam;

//1~45까지의 로또번호를 출력하시오
public class Test2a_lotto {
	public static void main(String[] args) {
		int lotto = 0;
		String str = " ";
		
		for(int i=0; i<=6; i++) {
			lotto = ((int)(Math.random()*45) +1);
			str += lotto + " / "; //숫자 누적
		}
		System.out.println("이번주의 로또번호는 "+str);
	}
}
