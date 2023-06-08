package day7.practice;

import java.util.*;

public class LCMEx {

	public static void main(String[] args) {
		//두 정수를 입력받아 두 정수의 최소공배수를 구하는 코드를 작성하세요.
		int num1, num2, i = 1;
		
		//반복횟수 : i = 1 ; 
		// 규칙성 :
		// 반복문 종료후 :
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		for( i = 1 ; i <= num1*num2 ; i++ ) {
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.println(i);
				break;	
				
			}
		
			}
		for(i = num1; ; i+=num1) {
			if(i % num2 == 0) {
				System.out.println(i);
				break;
			}
		}
		
		sc.close();
		}
			
		


		
	

}
