package t3_for;

/*
  for(int i=초기값; 조건식; 증감자){
  	조건을 만족할 때 수행처리할 내용...
  }
  */
public class Test4a_Break {
	public static void main(String[] args) {
		//조건을 만족한다면 해당 조건만큼만 처리할 내용을 수행한다.
		int i = 0;
		for(; ;) { //아무것도 안 쓰면 조건을 true로 본다. 무한루프 break;
			i++;
			System.out.println(i);
			if(i == 10) break; //break 조건 무조건 걸어줘야한다.
		}
	}
}
