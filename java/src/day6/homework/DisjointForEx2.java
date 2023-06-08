package day6.homework;

import java.util.*;

public class DisjointForEx2 {

	public static void main(String[] args) {
		//두 정수를 입력받아 두 정수가 서로소 관계인지 판별하는 코드를 작성
		//서로소 최대 공약수가 1인 두수의 관계
		
		//반복 횟수 : i는 1부터 num1까지
		//규칙성 : i가 num1의 약수이고 i가 num2의 약수이면 i를 gcd에 저장.
		//		num1을 i로 나누었을때 나머지가 0과 같고
		//		num2를 i로 나누었을때 나머지가 0 과 같다면 
		//		i를 gcd에 저장.
		//반복문 종료 후 : gcd가 1이면 disjoint를 출력하고,
					//아니면 not disjoint를 출력
		
		//두 정수를 입력
		int num1, num2, i = 1;
		int gcd = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		//반복문 : i가 num1까지
		for( ; i <= num1; ++i) {
			//um1을 i로 나누었을때 나머지가(%연산자) 0과 같고(&&연산자) 
			//num2를 i로 나누었을때 나머지가 0 과 같다면 i를 gcd에 저장
			if(num1 % i == 0 && num2 % i == 0) {
				 gcd = i;
			}
			//i를 1증가
				
		}
		
		//gcd가 1이면 disjoint를 출력하고,아니면 not disjoint를 출력
		if(gcd == 1) {
			System.out.println("Disjoint!");
		}else {
			System.out.println("Not disjoint!");
		}
		
		sc.close();

	}

}
