
public class TerneryOperatorExample {
	
	
	public static void main2(String[] args) {
		
		double r1 = Math.random(); // [0.~ 1)
		System.out.println(r1);  // 랜덤숫자
		
		System.out.println(r1 * 100);  // 랜덤 정수 만들기
		System.out.println((int)(r1 * 100));  // 랜덤 정수 만들기 , 소수점 버리기
		
		
		
	}

	public static void main(String[] args) {

		int num = (int)(Math.random()*100); 			// [0. ~ 1)
	
		System.out.println(num%2 == 0 ? "짝수" : "홀수"); // 짝수
						  //  조건식    ?  true : false
		
		System.out.println(num);
		
		
		
	}

}
