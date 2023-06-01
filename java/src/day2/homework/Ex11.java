package day2.homework;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		//ex1 의 풀이.
		int num1, num2;
		char operator;
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수와 산술연산자를 입력하세요 (예:1 + 2) : ");
		num1 = sc.nextInt();
		operator = sc.next().charAt(0);
		num2 = sc.nextInt();
		System.out.println("" + num1 + " " + operator + " " + num2);
		
		sc.close();
		}

}
