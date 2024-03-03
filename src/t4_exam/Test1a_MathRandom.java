package t4_exam;

// 난수(무작위수) 생성
public class Test1a_MathRandom {
	public static void main(String[] args) {
		double rand = Math.random();//난수로 꺼낸 결과값을 실수double로 보내준다; //무작위 실수로 출력된다. 출력 될 때마다 다르다
		//0이상 ~ 1미만의 실수형 난수
		System.out.println("0.rand : " + rand);
		//0.rand : 0.xxxxx
		System.out.println(); //한줄 띄우기
		
		for(int i=1; i<=5; i++) {
			System.out.println(i + ".rand : " + Math.random());
			//1-5. rand : 0.xxxxx
		}
		System.out.println(); //한줄 띄우기
		
		for(int i=6; i<=10; i++) {
			System.out.println(i + ".rand : " + Math.random() * 10);
			//6-10. rand : 정수.xxxx :: *10 했기 때문에 // 0이상 ~ 10미만의 실수형 난수
		}
		System.out.println(); //한줄 띄우기
		
		for(int i=11; i<=15; i++) {
			System.out.println(i + ".rand : " + (int)(Math.random() * 10));
			//11-15. rand : 정수 :: 강제 int 캐스팅 // 0이상 ~ 10미만의 정수형 난수 (정수로 casting)		
		}
		System.out.println(); //한줄 띄우기
		
		for(int i=16; i<=20; i++) {
			System.out.println(i + ".rand : " + ((int)(Math.random() * 10) + 1));
			//16-20. rand : 정수 :: 강제 int 캐스팅 // 1 ~ 10이하의 정수형 난수
			// ((int)(Math.random()) * ~이하 ) + ~이상);
		}
		System.out.println(); //한줄 띄우기
		
		for(int i=21; i<=25; i++) {
			System.out.println(i + ".rand : " + ((int)(Math.random() *45) +1));
		}
			//21-25. rand : 정수 :: 강제 int 캐스팅 // 1이상 45이하의 정수형 난수 45는 끝수, 1은 시작수
	}
}	