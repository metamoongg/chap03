
public class testjava {
	
	
	public static void main(String[] args) {
		
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자 코드는 65
		
		System.out.println(1 + x << 33); 				//
		System.out.println(y >= 5 || x < 0 && x > 2);	//
		System.out.println(y += 10 - x++);				//13  y=15 , x=3
		System.out.println(x += 2);						//x=5
		System.out.println(!('A' <= c && c <='Z'));		//
		System.out.println('C' - c);					//
		System.out.println('5' - '0');					//
		System.out.println(c + 1);						//66
		System.out.println(++c);						//66
		System.out.println(c++);						//66 c=67
		System.out.println(c);							//67
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

	public static void main2(String[] args) {

		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		
		System.out.println(z); //31
		
		System.out.println(y); // 19
		System.out.println(x + y); //30
		
		
		
		int score = 85;
		String result = (!(score>90)) ? "가" : "나";
		System.out.println(result); //가
		

	}

}
