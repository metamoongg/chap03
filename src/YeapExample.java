

public class YeapExample {
	
	
	public static void main(String[] args) {
		
		//윤년과 평년 계산식
		
		int year = (int)(Math.random()*5000 +1);
		
		System.out.println(year);
		String yeap = (year%4 == 0 && year%100!=0) || year%400 == 0 ? "윤년" : "평년";
		
		System.out.println(yeap);
		
		
		
	}
	
	public static void main3(String[] args) {
		
		double oneYear = 365.2422;
		double tenYear = oneYear * 100;
		
		System.out.println(tenYear); 					// 36524.22
		System.out.println((366 * 25) + (365 * 75));  	// 36525
		
		// - 4년 윤년 / 100년 평년 / 400년 윤년 EX) 2000년(윤년)
		
		
		
		
		
		
	}
	

	public static void main2(String[] args) {
		
		double oneYear = 365.2422;
		double fourYear = oneYear * 4;
		System.out.println(fourYear);
		
		System.out.println(365*4);
		
		
		
		
		
		
	}

}
