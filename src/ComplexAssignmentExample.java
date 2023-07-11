
public class ComplexAssignmentExample {

	public static void main(String[] args) {

		int num = 100;
		
		num = num + 10;		//같은식
		num += 10;			//같은식
		
		System.out.println(num); //120
		
		int num2 = 100;
		num2 *= 2 + 3; 		// 500 = ( 2 + 3 ) * 100  
							//- <복합대입연산자>는 우선순위가 가장 낮음
		System.out.println(num2);
		
		
	}

}
