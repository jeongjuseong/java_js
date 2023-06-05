package day5.practice;

import java.util.*;

public class DivisorEx {

	public static void main(String[] args) {
		//정수num을 입력받아 num의 약수를 구하는 코드를 작성하세요.
		//약수: a를 b로 나누었을때 나머지가 0이면 b는 a의 약수이다.
		//12약수: 1,2,3,4,6,12
		//반복횟수: i는 1부터 num까지 1씩증가
		//규칙성: i가 num의 약수이면 i를 출력 
		
		int num, i;
		Scanner sc = new Scanner(System.in);
		
		//정수입력
		System.out.println("정수를 입력하세요 : ");
		num = sc.nextInt();
		//반복문
		i = 1;
		while(i <= num) {
			
			//num을 i로 나누었을때 나머지가 0과 같다면 i를 출력
			if(num % i == 0) {
				System.out.println(i);
			}
			++i;
		}
		sc.close();

	}
	
}
