
public class NanInfinityExample {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 0;
		
	//	int result = num1/ num2; // (X)
		
		double d1 = 5;
		double d2 = 0;
		double result1 = d1 / d2; // Infinity
		double result2 = d1 % d2; // NaN
		
		
		System.out.println("reault1=" + result1);
		System.out.println("reault2=" + result2);
		System.out.println(Double.isInfinite(result1));
		System.out.println(Double.isNaN(result2)); // NaN인지 확인하기 - NaN : 넘버X특정지을수없는무언가 EX)0/0
		
		System.out.println(result2 == Double.NaN); //false
		
		
	}

}
