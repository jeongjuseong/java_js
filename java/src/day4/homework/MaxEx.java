package day4.homework;

import java.util.*;

public class MaxEx {

	public static void main(String[] args) {
		//두 정수를 입력받아 두 정수 중 큰 수를 출력하는 코드를 작성하세요.
	
		int num1, num2;
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 >= num2) {
			max = num1;
		}else {
			max = num2;			
		}
		
		System.out.println(num1 + "과" + num2 + " 중 더 큰수는 " + max + " 입니다.");
		
		
		sc.close();
	}

}
