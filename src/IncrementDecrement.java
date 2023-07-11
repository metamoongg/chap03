
public class IncrementDecrement {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
//		System.out.println(++num1); //11
//		System.out.println(num2++); //10
		
		int result1 = ++num1;  //11
		int result2 = num2++;  //10
		

		
	}
	
	public static void main3(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		System.out.println(num1);
		
		int result1 = ++num1 + 10; // 11 + 10 = 21
		int result2 = num2++ +10; // 20
		
		System.out.println("result1 =" + result1); //21
		System.out.println("result2 =" + result2); //20
		
		System.out.println("num1 =" + num1); //11
		System.out.println("num2 =" + num2); //11
		
		
		
	}

	public static void main2(String[] args) {
		
		int num = 10;
		
		++num; // num = num + 1
		System.out.println(num); //11
		
		num++; // num = num + 1
		System.out.println(num); //12
		
		
		

	}

}
