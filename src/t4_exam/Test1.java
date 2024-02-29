package t4_exam;

// 난수(무작위수) 생성
public class Test1 {
	public static void main(String[] args) {
		double rand = Math.random();//난수로 꺼낸 결과값을 실수double로 보내준다; //무작위 실수로 출력된다. 출력 될 때마다 다르다
		//0이상 ~ 1미만의 실수형 난수
		System.out.println("0.rand : " + rand);
		
		for(int i=1; i<= 5; i++) {
			System.out.println(i + ".rand : " + Math.random());
		}
		System.out.println();
		
		for(int i=1; i<= 5; i++) {
			System.out.println(i + ".rand : " + Math.random() * 10); // 0이상 ~ 10미만의 실수형 난수
		} 
		System.out.println();
		
		for(int i=1; i<= 5; i++) {
			System.out.println(i + ".rand : " + (int)(Math.random() * 10)); // 0이상 ~ 10미만의 정수형 난수 (정수로 casting)		
		}
		System.out.println();
		
		for(int i=1; i<= 5; i++) {
			System.out.println(i + ".rand : " + ((int)(Math.random() * 10) + 1)); //1이상 10이하의 정수형 난수		
		}
		System.out.println();

		for(int i=1; i<= 5; i++) {
			System.out.println(i + ".rand : " + ((int)(Math.random() * 45) + 1)); //1이상 45이하의 정수형 난수 45는 끝수, 1은 시작수
		}	
	}
}	