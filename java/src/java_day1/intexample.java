package java_day1;

public class intexample {

	public static void main(String[] args) {
		int num2 = 11 ; // 십진수 11 
		int num3 = 0b11; // 2진수 11 == 10진수3
		int num4 = 011; // 8진수 11 == 10진수 9
		int num5 = 0x11; // 16진수 11 == 10진수 17
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		//1234567890123은 int로 표현할수 없는 큰 숫자
		//long 타입의 큰 숫자를 저장할 경우 리터럴에 L또는 l을 반드시 붙여야함.
		long num6 = 1234567890123L;
	
	}

}
