package day5.practice;

import java.util.Scanner;

public class PrimeNumberEx {

	public static void main(String[] args) {
		//정수num을 입력받아 num가 소수인지 아닌지를 판별하는 코드를작성
		//소수: 약수가 1과 자기 자신밖에 없는 수
		//반복횟수 : i는 1부터 num까지 1씩증가
		//규칙성 : i가 num의 약수이면 약수의 개수 count를 1증가
		//-> num을 i로 나누었을때 나머지가 0과 같다면 약수의 개수 count를 1증가
		//반복문 종료후 : count가 2이면 소수라고 출력, 아니면 소수가 아님이라고 출력
		
		int num, i, count = 0;
		Scanner sc = new Scanner(System.in);
		
		//정수입력
		System.out.println("정수를 입력하세요 : ");
		num = sc.nextInt();
		//반복문 i는1부터 num까지 1씩증가
		i = 1;
		while(i <= num) {
			if(num % i == 0) {//i가 num의 약수이면 약수의 개수count를 1증가
				count++;	
			}
			++i;
		}
		if(count == 2) {
			System.out.println(num + " is a prime number");
		}else {
			System.out.println(num + " is not a prime number");
		}
		sc.close();
	}
}

