package t1_while;

// 무한 loop
public class Test3_4 {
	public static void main(String[] args) {
		int i = 0;
		boolean run = true; //논리형 타입, true, false;
	
		while(run) {
			i++;
			System.out.println(i + ".안녕");
			
			//if(i == 10) break;
			if(i == 10) run = false; //true 일 때 run 하니까 false 일 때 break;
		} //빨간 버튼 break
				
	}
}
