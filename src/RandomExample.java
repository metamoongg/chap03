
public class RandomExample {

	public static void main(String[] args) {

		System.out.println(Math.random()); // 랜덤 숫자 [0. ~ 1)
		
		
		// 1. 주사위 [1 ~ 6]
		
		System.out.println((int)(Math.random()*6)); // [0 ~ 6)
		System.out.println((int)(Math.random()*6) + 1); // [1 ~ 6]
		
		// 2. [30 ~ 37]
		//	  [0 ~ 7](8) + 30 ==> [30 ~ 37]
		
		System.out.println((int)(Math.random()*8) + 30); // [30 ~ 37]
		
		// 3. [A ~ Z]
		//	  [0 ~ 25] + 'A'
		
		char ch = (char)(Math.random()*26 + 'A');
		System.out.println(ch);

		// 4. [1 ~ 45]
		// [0 ~ 44] + 1
		
		System.out.println((int)(Math.random()*45) + 1);

		
		
	}

}
