package day4.ifex;

import java.util.*;

public class IfMultifleEx1 {

	public static void main(String[] args) {
		//정수 num를 입력받아 num가 2의 배수인지 아닌지 판별하는 코드를 작성
		
		int num;
		System.out.println("input number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		//num이 2로나눌때 나머지가 0이고2의배수여야한다.
		if(num % 2 == 0) {
			System.out.println("2의 배수입니다.");
		}else {
			System.out.println("2의 배수가 아닙니다.");
		}
			sc.close();

	}

}
