package day4.ifex;

import java.util.*;

public class IFMultipleEx2 {

	public static void main(String[] args) {
		//정수 num를 입력받아 num가 2의 배수이면 2의 배수라고 출력하고
		//3의 배수이면 3의 배수라고 출력하고, 6의 배수이면 6의배수라고 출력하고
		//2,3,6의 배수가 아니면 2,3,6의 배수가 아니라고 출력하는 코드를 작성
		//예 : 6은 6의 배수
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("input integer number : ");
		num = sc.nextInt();
		
		//6의 배수가 아닌 2의 배수만 찾기위해 2의 배수이지만 3의 배수가 아닌
		//정수를 확인 if(num % 2 == 0 && num % 3 != 0)
		//6은 6의 배수라고 나타내고 싶을땐 순서를 맨위로.
		if(num % 6 == 0) { 
			System.out.println("6의 배수입니다.");
		}else if(num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}else if(num % 2 == 0) {
			System.out.println("2의 배수입니다.");
		}else {
			System.out.println("2,3,6의 배수가 아닙니다.");
		}
		
		sc.close();
	}

}
